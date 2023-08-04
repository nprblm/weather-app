package ua.nprblm.weatherapp.model.weatherNamePicture;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "weather_icon")
public class WeatherIconAndName {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Setter(AccessLevel.NONE)
    private Long id;
    private String iconName;
    private String name;
    private String pictureName;
}
