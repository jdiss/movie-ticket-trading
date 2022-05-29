package com.jd.movieticketstrading.domain;

import com.jd.movieticketstrading.core.base.Ticket;
import com.jd.movieticketstrading.core.contract.ICalculate;
import lombok.Builder;

@Builder
public class ChildrenTicket extends Ticket implements ICalculate {

    @Override
    public double calculateCost() {
        if(this.discount!= 0){
            return 5 - discount;
        }
        return 5;
    }

    @Override
    public double calculateDiscount() {
        return 0;
    }


}
