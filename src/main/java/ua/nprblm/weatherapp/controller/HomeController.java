package ua.nprblm.weatherapp.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ua.nprblm.weatherapp.model.request.WeatherRequest;
import ua.nprblm.weatherapp.model.weather.Weather;
import ua.nprblm.weatherapp.service.WeatherAPIService;
import ua.nprblm.weatherapp.util.CastJsonToWeather;

@RestController
@RequiredArgsConstructor
public class HomeController {

    private final WeatherAPIService service;

    @PostMapping("/")
    public Weather index(@Valid @RequestBody WeatherRequest request) {
        Weather weather = CastJsonToWeather.cast(service.getWeatherJSON(request.getCity(), request.getDays()));
        return weather;
    }
}

