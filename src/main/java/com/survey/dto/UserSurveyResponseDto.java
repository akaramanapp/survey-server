package com.survey.dto;


import java.util.List;

public class UserSurveyResponseDto {
    private long surveyId;

    private List<UserSurveyResponseItem> userSurveyResponseItems;

    public long getSurveyId() {
        return surveyId;
    }

    public void setSurveyId(long surveyId) {
        this.surveyId = surveyId;
    }

    public List<UserSurveyResponseItem> getUserSurveyResponseItems() {
        return userSurveyResponseItems;
    }

    public void setUserSurveyResponseItems(List<UserSurveyResponseItem> userSurveyResponseItems) {
        this.userSurveyResponseItems = userSurveyResponseItems;
    }
}


