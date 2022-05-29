package com.jd.movieticketstrading.core.base;

import com.jd.movieticketstrading.core.meta.TicketType;

public abstract class Ticket {
     protected TicketType type;
     protected long quantity = 0;
     protected double discount = 0;
}
