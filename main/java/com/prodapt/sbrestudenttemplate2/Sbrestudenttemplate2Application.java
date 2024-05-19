package com.prodapt.sbrestudenttemplate2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class Sbrestudenttemplate2Application {

	public static void main(String[] args) {
		SpringApplication.run(Sbrestudenttemplate2Application.class, args);
	}

	
    @Bean
    public WebClient  getWebClient(){
		return WebClient.create();
	}

}
