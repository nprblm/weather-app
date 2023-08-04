package ua.nprblm.weatherapp.service;

import org.springframework.stereotype.Service;
import ua.nprblm.weatherapp.model.weatherNamePicture.WeatherIconAndName;
import ua.nprblm.weatherapp.util.WeatherIconNameParser;

import java.io.IOException;
import java.util.List;

@Service
public class WeatherImageSearchService {
    public String findImageByWeatherName (String iconName) throws IOException {
        iconName = iconName
                .replaceAll("//cdn.weatherapi.com/weather/64x64/(day|night)/", "")
                .replaceAll(".png", "");
        List<WeatherIconAndName> list = WeatherIconNameParser.parse();

        for(WeatherIconAndName item : list)
        {
            if(item.getIconName().equalsIgnoreCase(iconName))
                return String.format("/images/weather-backgrounds/%s.jpg",item.getPictureName());
        }
        return "/images/weather-backgrounds/16.jpg";
    }
}
