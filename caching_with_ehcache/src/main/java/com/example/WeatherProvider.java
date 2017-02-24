package com.example;

import org.springframework.stereotype.Component;
import java.util.Random;

import javax.cache.annotation.CacheResult;

@Component
public class WeatherProvider {
	
	@CacheResult(cacheName="weatherInfo")
	public String getWeather(String zipcode) {
		int temp = 20 + new Random().nextInt(80);
		int humidity = new Random().nextInt(100);
		return String.format("Current temperature %1$d and humidity of %2$d", temp, humidity);
	}

}
