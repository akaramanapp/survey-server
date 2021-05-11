package com.survey.model;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "survey")
public class Survey {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;

    @Column(name = "survey_topic")
    private String surveyTopic;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "SURVEY_QUESTION", joinColumns = {
            @JoinColumn(name = "SURVEY_ID") }, inverseJoinColumns = {
            @JoinColumn(name = "QUESTION_ID") })
    private Set<Question> questions;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSurveyTopic() {
        return surveyTopic;
    }

    public void setSurveyTopic(String surveyTopic) {
        this.surveyTopic = surveyTopic;
    }

    public Set<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(Set<Role> roles) {
        this.questions = questions;
    }
}
