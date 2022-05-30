package com.jd.movieticketstrading.service;

import com.jd.movieticketstrading.core.contract.ICustomerService;
import com.jd.movieticketstrading.core.contract.ICustomerTickectTradingService;
import com.jd.movieticketstrading.core.contract.ITicketService;
import com.jd.movieticketstrading.core.contract.ITradingService;
import com.jd.movieticketstrading.core.exceptions.NotFoundException;
import com.jd.movieticketstrading.dto.TransactionRequestDTO;
import com.jd.movieticketstrading.dto.TransactionResponseDTO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CustomerTickectTradingService implements ICustomerTickectTradingService {

    private final ICustomerService customerService;
    private final ITicketService ticketService;
    private final ITradingService tradingService;

    @Override
    public TransactionResponseDTO tradeTickets(TransactionRequestDTO request) throws NotFoundException {
        var transActions =  tradingService.getTradingTickets(
                ticketService.getTickets(customerService.getCustomers(request)
                )
        );

        transActions.setTransactionId(request.getTransactionId());
        if(!transActions.getTickets().isEmpty()) {
            transActions.setTotalCost(transActions.getTickets()
                    .stream()
                    .filter(calc -> calc != null)
                    .map(calc -> calc.getTotalCost())
                    .reduce(0.0, (subtotal, element) -> subtotal + element));
        }

        return transActions;
    }
}
