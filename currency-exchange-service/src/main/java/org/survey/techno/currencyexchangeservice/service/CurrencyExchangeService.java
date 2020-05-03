package org.survey.techno.currencyexchangeservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.survey.techno.currencyexchangeservice.model.ExchangeValue;
import org.survey.techno.currencyexchangeservice.repository.ExchangeCurrencyRepo;

@Service
public class CurrencyExchangeService {

	@Autowired
	private ExchangeCurrencyRepo repo;

	public ExchangeValue getCurrency(String from, String to) {
		ExchangeValue exchangeValue = repo.findByFromAndTo(from, to);
		System.out.println("ResponseIn service" + exchangeValue.toString());
		return exchangeValue;
	}

}
