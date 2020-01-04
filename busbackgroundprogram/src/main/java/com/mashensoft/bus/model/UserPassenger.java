package com.mashensoft.bus.model;

public class UserPassenger {
    private Integer userPassengerId;

    private Integer userId;

    private Integer passengerId;

    public Integer getUserPassengerId() {
        return userPassengerId;
    }

    public void setUserPassengerId(Integer userPassengerId) {
        this.userPassengerId = userPassengerId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(Integer passengerId) {
        this.passengerId = passengerId;
    }
}