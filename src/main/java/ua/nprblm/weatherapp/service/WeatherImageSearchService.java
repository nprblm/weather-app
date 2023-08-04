package ua.nprblm.weatherapp.service;

import org.springframework.stereotype.Service;
import ua.nprblm.weatherapp.model.weatherNamePicture.CastWeatherNameToPicture;
import ua.nprblm.weatherapp.util.WeatherNamePictureParser;

import java.io.IOException;
import java.util.List;

@Service
public class WeatherImageSearchService {
    public String findImageByWeatherName (String iconName) throws IOException {
        iconName = iconName
                .replaceAll("//cdn.weatherapi.com/weather/64x64/(day|night)/", "")
                .replaceAll(".png", "");
        List<CastWeatherNameToPicture> list = WeatherNamePictureParser.parse();

        for(CastWeatherNameToPicture item : list)
        {
            if(item.getIconName().equalsIgnoreCase(iconName))
                return String.format("/images/weather-backgrounds/%s.jpg",item.getPictureName());
        }
        return "/images/weather-backgrounds/16.jpg";
    }
}
