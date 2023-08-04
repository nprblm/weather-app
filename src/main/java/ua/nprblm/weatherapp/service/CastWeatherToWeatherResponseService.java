package ua.nprblm.weatherapp.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ua.nprblm.weatherapp.model.response.WeatherHourly;
import ua.nprblm.weatherapp.model.response.WeatherResponse;
import ua.nprblm.weatherapp.model.weather.Hour;
import ua.nprblm.weatherapp.model.weather.Weather;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CastWeatherToWeatherResponseService {

    private final WeatherImageSearchService weatherImageSearchService;

    public WeatherResponse cast(Weather weather) throws IOException {
        List<WeatherHourly> hourlyList = new ArrayList<>();
        int timeNow = Integer.parseInt(weather.getLocation().getLocaltime().split(" ")[1].substring(0, 2));

        for (Hour hourInfo : weather.getForecast().getForecastday().get(0).getHour()) {
            int time = Integer.parseInt(hourInfo.getTime().split(" ")[1].substring(0, 2));
            if (time > timeNow) {
                hourlyList.add(new WeatherHourly(
                        hourInfo.getTime().split(" ")[1],
                        hourInfo.getTempC(),
                        hourInfo.getWindKph(),
                        hourInfo.getPrecipMm(),
                        hourInfo.getHumidity(),
                        hourInfo.getCondition().getText(),
                        weatherImageSearchService.findImageByWeatherName(hourInfo.getCondition().getIcon())
                ));
            }
        }

        return new WeatherResponse(
                weather.getLocation().getName() + ", " + weather.getLocation().getCountry(),
                weather.getLocation().getLocaltime(),
                weather.getCurrent().getTempC(),
                weather.getCurrent().getFeelslikeC(),
                weather.getCurrent().getWindKph(),
                weather.getCurrent().getPrecipMm(),
                weather.getCurrent().getHumidity(),
                weather.getCurrent().getCondition().getText(),
                weatherImageSearchService.findImageByWeatherName(weather.getCurrent().getCondition().getIcon()),
                hourlyList
        );
    }

}
