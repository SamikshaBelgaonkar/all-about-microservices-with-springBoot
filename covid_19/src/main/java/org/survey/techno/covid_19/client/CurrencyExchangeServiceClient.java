package org.survey.techno.covid_19.client;

/*
 *   helps more in Ribbon understanding
 *   Zuul gateway understanding
 *   and feign understanding
 */

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.survey.techno.covid_19.entity.Survey;

//@FeignClient(name="currency-exchange-service",url="localhost:8001" ) //will work without Ribbon(not help in load balancing)
@FeignClient(name = "currency-exchange-service") // no need of mentioning url as we will be enabling multiple ports of
													// currency-exchange-service in order to achieve loadBalancing
//@FeignClient(name = "netflix-zuul-api-gateway-server") // this will make a way from zuul api gateway
@RibbonClient(name = "currency-exchange-service") // it will help in loadBalancing
@Component
public interface CurrencyExchangeServiceClient {

	@GetMapping("/currency-exchange/from/{from}/to/{to}") // for normal urls
	// @GetMapping("/currency-exchange-service/currency-exchange/from/{from}/to/{to}")
	// //this will take way from zuul gateway(ensure zuul component,
	// currency-exchange-service is up)
	public Survey retrieveCurrency(@PathVariable String from, @PathVariable String to);

}
