package com.user.model;

import java.io.Serializable;

public class AuthenticationResponse implements Serializable {
    private String jwt;

    public AuthenticationResponse() {

    }

    public AuthenticationResponse(String jwt) {
        super();
        this.jwt = jwt;
    }

    public String getJwt() {
        return jwt;
    }

    public void setJwt(String jwt) {
        this.jwt = jwt;
    }
}
