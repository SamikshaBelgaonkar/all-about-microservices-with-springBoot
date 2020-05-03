package org.survey.techno.currencyexchangeservice;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.survey.techno.currencyexchangeservice.model.ExchangeValue;
import org.survey.techno.currencyexchangeservice.repository.ExchangeCurrencyRepo;

@SpringBootApplication
@EnableDiscoveryClient
public class CurrencyExchangeServiceApplication implements CommandLineRunner {

	@Autowired
	private ExchangeCurrencyRepo repository;
	public static void main(String[] args) {
		SpringApplication.run(CurrencyExchangeServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		repository.save(new ExchangeValue(1L, "USD", "INR", BigDecimal.valueOf(85)));
		repository.save(new ExchangeValue(2L, "ESD", "INR", BigDecimal.valueOf(75)));
		repository.save(new ExchangeValue(3L, "AUD", "INR", BigDecimal.valueOf(65)));

		
	}

}
