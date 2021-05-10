package com.The360company.portfolio.coronainfo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SpringBootCoronaInfoIdApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCoronaInfoIdApplication.class, args);
	}

	// define bean for RestTemplate ... this is used to make client REST calls
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
