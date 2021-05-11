package com.survey.dto;

public class QuestionDto {
    private long survey_id;

    private String question_title;

    public long getSurvey_id() {
        return survey_id;
    }

    public void setSurvey_id(long survey_id) {
        this.survey_id = survey_id;
    }

    public String getQuestion_title() {
        return question_title;
    }

    public void setQuestion_title(String question_title) {
        this.question_title = question_title;
    }
}
