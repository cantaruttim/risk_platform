package br.com.cantarutti.ms_credit_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MsCreditServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsCreditServiceApplication.class, args);
	}

}
