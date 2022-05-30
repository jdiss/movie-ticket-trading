package com.jd.movieticketstrading.domain;

import com.jd.movieticketstrading.core.base.Ticket;
import lombok.Builder;

@Builder
public class AdultTicket extends Ticket  {

    public AdultTicket(){
        TICKECT_PRICE = 25;
    }

    @Override
    public double calculateCost() {
        return TICKECT_PRICE;
    }

}
