package com.cyclingapp.cyclingservice.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.cyclingapp.cyclingservice.converter.CountryDTOConverter;
import com.cyclingapp.cyclingservice.converter.DivisionDTOConverter;

@Configuration
public class WebConfiguration implements WebMvcConfigurer {

    @Override
    public void addFormatters(FormatterRegistry registry) {
    	registry.addConverter(new CountryDTOConverter());
    	registry.addConverter(new DivisionDTOConverter());
    }
}
