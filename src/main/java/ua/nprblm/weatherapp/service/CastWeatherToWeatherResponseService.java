package ua.nprblm.weatherapp.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ua.nprblm.weatherapp.model.response.WeatherDaily;
import ua.nprblm.weatherapp.model.response.WeatherHourly;
import ua.nprblm.weatherapp.model.response.WeatherResponse;
import ua.nprblm.weatherapp.model.weather.Forecastday;
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
        List<WeatherDaily> dailyList = new ArrayList<>();

        for(Forecastday dayInfo : weather.getForecast().getForecastday())
        {
            List<WeatherHourly> hourlyList = new ArrayList<>();

            for (Hour hourInfo : dayInfo.getHour()) {
                if (hourInfo.getTimeEpoch() > weather.getLocation().getLocaltimeEpoch()) {
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
            dailyList.add(new WeatherDaily(dayInfo.getDate().split(" ")[0], hourlyList));
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
                dailyList
        );
    }

}
