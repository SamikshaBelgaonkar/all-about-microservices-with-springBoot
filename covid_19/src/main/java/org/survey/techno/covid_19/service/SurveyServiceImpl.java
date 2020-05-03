package org.survey.techno.covid_19.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.survey.techno.covid_19.entity.Survey;
import org.survey.techno.covid_19.repository.Covid_19Repository;

@Service
public class SurveyServiceImpl implements SurveyService {
	@Autowired
	private Covid_19Repository repo;

	@Override
	public List<Survey> getAllData() {
		return repo.findAll();
	}

	@Override
	public Optional<Survey> getSurveyRecordById(long id) {
		return repo.findById(id);
	}

	@Override
	public Survey addSurveyRecord(Survey survey) {
		Survey surveyresp = repo.save(survey);
		return surveyresp;
	}

	@Override
	public void updateSurveyRecord(Survey survey) {
		// TODO Auto-generated method stub
		// yet to be implemented
	}

}
