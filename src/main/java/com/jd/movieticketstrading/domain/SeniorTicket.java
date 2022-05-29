package com.jd.movieticketstrading.domain;

import com.jd.movieticketstrading.core.base.Ticket;
import com.jd.movieticketstrading.core.contract.ICalculate;
import lombok.Builder;

@Builder
public class SeniorTicket extends Ticket implements ICalculate {

    @Override
    public double calculateCost() {
        return discount;
    }

    @Override
    public double calculateDiscount() {
        return 0;
    }

}
