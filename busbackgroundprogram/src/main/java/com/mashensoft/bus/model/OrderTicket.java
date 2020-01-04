package com.mashensoft.bus.model;

public class OrderTicket {
    private Integer orderTicketId;

    private Integer ticketId;

    private Integer orderId;

    public Integer getOrderTicketId() {
        return orderTicketId;
    }

    public void setOrderTicketId(Integer orderTicketId) {
        this.orderTicketId = orderTicketId;
    }

    public Integer getTicketId() {
        return ticketId;
    }

    public void setTicketId(Integer ticketId) {
        this.ticketId = ticketId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }
}