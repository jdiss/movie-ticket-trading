package com.jd.movieticketstrading.service;

import com.jd.movieticketstrading.core.base.Ticket;
import com.jd.movieticketstrading.core.contract.ITradingService;
import com.jd.movieticketstrading.core.exceptions.NotFoundException;
import com.jd.movieticketstrading.core.meta.CustomerType;
import com.jd.movieticketstrading.dto.TicketDTO;
import com.jd.movieticketstrading.dto.TransactionResponseDTO;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TradingService implements ITradingService {
    @Override
    public TransactionResponseDTO getTradingTickets(Map<CustomerType, List<Ticket>> customerTickets) {

        List<TicketDTO> ticketDTOS = new ArrayList<>();

        for (var customerTicket : customerTickets.entrySet()
        ) {

            var ticketList = customerTicket.getValue();

            if(customerTicket.getKey() == CustomerType.SENIOR){

            }

            if(customerTicket.getKey() == CustomerType.CHILDREN && ticketList.size() >= 3){

            }

            ticketDTOS.add(TicketDTO
                    .builder()
                    .ticketType(customerTicket.getKey())
                    .quantity(ticketList.size())
                    .totalCost(ticketList
                            .stream()
                            .filter(calc -> calc != null)
                            .map(calc -> calc.calculateCost())
                            .reduce(0.0, (subtotal, element) -> subtotal + element))
                    .build());
        }


        return TransactionResponseDTO
                .builder()
                .tickets(ticketDTOS)
                .build();
    }
}
