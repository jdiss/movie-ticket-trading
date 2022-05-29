package com.jd.movieticketstrading.domain;

import com.jd.movieticketstrading.core.base.Ticket;
import com.jd.movieticketstrading.core.contract.ICalculate;
import com.jd.movieticketstrading.core.meta.TicketType;

public class ChildrenTicket extends Ticket implements ICalculate {

    protected ChildrenTicket() {
        type = TicketType.SENIOR;
    }

    @Override
    public String toString() {
        return this.type.getDescription();
    }


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
