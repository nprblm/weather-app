package ua.nprblm.weatherapp.service;

import lombok.RequiredArgsConstructor;
import org.apache.commons.logging.Log;
import org.springframework.stereotype.Service;
import ua.nprblm.weatherapp.model.weather.Hour;
import ua.nprblm.weatherapp.model.weather.Weather;
import ua.nprblm.weatherapp.service.dao.WeatherIconsService;

@Service
@RequiredArgsConstructor
public class WeatherImageSearchService {
    private final WeatherIconsService service;

    public Weather findImageByWeatherName(Weather weather) {
        String icon = weather.getCurrent().getCondition().getIcon();
        weather.getCurrent().getCondition()
                .setIcon(String.format("/images/weather-backgrounds/%s.jpg", findImage(icon)));

        for (Hour hour : weather.getForecast().getForecastday().get(0).getHour()) {
            icon = hour.getCondition().getIcon();
            hour.getCondition()
                    .setIcon(String.format("/images/weather-backgrounds/%s.jpg", findImage(icon)));
        }

        return weather;
    }

    private String findImage(String iconName) {
        return service.getByIconName(normalizeIconName(iconName));
    }

    private String normalizeIconName(String iconName) {
        return iconName
                .replaceAll("//cdn.weatherapi.com/weather/64x64/(day|night)/", "")
                .replaceAll(".png", "");
    }
}
