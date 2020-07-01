package com.datacubit.springboot.estudiante;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SpringbootServicioEstudianteApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootServicioEstudianteApplication.class, args);
	}

}
