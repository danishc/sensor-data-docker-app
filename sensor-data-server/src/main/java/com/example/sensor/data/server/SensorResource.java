package com.example.sensor.data.server;

import com.example.sensor.data.model.Record;
import com.example.sensor.data.server.Helper;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.sql.Timestamp;
import java.util.Date;

@Path("/sensor")
public class SensorResource {

    @Path("/temperature")
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public Response getTempRecord() {
        System.out.println("api/sensor/temperature " + "called");

        try {
            Record record = new Record();
            record.setComponent(Helper.INSTANCE.getTemperatureSensor());
            record.setRecordTime(new Timestamp(System.currentTimeMillis()));
            record.setSensorValue(20);
            return Response.ok(record)
                    .build();
        } catch (Exception e) {
            return Response.status(403, e.toString())
                    .build();
        }
    }

    @Path("/oxygen")
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public Response getOxygenLevel() {
        System.out.println("api/sensor/oxygen " + "called");

        try {
            Record record = new Record();
            record.setComponent(Helper.INSTANCE.getOxygenSensor());
            record.setRecordTime(new Timestamp(System.currentTimeMillis()));
            record.setSensorValue(200);
            return Response.ok(record)
                    .build();
        } catch (Exception e) {
            return Response.status(403, e.toString())
                    .build();
        }
    }
}
