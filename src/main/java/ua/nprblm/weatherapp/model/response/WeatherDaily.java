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
public class WeatherDaily {
    private String datetime;
    private List<WeatherHourly> weatherHourlyList;
}
