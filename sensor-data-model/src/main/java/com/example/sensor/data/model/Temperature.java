package com.example.sensor.data.model;

import java.io.Serializable;

/**
 * Serializable sensor component class for the room temperature
 */
public class Temperature extends SensorComponent implements Serializable {

    private String description;

    public Temperature() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
