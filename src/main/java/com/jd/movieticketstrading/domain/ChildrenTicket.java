package com.jd.movieticketstrading.domain;

import com.jd.movieticketstrading.core.base.Ticket;
import lombok.Builder;

@Builder
public class ChildrenTicket extends Ticket {

    public ChildrenTicket(){
        TICKECT_PRICE = 5;
    }
    @Override
    public double calculateCost() {
        if(this.discount!= 0){
            return TICKECT_PRICE - discount;
        }
        return TICKECT_PRICE;
    }

}
