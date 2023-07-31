package ua.nprblm.weatherapp.model.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class WeatherRequest {
    private String city;
    private String days;

    // Getters and setters
}
