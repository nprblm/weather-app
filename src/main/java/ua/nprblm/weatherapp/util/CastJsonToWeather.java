package ua.nprblm.weatherapp.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.apache.commons.logging.Log;
import ua.nprblm.weatherapp.model.weather.Weather;

@RequiredArgsConstructor
public class CastJsonToWeather {
    private final Log log;

    public Weather cast(String json)
    {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.readValue(json, Weather.class);
        } catch (Exception e) {
            e.printStackTrace();
            log.error(e.getMessage());
            return null;
        }
    }
}
