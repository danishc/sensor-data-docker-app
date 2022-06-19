package com.example.sensor.data.server;

import com.example.sensor.data.model.OxygenLevel;
import com.example.sensor.data.model.Temperature;

import java.sql.Timestamp;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public enum Helper {
    INSTANCE;
    private Temperature temperature;
    private OxygenLevel oxygenLevel;

    Helper(){
        temperature = new Temperature();
        int randomNum;
        String temp_env_id = System.getenv("TEMP_SENSOR_ID");
        try{
            randomNum = Integer.valueOf(temp_env_id);
        }catch (NumberFormatException ex){
            randomNum = ThreadLocalRandom.current().nextInt(1, 100);
        }
        temperature.setId(randomNum);
        temperature.setStart_time(new Timestamp(System.currentTimeMillis()));
        temperature.setDescription("sensor desc.....");
        temperature.setName(temperature.getClass().getSimpleName());


        oxygenLevel = new OxygenLevel();
        String oxg_env_id= System.getenv("OXG_SENSOR_ID");
        try{
            randomNum = Integer.valueOf(oxg_env_id);
        }catch (NumberFormatException ex){
            randomNum = ThreadLocalRandom.current().nextInt(1, 100);
        }
        oxygenLevel.setId(randomNum);
        oxygenLevel.setStart_time(new Timestamp(System.currentTimeMillis()));
        oxygenLevel.setDescription("sensor desc.....");
        oxygenLevel.setName(oxygenLevel.getClass().getSimpleName());
    }

    public Temperature getTemperatureSensor(){
        return temperature;
    }

    public OxygenLevel getOxygenSensor(){
        return oxygenLevel;
    }
}
