package com.example.sensor.data.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

/**
 * Abstract class for any type of sensor component.
 * Each sensor should always extend this class
 */
public abstract class SensorComponent implements Serializable {

    private int id;

    private String name;

    private Timestamp start_time;

    private List<Record> records;

    SensorComponent(){
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Timestamp getStart_time() {
        return start_time;
    }

    public void setStart_time(Timestamp start_time) {
        this.start_time = start_time;
    }

    public List<Record> getRecords() {
        return records;
    }

    public void setRecords(List<Record> records) {
        this.records = records;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
