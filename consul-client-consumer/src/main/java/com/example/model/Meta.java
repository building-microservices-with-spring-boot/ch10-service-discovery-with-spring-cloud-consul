package com.example.model;


import java.time.LocalDateTime;

public class Meta {
    private String name;
    private LocalDateTime time;

    public Meta() {
    }

    public Meta(String name) {
        this.name = name;
        this.time = LocalDateTime.now();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }
}
