package com.survey.model;

import javax.persistence.*;

@Entity(name = "survey_question")
public class SurveyQuestion {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;

    @Column
    private long survey_id;

    @Column
    private long question_id;

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
}
