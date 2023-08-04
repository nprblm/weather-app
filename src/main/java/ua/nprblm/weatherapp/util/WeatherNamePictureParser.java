package ua.nprblm.weatherapp.util;

import ua.nprblm.weatherapp.model.weatherNamePicture.CastWeatherNameToPicture;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WeatherNamePictureParser {
    public static List<CastWeatherNameToPicture> parse() throws IOException {
        List<CastWeatherNameToPicture> weatherList = new ArrayList<>();

        File file = new File("src\\main\\resources\\static\\files\\weather.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String string;
        while ((string = br.readLine()) != null) {
            String[] weather = string.split(":");
            weatherList.add(new CastWeatherNameToPicture(weather[0], weather[1], weather[2]));
        }
        return weatherList;
    }
}
