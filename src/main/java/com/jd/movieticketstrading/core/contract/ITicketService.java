package com.jd.movieticketstrading.core.contract;

import com.jd.movieticketstrading.core.base.Ticket;
import com.jd.movieticketstrading.core.exceptions.NotFoundException;
import com.jd.movieticketstrading.core.meta.CustomerType;
import com.jd.movieticketstrading.domain.Customer;
import com.jd.movieticketstrading.dto.TransactionRequestDTO;

import java.util.List;
import java.util.Map;

public interface ITicketService {
    Map<CustomerType,List<Ticket>> getTickets(List<Customer> customers) throws NotFoundException;
}
