package com.example.sensor.data.model;


import java.io.Serializable;

/**
 * Serializable sensor component class for moisture in the atmosphere
 */
public class Moisture extends SensorComponent implements Serializable {

    private int description;

    public Moisture() {
    }

    public int getDescription() {
        return description;
    }

    public void setDescription(int description) {
        this.description = description;
    }
}