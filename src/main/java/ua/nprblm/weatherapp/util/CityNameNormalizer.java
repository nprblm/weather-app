package ua.nprblm.weatherapp.util;

public class CityNameNormalizer {

    public static String normalize(String cityName)
    {
        return cityName.trim().replaceAll(" ", "_");
    }
}
