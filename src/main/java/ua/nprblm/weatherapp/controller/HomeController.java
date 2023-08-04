package ua.nprblm.weatherapp.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import ua.nprblm.weatherapp.model.weather.Weather;
import ua.nprblm.weatherapp.service.CastWeatherToWeatherResponseService;
import ua.nprblm.weatherapp.service.WeatherAPIService;
import ua.nprblm.weatherapp.util.CastJsonToWeather;

import java.io.IOException;
import java.util.Objects;

@Controller
@RequiredArgsConstructor
public class HomeController {

    private final WeatherAPIService weatherService;
    private final CastWeatherToWeatherResponseService castService;

    @GetMapping("/")
    public ModelAndView index(@Valid @RequestParam("city-name") String cityName) throws IOException {
        Weather weather = CastJsonToWeather.cast(weatherService.getWeatherJSON(cityName, "1"));

        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("weather", castService.cast(Objects.requireNonNull(weather)));

        return modelAndView;
    }
}

