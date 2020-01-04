package com.mashensoft.bus.service;

import java.util.Date;
import java.util.List;

public interface TicketService {
    public List allTicket();
    public int getAllTicketState(Date date, Integer lineBusId);
    public int addTicket(Object ticket);

}
