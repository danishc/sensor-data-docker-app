package com.example.sensor.data.model;

import java.io.Serializable;
import java.sql.Timestamp;

public class Record implements Serializable {

    private int sensorValue;
    private SensorComponent component;
    private Timestamp recordTime;

    public Record(){

    }

    public int getSensorValue() {
        return sensorValue;
    }

    public void setSensorValue(int sensorValue) {
        this.sensorValue = sensorValue;
    }

    public Timestamp getRecordTime() {
        return recordTime;
    }

    public void setRecordTime(Timestamp recordTime) {
        this.recordTime = recordTime;
    }


    public SensorComponent getComponent() {
        return component;
    }

    public void setComponent(SensorComponent component) {
        this.component = component;
    }
}
