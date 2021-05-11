package com.survey.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.*;

@Entity(name = "user_roles")
public class UserRole {
    @Id
    @Column
    private long user_id;

    @Column
    private long role_id;

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    public long getRole_id() {
        return role_id;
    }

    public void setRole_id(long role_id) {
        this.role_id = role_id;
    }
}
