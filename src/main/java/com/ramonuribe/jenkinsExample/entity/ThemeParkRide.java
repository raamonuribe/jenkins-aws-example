package com.ramonuribe.jenkinsExample.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ThemeParkRide {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private Integer thrillFactor;

    public ThemeParkRide(String name, String description, Integer thrillFactor) {
        this.name = name;
        this.description = description;
        this.thrillFactor = thrillFactor;
    }

    public ThemeParkRide() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getThrillFactor() {
        return thrillFactor;
    }

    public void setThrillFactor(Integer thrillFactor) {
        this.thrillFactor = thrillFactor;
    }
}
