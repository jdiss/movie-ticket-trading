package com.jd.movieticketstrading.domain;

import com.jd.movieticketstrading.core.base.Ticket;
import com.jd.movieticketstrading.core.contract.ICalculate;
import lombok.Builder;

@Builder
public class AdultTicket extends Ticket implements ICalculate {

    @Override
    public double calculateCost() {
        return 25;
    }

    @Override
    public double calculateDiscount() {
        return 0;
    }

}
