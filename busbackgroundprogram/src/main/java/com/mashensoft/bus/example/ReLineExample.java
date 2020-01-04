package com.mashensoft.bus.example;

import java.util.List;

public class ReLineExample {
    public Integer uptownId;
    public Integer lineId;
    public String lineName;
    public String lineOrigin;
    public String lineDestination;
    public String lineMoney;
    public Integer lineDate;
    public Integer lineDirection;


    public ReLineExample() {

    }




    public ReLineExample(Integer uptownId, Integer lineId, String lineName,
                         String lineOrigin, String lineDestination, String lineMoney, Integer lineDate, Integer lineDirection, List lineTime) {
        this.uptownId = uptownId;
        this.lineId = lineId;
        this.lineName = lineName;
        this.lineOrigin = lineOrigin;
        this.lineDestination = lineDestination;
        this.lineMoney = lineMoney;
        this.lineDate = lineDate;
        this.lineDirection = lineDirection;
        this.lineTime = lineTime;

    }

    public Integer getUptownId() {
        return uptownId;
    }

    public void setUptownId(Integer uptownId) {
        this.uptownId = uptownId;
    }

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
        this.lineName = lineName;
    }

    public String getLineOrigin() {
        return lineOrigin;
    }

    public void setLineOrigin(String lineOrigin) {
        this.lineOrigin = lineOrigin;
    }

    public String getLineDestination() {
        return lineDestination;
    }

    public void setLineDestination(String lineDestination) {
        this.lineDestination = lineDestination;
    }

    public String getLineMoney() {
        return lineMoney;
    }

    public void setLineMoney(String lineMoney) {
        this.lineMoney = lineMoney;
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

    public List getLineTime() {
        return lineTime;
    }

    public void setLineTime(List lineTime) {
        this.lineTime = lineTime;
    }

    public List lineTime;

    @Override
    public String toString() {
        return "ReLineExample{" +
                "uptownId=" + uptownId +
                ", lineId=" + lineId +
                ", lineName='" + lineName + '\'' +
                ", lineOrigin='" + lineOrigin + '\'' +
                ", lineDestination='" + lineDestination + '\'' +
                ", lineMoney='" + lineMoney + '\'' +
                ", lineDate=" + lineDate +
                ", lineDirection=" + lineDirection +
                ", lineTime=" + lineTime +
                '}';
    }
}
