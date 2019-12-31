package com.example.springeurekaclientsideloadbalancing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
@SpringBootApplication
public class SpringEurekaClientSideLoadBalancingApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringEurekaClientSideLoadBalancingApplication.class, args);
	}
	@Bean
	public  Client  client()
	{
		return  new Client();
	}
}
