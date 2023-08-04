package ua.nprblm.weatherapp.service.dao;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ua.nprblm.weatherapp.model.weatherNamePicture.WeatherIconAndName;
import ua.nprblm.weatherapp.repository.WeatherRepository;

@Service
@RequiredArgsConstructor
public class WeatherIconsServiceImpl implements WeatherIconsService {

    private final WeatherRepository weatherRepository;

    @Override
    public void save(WeatherIconAndName item) {
        if (item != null)
            weatherRepository.save(item);
    }

    @Override
    public WeatherIconAndName getByIconName(String iconName) {
        return weatherRepository.findByIconName(iconName);
    }
}
