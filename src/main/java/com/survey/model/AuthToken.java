package com.survey.model;

import java.util.Set;

public class AuthToken {

    private String token;

    private Set<Role> role;

    public AuthToken(){

    }

    public AuthToken(String token, Set<Role> role){
        this.token = token;
        this.role = role;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Set<Role> getRole() {
        return role;
    }

    public void setRole(Set<Role> role) {
        this.role = role;
    }
}
