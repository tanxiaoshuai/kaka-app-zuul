package com.sobey;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class KakaAppZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(KakaAppZuulApplication.class, args);
	}
}
