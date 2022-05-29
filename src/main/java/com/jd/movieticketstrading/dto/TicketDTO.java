package com.jd.movieticketstrading.dto;

import com.jd.movieticketstrading.core.meta.TicketType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TicketDTO {

     private TicketType ticketType;

     private long quantity;

     private double totalCost;

}
