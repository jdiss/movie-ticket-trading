package com.jd.movieticketstrading.core.base;

public abstract class Ticket {

     public static long TICKECT_PRICE = 0;

     protected double discount = 0;

     public abstract double calculateCost();

     public  void setDiscount(double discount){
          this.discount = discount;
     }
}
