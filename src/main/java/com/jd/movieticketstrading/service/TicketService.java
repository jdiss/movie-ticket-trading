package com.jd.movieticketstrading.service;

import com.jd.movieticketstrading.core.base.Ticket;
import com.jd.movieticketstrading.core.contract.ITicketService;
import com.jd.movieticketstrading.core.exceptions.NotFoundException;
import com.jd.movieticketstrading.core.meta.CustomerType;
import com.jd.movieticketstrading.domain.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TicketService implements ITicketService {

    @Override
    public Map<CustomerType,List<Ticket>> getTickets(List<Customer> customers) throws NotFoundException {

        Map<CustomerType,List<Ticket>> tickets = new HashMap<>();

        if(customers.stream().anyMatch(customer -> !customer.hasAge())){
            throw new NotFoundException("Customer age can not be null!!");
        }

        for (var customer: customers
             ) {
            switch (customer.getType()) {
                case ADULT -> AddTicket(tickets,customer.getType(),AdultTicket.builder().build());
                case TEEN -> AddTicket(tickets,customer.getType(), TeenTicket .builder().build());
                case SENIOR -> AddTicket(tickets,customer.getType(), SeniorTicket.builder().build());
                case CHILDREN -> AddTicket(tickets,customer.getType(), ChildrenTicket.builder().build());
            }
        }
        return tickets;
    }

    private void AddTicket(
            Map<CustomerType,List<Ticket>> tickets,
            CustomerType type,
            Ticket ticket){
        if(tickets.containsKey(type)){
            tickets.get(type).add(ticket);
        }
        else {
            tickets.put(type, new ArrayList<>() {{
                add(ticket);
            }});
        }
    }
}
