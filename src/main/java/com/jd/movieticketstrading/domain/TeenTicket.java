package com.jd.movieticketstrading.domain;

import com.jd.movieticketstrading.core.base.Ticket;
import lombok.Builder;

@Builder
public class TeenTicket extends Ticket {

    public TeenTicket(){
        TICKECT_PRICE = 12;
    }
    @Override
    public double calculateCost() {
        return TICKECT_PRICE - discount;
    }

}
