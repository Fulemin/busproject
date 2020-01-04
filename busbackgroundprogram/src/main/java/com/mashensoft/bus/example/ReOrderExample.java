package com.mashensoft.bus.example;

import com.mashensoft.bus.model.Passenger;

import java.util.Date;
import java.util.List;

public class ReOrderExample {
    public List date;
    public String time;
    public Integer ticketNumbers;
    public String origin;
    public String getOn;
    public String destination;
    public String getOff;
    public List passenger;
    public String createTime;
    public Integer payment;
    public List busNumbers;
    public Integer userId;
    public String userName;
    public Integer orderId;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public ReOrderExample() {

    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public ReOrderExample(List date, String time, Integer ticketNumbers,
                          String origin, String getOn, String destination,
                          String getOff, List passenger, String createTime,
                          Integer payment, List busNumbers, Integer userId,
                          String userName) {
        this.date = date;
        this.time = time;
        this.ticketNumbers = ticketNumbers;
        this.origin = origin;
        this.getOn = getOn;
        this.destination = destination;
        this.getOff = getOff;
        this.passenger = passenger;
        this.createTime = createTime;
        this.payment = payment;
        this.busNumbers =busNumbers;
        this.userId =userId;
        this.userName =userName;
    }

    public List<Date> getDate() {
        return date;
    }

    public void setDate(List date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Integer getTicketNumbers() {
        return ticketNumbers;
    }

    public void setTicketNumbers(Integer ticketNumbers) {
        this.ticketNumbers = ticketNumbers;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getGetOn() {
        return getOn;
    }

    public void setGetOn(String getOn) {
        this.getOn = getOn;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getGetOff() {
        return getOff;
    }

    public void setGetOff(String getOff) {
        this.getOff = getOff;
    }

    public List getPassenger() {
        return passenger;
    }

    public void setPassenger(List passenger) {
        this.passenger = passenger;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public Integer getPayment() {
        return payment;
    }

    public void setPayment(Integer payment) {
        this.payment = payment;
    }

    public List getBusNumbers() {
        return busNumbers;
    }

    public void setBusNumbers(List busNumbers) {
        this.busNumbers = busNumbers;
    }

    @Override
    public String toString() {
        return "ReOrderExample{" +
                "date=" + date +
                ", time='" + time + '\'' +
                ", ticketNumbers=" + ticketNumbers +
                ", Origin='" + origin + '\'' +
                ", getOn='" + getOn + '\'' +
                ", destination='" + destination + '\'' +
                ", getOff='" + getOff + '\'' +
                ", passenger=" + passenger +
                ", createTime='" + createTime + '\'' +
                ", payment='" + payment + '\'' +
                 busNumbers +
                '}';
    }
}
