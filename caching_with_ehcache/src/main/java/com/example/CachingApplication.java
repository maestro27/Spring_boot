package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching  //Enables Spring's annotation-driven cache management capability
public class CachingApplication implements CommandLineRunner{

	@Autowired
	private WeatherProvider weatherProvider;
	
	public static void main(String[] args) {
		SpringApplication.run(CachingApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		for (int count=1; count<=7; count++){
			System.out.println(weatherProvider.getWeather("30360"));
			Thread.sleep(10000);
		}
	}
}
