package com.mashensoft.bus.model;

public class Passenger {
    private Integer passengerId;

    private String passengerPhone;

    private String passengerName;

    private String passengerIdCard;

    private String passengerType;

    private Boolean passengerDefault;

    public Integer getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(Integer passengerId) {
        this.passengerId = passengerId;
    }

    public String getPassengerPhone() {
        return passengerPhone;
    }

    public void setPassengerPhone(String passengerPhone) {
        this.passengerPhone = passengerPhone == null ? null : passengerPhone.trim();
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName == null ? null : passengerName.trim();
    }

    public String getPassengerIdCard() {
        return passengerIdCard;
    }

    public void setPassengerIdCard(String passengerIdCard) {
        this.passengerIdCard = passengerIdCard == null ? null : passengerIdCard.trim();
    }

    public String getPassengerType() {
        return passengerType;
    }

    public void setPassengerType(String passengerType) {
        this.passengerType = passengerType == null ? null : passengerType.trim();
    }

    public Boolean getPassengerDefault() {
        return passengerDefault;
    }

    public void setPassengerDefault(Boolean passengerDefault) {
        this.passengerDefault = passengerDefault;
    }
}