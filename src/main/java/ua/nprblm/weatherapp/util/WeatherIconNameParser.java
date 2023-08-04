package ua.nprblm.weatherapp.util;

import ua.nprblm.weatherapp.model.weatherNamePicture.WeatherIconAndName;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WeatherIconNameParser {
    public static List<WeatherIconAndName> parse() throws IOException {
        List<WeatherIconAndName> weatherList = new ArrayList<>();

        File file = new File("src\\main\\resources\\static\\files\\weather.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String string;
        while ((string = br.readLine()) != null) {
            String[] weather = string.split(":");
            weatherList.add(new WeatherIconAndName(weather[0], weather[1], weather[2]));
        }
        return weatherList;
    }
}
