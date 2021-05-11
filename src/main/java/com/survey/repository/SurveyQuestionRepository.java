package com.survey.repository;

import com.survey.model.SurveyQuestion;
import com.survey.model.UserRole;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SurveyQuestionRepository extends CrudRepository<SurveyQuestion, Long> {

}
