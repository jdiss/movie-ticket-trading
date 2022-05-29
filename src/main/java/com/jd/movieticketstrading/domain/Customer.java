package com.jd.movieticketstrading.domain;
import com.jd.movieticketstrading.core.base.Ticket;
import com.jd.movieticketstrading.core.exceptions.NotFoundException;
import com.jd.movieticketstrading.core.meta.CustomerType;


public class Customer {

    private String name;
    private Long age;
    private CustomerType type;

    private Ticket ticket;

    public Customer(String name, long age) {
        this.name = name;
        this.age = age;
        this.type = CustomerType.find(age);
    }

    public void setTicket(Ticket ticket){
        this.ticket = ticket;
    }

    public boolean hasAge(){
        if(age == null){
            return false;
        }
        return true;
    }

    public CustomerType getType() {
        return type;
    }
}
