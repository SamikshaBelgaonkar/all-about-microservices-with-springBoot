package org.survey.techno.covid_19.service;

import java.util.List;
import java.util.Optional;

import org.survey.techno.covid_19.entity.Survey;


public interface SurveyService {
	public List<Survey> getAllData();
	public Optional<Survey> getSurveyRecordById(long id);
	public Survey addSurveyRecord(Survey survey);
	public void updateSurveyRecord(Survey survey);
	

}
