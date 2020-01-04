package com.mashensoft.bus.model;

public class Line {
    private Integer lineId;

    private String lineName;

    private String lineOrigin;

    private String lineDestination;

    private String lineMoney;

    public Integer getLineId() {
        return lineId;
    }

    public void setLineId(Integer lineId) {
        this.lineId = lineId;
    }

    public String getLineName() {
        return lineName;
    }

    public void setLineName(String lineName) {
        this.lineName = lineName == null ? null : lineName.trim();
    }

    public String getLineOrigin() {
        return lineOrigin;
    }

    public void setLineOrigin(String lineOrigin) {
        this.lineOrigin = lineOrigin == null ? null : lineOrigin.trim();
    }

    public String getLineDestination() {
        return lineDestination;
    }

    public void setLineDestination(String lineDestination) {
        this.lineDestination = lineDestination == null ? null : lineDestination.trim();
    }

    public String getLineMoney() {
        return lineMoney;
    }

    public void setLineMoney(String lineMoney) {
        this.lineMoney = lineMoney == null ? null : lineMoney.trim();
    }
}