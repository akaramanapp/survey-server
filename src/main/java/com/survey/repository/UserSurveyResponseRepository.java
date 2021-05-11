package com.survey.repository;

import com.survey.model.UserRole;
import com.survey.model.UserSurveyResponse;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserSurveyResponseRepository extends CrudRepository<UserSurveyResponse, Long> {
    @Query(value = "SELECT * FROM user_survey_response WHERE user_id = ?1", nativeQuery = true)
    List<UserSurveyResponse> findByUserId(long userId);
}
