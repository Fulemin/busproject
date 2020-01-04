package com.mashensoft.bus.model;

public class OrderStation {
    private Integer orderStationId;

    private Integer orderId;

    private Integer stationId;

    private Integer getOnOff;

    public Integer getOrderStationId() {
        return orderStationId;
    }

    public void setOrderStationId(Integer orderStationId) {
        this.orderStationId = orderStationId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getStationId() {
        return stationId;
    }

    public void setStationId(Integer stationId) {
        this.stationId = stationId;
    }

    public Integer getGetOnOff() {
        return getOnOff;
    }

    public void setGetOnOff(Integer getOnOff) {
        this.getOnOff = getOnOff;
    }
}