package com.jd.movieticketstrading.core.contract;

import com.jd.movieticketstrading.core.exceptions.NotFoundException;
import com.jd.movieticketstrading.dto.TransactionRequestDTO;
import com.jd.movieticketstrading.dto.TransactionResponseDTO;

public interface ICustomerTickectTradingService {
    TransactionResponseDTO tradeTickets(TransactionRequestDTO request) throws NotFoundException;
}
