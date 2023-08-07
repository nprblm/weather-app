package ua.nprblm.weatherapp.service.dao;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ua.nprblm.weatherapp.repository.WeatherRepository;

@Service
@RequiredArgsConstructor
public class WeatherIconsServiceImpl implements WeatherIconsService {

    private final WeatherRepository weatherRepository;

    @Override
    public String getByIconName(String iconName) {
        return weatherRepository.findByIconName(iconName).getPictureName();
    }
}
