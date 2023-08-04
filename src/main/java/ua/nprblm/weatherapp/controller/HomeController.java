package ua.nprblm.weatherapp.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import ua.nprblm.weatherapp.model.weather.Weather;
import ua.nprblm.weatherapp.service.CastWeatherToWeatherResponseService;
import ua.nprblm.weatherapp.service.WeatherAPIService;
import ua.nprblm.weatherapp.util.CastJsonToWeather;

import java.util.Objects;

@Controller
@RequiredArgsConstructor
public class HomeController {

    private final WeatherAPIService weatherService;
    private final CastWeatherToWeatherResponseService castService;
    private final CastJsonToWeather castJsonToWeather;

    @GetMapping("/")
    public ModelAndView index() {
        return new ModelAndView("index");
    }

    @GetMapping("/forecast")
    public ModelAndView forecast(@RequestParam(name = "city") String city) {
        Weather weather = castJsonToWeather.cast(weatherService.getWeatherJSON(city
                .trim()
                .replaceAll(" ", "_"),
                "1"));

        ModelAndView modelAndView = new ModelAndView("forecast");
        modelAndView.addObject("weather", castService.cast(Objects.requireNonNull(weather)));

        return modelAndView;
    }
}