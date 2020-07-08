package com.datacubit.springboot.hystrixDashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableHystrixDashboard
@SpringBootApplication
public class SpringbootServicioHystrixDashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootServicioHystrixDashboardApplication.class, args);
	}

}
