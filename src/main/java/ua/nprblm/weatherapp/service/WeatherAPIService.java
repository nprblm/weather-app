package ua.nprblm.weatherapp.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Service
@RequiredArgsConstructor
public class WeatherAPIService {

    @Value("${x.rapid.api.key}")
    private String XRapidAPIKey;

    @Value("${x.rapid.api.host}")
    private String XRapidAPIHost;

    public String getWeatherJSON (String city, String days)
    {
        String requestString = String.format("https://weatherapi-com.p.rapidapi.com/forecast.json?q=%s&days=%s", city, days);
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(requestString))
                .header("X-RapidAPI-Key", XRapidAPIKey)
                .header("X-RapidAPI-Host", XRapidAPIHost)
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response;
        try {
            response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
        return response.body();
    }
}
