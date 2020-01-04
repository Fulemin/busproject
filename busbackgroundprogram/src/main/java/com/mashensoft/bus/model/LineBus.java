package com.mashensoft.bus.model;

public class LineBus {
    private Integer lineBusId;

    private Integer busId;

    private Integer lineId;

    private String lineTime;

    private Integer lineDate;

    private Integer lineDirection;

    public Integer getLineBusId() {
        return lineBusId;
    }

    public void setLineBusId(Integer lineBusId) {
        this.lineBusId = lineBusId;
    }

    public Integer getBusId() {
        return busId;
    }

    public void setBusId(Integer busId) {
        this.busId = busId;
    }

    public Integer getLineId() {
        return lineId;
    }

    public void setLineId(Integer lineId) {
        this.lineId = lineId;
    }

    public String getLineTime() {
        return lineTime;
    }

    public void setLineTime(String lineTime) {
        this.lineTime = lineTime == null ? null : lineTime.trim();
    }

    public Integer getLineDate() {
        return lineDate;
    }

    public void setLineDate(Integer lineDate) {
        this.lineDate = lineDate;
    }

    public Integer getLineDirection() {
        return lineDirection;
    }

    public void setLineDirection(Integer lineDirection) {
        this.lineDirection = lineDirection;
    }
}