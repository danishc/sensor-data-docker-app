package com.example.sensor.data.client;

import com.example.sensor.data.model.Temperature;

import java.io.IOException;
import java.lang.reflect.Type;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.sql.Timestamp;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;


public class Main {
    public static void main(String[] args) {
        try {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI("http://localhost:8001/sensor-data-server/api/sensor/temperature"))
                    .GET()
                    .build();
            HttpResponse<String> response = HttpClient.newBuilder()
                    .build()
                    .send(request, HttpResponse.BodyHandlers.ofString());

            // Deserialize the semText
            Gson gson = new GsonBuilder().create();
            Type type = new TypeToken<Temperature>() {}.getType();
            Temperature temperature = gson.fromJson(response.body(), type);
            System.out.println(temperature.getStart_time());

        } catch (URISyntaxException | IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}