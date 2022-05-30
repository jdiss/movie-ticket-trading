package com.jd.movieticketstrading.core.meta;

import com.jd.movieticketstrading.core.exceptions.NotFoundException;

import java.util.Arrays;

public enum CustomerType {
    ADULT(18L,65L,"Adult"),
    SENIOR(65L,200L,"Senior"),
    TEEN(11L,18L,"Teen"),
    CHILDREN(0L,11L,"Children");


    private final Long min;
    private final Long max;
    private final String description;

    CustomerType(Long min,Long max, String description) {
        this.min = min;
        this.max = max;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public static CustomerType find(Long age) {
        var result = Arrays.asList(CustomerType.values()).stream()
                .filter(e -> e.min <= age && e.max > age).findFirst()
                .orElse(CustomerType.ADULT);

        return result;
    }
}
