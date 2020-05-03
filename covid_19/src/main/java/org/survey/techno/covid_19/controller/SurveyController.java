package org.survey.techno.covid_19.controller;

import java.math.BigDecimal;
import java.net.URI;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.survey.techno.covid_19.client.CurrencyExchangeServiceClient;
import org.survey.techno.covid_19.entity.Survey;
import org.survey.techno.covid_19.exceptions.GlobalException;
import org.survey.techno.covid_19.service.SurveyServiceImpl;

@RestController
public class SurveyController {

	private SurveyServiceImpl surveyService;
	private CurrencyExchangeServiceClient cxsClient;

	@Autowired
	public SurveyController(SurveyServiceImpl surveyService, CurrencyExchangeServiceClient cxsClient) {
		this.surveyService = surveyService;
		this.cxsClient = cxsClient;
	}

	@GetMapping("getData-WithConvertedCurrency-feign/from/{from}/to/{to}/quantity/{quantity}")
	public Survey getAllData(@PathVariable String from, @PathVariable String to, @PathVariable BigDecimal quantity) {
		Survey surveyResponse = cxsClient.retrieveCurrency(from, to);
		return new Survey(surveyResponse.getId(), from, to, quantity, surveyResponse.getConversionMultiple(),
				quantity.multiply(surveyResponse.getConversionMultiple()), surveyResponse.getPort());
	}

	@GetMapping("/api/data")
	public List<Survey> getAllDataRecorded() {
		return surveyService.getAllData();
	}

	@GetMapping("/api/data/{id}")
	public Optional<Survey> getEmployeeById(@PathVariable long id) {
		Optional<Survey> survey = surveyService.getSurveyRecordById(id);
		if (survey == null)
			try {
				throw new GlobalException("id" + id);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return survey;
	}

	@PostMapping("/api/addData")
	public ResponseEntity<Void> addSurvey(@Valid @RequestBody Survey survey) {
		Survey surveyResponse = surveyService.addSurveyRecord(survey);
		// enhancing post request to return correct HTTP status(201,CREATED) and show
		// the location(uri) where it is created
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(surveyResponse.getId()).toUri();
		return ResponseEntity.created(location).build();
	}

}
