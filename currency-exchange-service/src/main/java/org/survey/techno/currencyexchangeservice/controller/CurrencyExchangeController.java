package org.survey.techno.currencyexchangeservice.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.survey.techno.currencyexchangeservice.model.ExchangeValue;
import org.survey.techno.currencyexchangeservice.repository.ExchangeCurrencyRepo;
import org.survey.techno.currencyexchangeservice.service.CurrencyExchangeService;

@RestController
public class CurrencyExchangeController {

	@Autowired
	private Environment env; // used just to fetch runtime port so that it will help to differentiate between
								// the microservices later.

	@Autowired
	private CurrencyExchangeService currencyExchangeService;
	@Autowired
	private ExchangeCurrencyRepo repository;

	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ExchangeValue retrieveCurrency(@PathVariable String from, @PathVariable String to) {

		ExchangeValue exchangeValue = currencyExchangeService.getCurrency(from, to);
		exchangeValue.setPort(Integer.parseInt(env.getProperty("local.server.port")));
		// ///picking the port from the environment(t will be runtime)
		System.out.println("RESPONSE" + exchangeValue);
		return exchangeValue;
	}
}
