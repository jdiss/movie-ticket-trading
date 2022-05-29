package com.jd.movieticketstrading.dto;

import com.jd.movieticketstrading.core.meta.CustomerType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TicketDTO {

     private CustomerType ticketType;

     private long quantity;

     private double totalCost;

}
