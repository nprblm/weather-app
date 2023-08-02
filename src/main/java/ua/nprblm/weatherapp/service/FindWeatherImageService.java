package ua.nprblm.weatherapp.service;

import org.springframework.stereotype.Service;
import ua.nprblm.weatherapp.model.weatherNamePicture.WeatherNamePicture;
import ua.nprblm.weatherapp.util.WeatherNamePictureParser;

import java.io.IOException;
import java.util.List;

@Service
public class FindWeatherImageService {
    public String findImageByWeatherName (String iconName) throws IOException {
        List<WeatherNamePicture> list = WeatherNamePictureParser.parse();
        for(WeatherNamePicture item : list)
        {
            if(item.getIconName().equalsIgnoreCase(iconName))
                return String.format("/images/weather-backgrounds/%s.jpg",item.getPictureName());
        }
        return null;
    }
}
