package com.mashensoft.bus.model;

public class Uptown {
    private Integer uptownId;

    private String uptownName;

    private String isHot;

    public Integer getUptownId() {
        return uptownId;
    }

    public void setUptownId(Integer uptownId) {
        this.uptownId = uptownId;
    }

    public String getUptownName() {
        return uptownName;
    }

    public void setUptownName(String uptownName) {
        this.uptownName = uptownName == null ? null : uptownName.trim();
    }

    public String getIsHot() {
        return isHot;
    }

    public void setIsHot(String isHot) {
        this.isHot = isHot == null ? null : isHot.trim();
    }
}