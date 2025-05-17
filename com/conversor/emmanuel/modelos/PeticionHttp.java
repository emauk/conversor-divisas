package com.conversor.emmanuel.modelos;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class PeticionHttp {


    public static String ObtenerJson(String divisa) throws IOException, InterruptedException {
        String direccionXchange= "https://v6.exchangerate-api.com/v6/2e4af035fda32b2e6c763b01/latest/"+divisa;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccionXchange))
                .build();
        HttpResponse<String> response =
                client.send(request, HttpResponse.BodyHandlers.ofString());

        return response.body();
    }
}
