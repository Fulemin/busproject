package com.mashensoft.bus.model;

public class Bus {
    private Integer busId;

    private String busNumbers;

    private String busDetail;

    private String busColor;

    private Integer seatNumber;

    public Integer getBusId() {
        return busId;
    }

    public void setBusId(Integer busId) {
        this.busId = busId;
    }

    public String getBusNumbers() {
        return busNumbers;
    }

    public void setBusNumbers(String busNumbers) {
        this.busNumbers = busNumbers == null ? null : busNumbers.trim();
    }

    public String getBusDetail() {
        return busDetail;
    }

    public void setBusDetail(String busDetail) {
        this.busDetail = busDetail == null ? null : busDetail.trim();
    }

    public String getBusColor() {
        return busColor;
    }

    public void setBusColor(String busColor) {
        this.busColor = busColor == null ? null : busColor.trim();
    }

    public Integer getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(Integer seatNumber) {
        this.seatNumber = seatNumber;
    }
}