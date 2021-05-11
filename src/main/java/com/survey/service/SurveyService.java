package com.survey.service;

import com.survey.dto.CustomUser;
import com.survey.dto.UserSurveyResponseDto;
import com.survey.dto.UserSurveyResponseItem;
import com.survey.model.UserSurveyResponse;
import com.survey.repository.SurveyRepository;
import com.survey.model.Survey;
import com.survey.dto.SurveyDto;
import com.survey.repository.UserSurveyResponseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service(value = "surveyService")
public class SurveyService {
    @Autowired
    private SurveyRepository surveyRepository;

    @Autowired
    private UserSurveyResponseRepository userSurveyResponseRepository;

    public Survey save(SurveyDto survey) {
        Survey newSurvey = new Survey();
        newSurvey.setSurveyTopic(survey.getSurveyTopic());
        return surveyRepository.save(newSurvey);
    }

    public List<Survey> getAll() {
        List<Survey> list = new ArrayList<>();

        CustomUser user = (CustomUser) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        surveyRepository.findAll().iterator().forEachRemaining(list::add);
        return list;
    }

    public UserSurveyResponse saveUserSurveyResponse(UserSurveyResponseDto userSurveyResponseDto) {
        CustomUser user = (CustomUser) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        UserSurveyResponse userSurveyResponse = new UserSurveyResponse();
        for (UserSurveyResponseItem item : userSurveyResponseDto.getUserSurveyResponseItems())
        {
            userSurveyResponse.setUser_Id(user.getId());
            userSurveyResponse.setSurvey_id(userSurveyResponseDto.getSurveyId());
            userSurveyResponse.setQuestion_id(item.getQuestion_id());
            userSurveyResponse.setOption_id(item.getOption_id());
            userSurveyResponseRepository.save(userSurveyResponse);
        }

        return userSurveyResponse;
    }

    public List<UserSurveyResponse> userSurveyResponseList(long userId) {
        return userSurveyResponseRepository.findByUserId(userId);
    }
}
