package ua.nprblm.weatherapp.service.dao;

import ua.nprblm.weatherapp.model.weatherNamePicture.WeatherIconAndName;

public interface WeatherIconsService {
    void save(WeatherIconAndName item);

    WeatherIconAndName getByIconName (String iconName);
}
