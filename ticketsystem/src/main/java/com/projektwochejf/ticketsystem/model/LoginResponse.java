package com.projektwochejf.ticketsystem.model;

public class LoginResponse {
    private Long userId;
    private String rolle;

    public LoginResponse(Long userId, String rolle) {
        this.userId = userId;
        this.rolle = rolle;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getRolle() {
        return rolle;
    }

    public void setRolle(String rolle) {
        this.rolle = rolle;
    }
}
