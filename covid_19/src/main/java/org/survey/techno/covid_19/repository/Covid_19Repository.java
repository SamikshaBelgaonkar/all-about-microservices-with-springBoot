package org.survey.techno.covid_19.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.survey.techno.covid_19.entity.Survey;

public interface Covid_19Repository extends JpaRepository<Survey, Long>{

}
