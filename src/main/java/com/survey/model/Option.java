package com.survey.model;

import javax.persistence.*;

@Entity(name = "options")
public class Option {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;

    @Column
    private String option_title;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getOption_title() {
        return option_title;
    }

    public void setOption_title(String option_title) {
        this.option_title = option_title;
    }
}
