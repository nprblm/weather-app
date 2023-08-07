package ua.nprblm.weatherapp.controller;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import ua.nprblm.weatherapp.model.weather.Weather;
import ua.nprblm.weatherapp.service.WeatherAPIService;
import ua.nprblm.weatherapp.service.WeatherImageSearchService;
import ua.nprblm.weatherapp.util.CastJsonToWeather;
import ua.nprblm.weatherapp.util.CityNameNormalizer;

@Controller
@RequiredArgsConstructor
public class HomeController {

    private final WeatherAPIService weatherService;
    private final CastJsonToWeather castJsonToWeather;
    private final WeatherImageSearchService imageSearchService;

    @GetMapping("/")
    public ModelAndView index() {
        return new ModelAndView("index");
    }

    @GetMapping("/forecast")
    public ModelAndView forecast(@Valid @NotNull @RequestParam(name = "city") String city) {
        String weatherJSON = weatherService.getWeatherJSON(CityNameNormalizer.normalize(city), "1");
        Weather weather = castJsonToWeather.cast(weatherJSON);

        ModelAndView modelAndView = new ModelAndView("forecast");
        modelAndView.addObject("weather", imageSearchService.findImageByWeatherName(weather));

        return modelAndView;
    }
}