package org.survey.techno.currencyexchangeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.survey.techno.currencyexchangeservice.model.ExchangeValue;

//@Repository
public interface ExchangeCurrencyRepo extends JpaRepository<ExchangeValue, Long> {
	ExchangeValue findByFromAndTo(String from, String to);
}