package com.jd.movieticketstrading.domain;

import com.jd.movieticketstrading.core.base.Ticket;
import lombok.Builder;

@Builder
public class SeniorTicket extends Ticket  {

    public SeniorTicket(){
        TICKECT_PRICE = 0;
    }

    @Override
    public double calculateCost() {
        return TICKECT_PRICE - discount;
    }

}
