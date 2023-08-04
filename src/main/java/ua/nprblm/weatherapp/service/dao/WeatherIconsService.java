package ua.nprblm.weatherapp.service.dao;

import ua.nprblm.weatherapp.model.weatherNamePicture.WeatherIconAndName;

public interface WeatherIconsService {

    WeatherIconAndName getByIconName (String iconName);
}
