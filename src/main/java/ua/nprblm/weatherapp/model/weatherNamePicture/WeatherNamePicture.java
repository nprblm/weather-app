package ua.nprblm.weatherapp.model.weatherNamePicture;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class WeatherNamePicture {
    private String iconName;
    private String name;
    private String pictureName;

}
