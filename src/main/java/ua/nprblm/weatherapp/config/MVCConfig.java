package ua.nprblm.weatherapp.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

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

}