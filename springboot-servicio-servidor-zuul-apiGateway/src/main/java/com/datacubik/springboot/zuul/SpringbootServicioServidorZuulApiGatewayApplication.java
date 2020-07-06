package com.datacubik.springboot.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.datacubik.springboot.zuul.filters.*;

@EnableEurekaClient
@EnableZuulProxy
@SpringBootApplication
public class SpringbootServicioServidorZuulApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootServicioServidorZuulApiGatewayApplication.class, args);
	}
	
	@Bean
	public PreFilter preFilter() {
		return new PreFilter();
	}
	
	@Bean
	public PostFilter postFilter() {
		return new PostFilter();
	}

}
