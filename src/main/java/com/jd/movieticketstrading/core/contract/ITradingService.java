package com.jd.movieticketstrading.core.contract;

import com.jd.movieticketstrading.core.base.Ticket;
import com.jd.movieticketstrading.core.exceptions.NotFoundException;
import com.jd.movieticketstrading.core.meta.CustomerType;
import com.jd.movieticketstrading.dto.TransactionResponseDTO;

import java.util.List;
import java.util.Map;

public interface ITradingService {
    TransactionResponseDTO getTradingTickets(Map<CustomerType,List<Ticket>> customerTickets);
}
