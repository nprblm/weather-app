package ua.nprblm.weatherapp.util;

import ua.nprblm.weatherapp.model.weatherNamePicture.WeatherNamePicture;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WeatherNamePictureParser {
    public static List<WeatherNamePicture> parse() throws IOException {
        List<WeatherNamePicture> weatherList = new ArrayList<>();

        File file = new File("src\\main\\resources\\static\\files\\weather.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String string;
        while ((string = br.readLine()) != null) {
            String[] weather = string.split(":");
            weatherList.add(new WeatherNamePicture(weather[0], weather[1], weather[2]));
        }
        return weatherList;
    }
}
