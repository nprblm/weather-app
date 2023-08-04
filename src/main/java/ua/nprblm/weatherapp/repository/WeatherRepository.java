package ua.nprblm.weatherapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.nprblm.weatherapp.model.weatherNamePicture.WeatherIconAndName;

@Repository
public interface WeatherRepository extends JpaRepository<WeatherIconAndName, Long> {
    WeatherIconAndName findByIconName(String iconName);
}
