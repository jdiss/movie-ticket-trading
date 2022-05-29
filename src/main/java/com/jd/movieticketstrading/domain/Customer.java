package com.jd.movieticketstrading.domain;
import com.jd.movieticketstrading.core.base.Ticket;


public class Customer {

    private String name;
    private long age;
    private Ticket ticket;

    public Customer(String name, long age) {
        this.name = name;
        this.age = age;
    }
}
