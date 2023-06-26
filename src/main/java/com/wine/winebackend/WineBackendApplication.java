package com.wine.winebackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class WineBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(WineBackendApplication.class, args);
	}

}
