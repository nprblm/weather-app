package ua.nprblm.weatherapp.model.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class WeatherHourly {
    private String time;
    private double temperatureC;
    private double windSpeed;
    private double precipitation;
    private int humidity;
    private String weatherName;
    private String backgroundImageURL;
}
