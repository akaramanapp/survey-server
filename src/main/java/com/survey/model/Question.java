package com.survey.model;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "question")
public class Question {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;

    @Column
    private String question_title;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "QUESTION_OPTIONS", joinColumns = {
            @JoinColumn(name = "QUESTION_ID") }, inverseJoinColumns = {
            @JoinColumn(name = "OPTION_ID") })
    private Set<Option> options;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getQuestion_title() {
        return question_title;
    }

    public void setQuestion_title(String question_title) {
        this.question_title = question_title;
    }

    public Set<Option> getOptions() {
        return options;
    }

    public void setOptions(Set<Option> options) {
        this.options = options;
    }
}
