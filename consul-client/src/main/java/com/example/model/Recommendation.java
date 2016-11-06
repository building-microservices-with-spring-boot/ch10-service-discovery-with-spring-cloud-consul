package com.example.model;

import java.util.List;

public class Recommendation {

    private Meta meta;
    private List<Artist> recommendations;


    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public List<Artist> getRecommendations() {
        return recommendations;
    }

    public void setRecommendations(List<Artist> recommendations) {
        this.recommendations = recommendations;
    }
}
