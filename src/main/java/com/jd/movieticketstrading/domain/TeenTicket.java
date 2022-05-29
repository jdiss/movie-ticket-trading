package com.jd.movieticketstrading.domain;

import com.jd.movieticketstrading.core.base.Ticket;
import lombok.Builder;

@Builder
public class TeenTicket extends Ticket {

    @Override
    public double calculateCost() {
        return 12;
    }

}
