package ua.nprblm.weatherapp.config;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import ua.nprblm.weatherapp.WeatherAppApplication;
import ua.nprblm.weatherapp.util.CastJsonToWeather;

@Configuration
@EnableWebMvc
public class MVCConfig implements WebMvcConfigurer {
    @Override
    @SuppressWarnings("NullableProblems")
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        WebMvcConfigurer.super.addResourceHandlers(registry);
        registry
                .addResourceHandler("/static/styles/**")
                .addResourceLocations("classpath:/static/styles/");
        registry
                .addResourceHandler("/images/**")
                .addResourceLocations("classpath:/static/images/");
        registry
                .addResourceHandler("/js/**")
                .addResourceLocations("classpath:/static/js/");
        registry
                .addResourceHandler("/fonts/**")
                .addResourceLocations("classpath:/static/fonts/");
    }

    @Bean
    public Log getLog() {
        return LogFactory.getLog(WeatherAppApplication.class.getName());
    }

    @Bean
    public CastJsonToWeather getCastJsonToWeather() {
        return new CastJsonToWeather(getLog());
    }

}