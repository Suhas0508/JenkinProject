package com.project.teamplayer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class TeamPlayerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TeamPlayerApplication.class, args);
	}

}
