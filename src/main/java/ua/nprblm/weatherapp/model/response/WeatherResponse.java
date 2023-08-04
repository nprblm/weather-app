package ua.nprblm.weatherapp.model.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class WeatherResponse {
    private String location;
    private String datetime;
    private double temperatureC;
    private double feelsLikeC;
    private double windSpeed;
    private double precipitation;
    private int humidity;
    private String weatherName;
    private String backgroundImageURL;
    private List<WeatherHourly> weatherHourliesList;
}
