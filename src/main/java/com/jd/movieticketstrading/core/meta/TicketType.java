package com.jd.movieticketstrading.core.meta;

public enum TicketType {
    ADULT(1,"Adult"),
    SENIOR(2,"Senior"),
    TEEN(3,"Teen"),
    CHILDREN(4,"Children");


    private final int order;
    private final String description;

    TicketType(int order, String description) {
        this.order = order;
        this.description = description;
    }

    public int getOrder() {
        return order;
    }

    public String getDescription() {
        return description;
    }
}
