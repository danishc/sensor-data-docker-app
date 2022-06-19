package com.example.sensor.data.model;

import java.io.Serializable;

/**
 * Serializable sensor component class for oxygen level in the atmosphere
 */
public class OxygenLevel extends SensorComponent implements Serializable {

    private String description;

    public OxygenLevel() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}