package com.datacubit.springboot.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableEurekaClient
@EnableZuulProxy
@SpringBootApplication
public class SpringbootServicioServidorZuulApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootServicioServidorZuulApiGatewayApplication.class, args);
	}

}
