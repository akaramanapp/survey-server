package com.survey.model;

import javax.persistence.*;

@Entity(name = "user_survey_response")
public class UserSurveyResponse {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;

    @Column
    private long user_Id;

    @Column
    private long survey_id;

    @Column
    private long question_id;

    @Column
    private long option_id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUser_Id() {
        return user_Id;
    }

    public void setUser_Id(long user_Id) {
        this.user_Id = user_Id;
    }

    public long getSurvey_id() {
        return survey_id;
    }

    public void setSurvey_id(long survey_id) {
        this.survey_id = survey_id;
    }

    public long getQuestion_id() {
        return question_id;
    }

    public void setQuestion_id(long question_id) {
        this.question_id = question_id;
    }

    public long getOption_id() {
        return option_id;
    }

    public void setOption_id(long option_id) {
        this.option_id = option_id;
    }
}
