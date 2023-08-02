package ua.nprblm.weatherapp.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import ua.nprblm.weatherapp.model.weather.Weather;
import ua.nprblm.weatherapp.service.FindWeatherImageService;
import ua.nprblm.weatherapp.service.WeatherAPIService;
import ua.nprblm.weatherapp.util.CastJsonToWeather;

import java.io.IOException;

@Controller
@RequiredArgsConstructor
public class HomeController {

    private final WeatherAPIService weatherAPIService;
    private final FindWeatherImageService findWeatherImageService;
    private final String DONT_FIND_IMAGE = "/images/weather-backgrounds/16.jpg";

    @GetMapping("/")
    public ModelAndView index(@Valid @RequestParam("city-name") String cityName) throws IOException {
        Weather weather = CastJsonToWeather.cast(weatherAPIService.getWeatherJSON(cityName, "1"));
        String imageName = findWeatherImageService.findImageByWeatherName(weather.getCurrent().getCondition().getIcon()
                .replaceAll("//cdn.weatherapi.com/weather/64x64/(day|night)/", "")
                .replaceAll(".png",""));

        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("weather", weather);
        modelAndView.addObject("image", imageName == null ? DONT_FIND_IMAGE : imageName);

        return modelAndView;
    }
}

