package com.example.controller;

import com.example.model.Recommendation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    DiscoveryClient discoveryClient;

    @RequestMapping("/service-instances/{serviceName}")
    public List<ServiceInstance> getServiceInstances(@PathVariable String serviceName){
        return discoveryClient.getInstances(serviceName);
    }

    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/my-recommendations")
    public Recommendation get() {
        return this.restTemplate.getForObject("http://reco-engine/recommendations", Recommendation.class);
    }

}
