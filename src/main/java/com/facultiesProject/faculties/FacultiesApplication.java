package com.facultiesProject.faculties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication()
public class FacultiesApplication {

	public static void main(String[] args) {
		SpringApplication.run(FacultiesApplication.class, args);
	}

}
