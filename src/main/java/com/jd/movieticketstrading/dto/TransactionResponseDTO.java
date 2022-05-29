package com.jd.movieticketstrading.dto;

import lombok.*;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TransactionResponseDTO extends TransactionBaseDTO{

    private List<TicketDTO> tickets;
    private long totalCost;
}
