package com.jd.movieticketstrading.controller;

import com.jd.movieticketstrading.core.contract.ICustomerTickectTradingService;
import com.jd.movieticketstrading.core.exceptions.NotFoundException;
import com.jd.movieticketstrading.dto.TransactionRequestDTO;
import com.jd.movieticketstrading.dto.TransactionResponseDTO;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/ticket")
@RequiredArgsConstructor
@Validated
public class TicketController
{

    private final ICustomerTickectTradingService customerTickectTradingService;

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "Create Customer Tickect Trading")
    public ResponseEntity<TransactionResponseDTO> tradeTicket(
            @RequestBody TransactionRequestDTO request
    ) throws NotFoundException {
        return ResponseEntity.ok(customerTickectTradingService.tradeTickets(request));
    }
}
