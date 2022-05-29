package com.jd.movieticketstrading.domain;

import com.jd.movieticketstrading.core.base.Ticket;
import com.jd.movieticketstrading.core.contract.ICalculate;
import com.jd.movieticketstrading.core.meta.TicketType;

public class TeenTicket extends Ticket implements ICalculate
{

    protected TeenTicket() {
        type = TicketType.SENIOR;
    }

    @Override
    public String toString() {
        return this.type.getDescription();
    }


    @Override
    public double calculateCost() {
        return 0;
    }

    @Override
    public double calculateDiscount() {
        return 0;
    }
}
