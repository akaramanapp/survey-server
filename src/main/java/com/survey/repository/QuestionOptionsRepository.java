package com.survey.repository;

import com.survey.model.QuestionOptions;
import com.survey.model.SurveyQuestion;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionOptionsRepository extends CrudRepository<QuestionOptions, Long> {

}
