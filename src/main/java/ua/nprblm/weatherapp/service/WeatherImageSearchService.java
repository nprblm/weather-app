package ua.nprblm.weatherapp.service;

import lombok.RequiredArgsConstructor;
import org.apache.commons.logging.Log;
import org.springframework.stereotype.Service;
import ua.nprblm.weatherapp.model.weatherNamePicture.WeatherIconAndName;
import ua.nprblm.weatherapp.service.dao.WeatherIconsService;

@Service
@RequiredArgsConstructor
public class WeatherImageSearchService {
    private final WeatherIconsService service;
    private final Log log;

    public String findImageByWeatherName(String iconName) {
        iconName = iconName
                .replaceAll("//cdn.weatherapi.com/weather/64x64/(day|night)/", "")
                .replaceAll(".png", "");
        WeatherIconAndName returnValue = service.getByIconName(iconName);
        if (returnValue != null) {
            return String.format("/images/weather-backgrounds/%s.jpg", returnValue.getPictureName());
        } else {
            log.error(String.format("Don`t find image for weather with iconName = %s", iconName));
            return "/images/weather-backgrounds/16.jpg";
        }
    }
}
