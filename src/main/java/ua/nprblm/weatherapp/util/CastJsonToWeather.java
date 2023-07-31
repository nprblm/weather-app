package ua.nprblm.weatherapp.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import ua.nprblm.weatherapp.model.weather.Weather;

public class CastJsonToWeather {

    public static Weather cast(String json)
    {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.readValue(json, Weather.class);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
