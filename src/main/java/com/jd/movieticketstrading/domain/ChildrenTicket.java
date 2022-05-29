package com.jd.movieticketstrading.domain;

import com.jd.movieticketstrading.core.base.Ticket;
import lombok.Builder;

@Builder
public class ChildrenTicket extends Ticket {

    @Override
    public double calculateCost() {
        if(this.discount!= 0){
            return 5 - discount;
        }
        return 5;
    }

}
