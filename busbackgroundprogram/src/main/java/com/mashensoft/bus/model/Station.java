package com.mashensoft.bus.model;

public class Station {
    private Integer stationId;

    private Integer lineId;

    private String stationName;

    private String stationType;

    private String stationRemark;

    private String stationTime;

    private Integer sortNumber;

    private Integer getOnOff;

    private Integer lineBusId;

    public Integer getStationId() {
        return stationId;
    }

    public void setStationId(Integer stationId) {
        this.stationId = stationId;
    }

    public Integer getLineId() {
        return lineId;
    }

    public void setLineId(Integer lineId) {
        this.lineId = lineId;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName == null ? null : stationName.trim();
    }

    public String getStationType() {
        return stationType;
    }

    public void setStationType(String stationType) {
        this.stationType = stationType == null ? null : stationType.trim();
    }

    public String getStationRemark() {
        return stationRemark;
    }

    public void setStationRemark(String stationRemark) {
        this.stationRemark = stationRemark == null ? null : stationRemark.trim();
    }

    public String getStationTime() {
        return stationTime;
    }

    public void setStationTime(String stationTime) {
        this.stationTime = stationTime == null ? null : stationTime.trim();
    }

    public Integer getSortNumber() {
        return sortNumber;
    }

    public void setSortNumber(Integer sortNumber) {
        this.sortNumber = sortNumber;
    }

    public Integer getGetOnOff() {
        return getOnOff;
    }

    public void setGetOnOff(Integer getOnOff) {
        this.getOnOff = getOnOff;
    }

    public Integer getLineBusId() {
        return lineBusId;
    }

    public void setLineBusId(Integer lineBusId) {
        this.lineBusId = lineBusId;
    }
}