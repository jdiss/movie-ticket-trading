package com.jd.movieticketstrading.service;

import com.jd.movieticketstrading.core.base.Ticket;
import com.jd.movieticketstrading.core.contract.ITradingService;
import com.jd.movieticketstrading.core.meta.CustomerType;
import com.jd.movieticketstrading.domain.AdultTicket;
import com.jd.movieticketstrading.domain.ChildrenTicket;
import com.jd.movieticketstrading.dto.TicketDTO;
import com.jd.movieticketstrading.dto.TransactionResponseDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class TradingService implements ITradingService {
    @Override
    public TransactionResponseDTO getTradingTickets(Map<CustomerType, List<Ticket>> customerTickets) {

        List<TicketDTO> ticketDTOS = new ArrayList<>();

        for (var customerTicket : customerTickets.entrySet()
        ) {

            var ticketList = customerTicket.getValue();

            if(customerTicket.getKey() == CustomerType.SENIOR){
                for (var ticket :ticketList
                     ) {
                    ticket.setDiscount(AdultTicket.TICKECT_PRICE * (30/100));
                }
            }

            if(customerTicket.getKey() == CustomerType.CHILDREN && ticketList.size() >= 3){
                for (var ticket :ticketList
                ) {
                    ticket.setDiscount(ChildrenTicket.TICKECT_PRICE * (25/100));
                }
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
