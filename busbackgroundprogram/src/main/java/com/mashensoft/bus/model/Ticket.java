package com.mashensoft.bus.model;

import java.util.Date;

public class Ticket {
    private Integer ticketId;

    private Integer ticketNumber;

    private Integer busId;

    private Date ticketDate;

    private Integer lineBusId;

    public Integer getTicketId() {
        return ticketId;
    }

    public void setTicketId(Integer ticketId) {
        this.ticketId = ticketId;
    }

    public Integer getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(Integer ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public Integer getBusId() {
        return busId;
    }

    public void setBusId(Integer busId) {
        this.busId = busId;
    }

    public Date getTicketDate() {
        return ticketDate;
    }

    public void setTicketDate(Date ticketDate) {
        this.ticketDate = ticketDate;
    }

    public Integer getLineBusId() {
        return lineBusId;
    }

    public void setLineBusId(Integer lineBusId) {
        this.lineBusId = lineBusId;
    }
}