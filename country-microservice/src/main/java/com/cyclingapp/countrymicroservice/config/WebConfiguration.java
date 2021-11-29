package com.cyclingapp.countrymicroservice.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.cyclingapp.countrymicroservice.converter.CountryDTOConverter;

@Configuration
public class WebConfiguration implements WebMvcConfigurer {
	
    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(new CountryDTOConverter());
    }

}