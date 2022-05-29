package com.jd.movieticketstrading.core.base;

public abstract class Ticket {
     protected double discount = 0;

     public abstract double calculateCost();

     public  void setDiscount(double discount){
          this.discount = discount;
     }
}
