package com.jd.movieticketstrading.controller;

import com.jd.movieticketstrading.dto.TransactionRequestDTO;
import com.jd.movieticketstrading.dto.TransactionResponseDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/v1/ticket")
public class TicketController
{
    @PostMapping
    public TransactionResponseDTO tradeTicket(
            @RequestBody TransactionRequestDTO request
    )
    {
        return TransactionResponseDTO.builder().build();
    }
}
