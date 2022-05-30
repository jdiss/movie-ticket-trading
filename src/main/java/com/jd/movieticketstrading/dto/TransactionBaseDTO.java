package com.jd.movieticketstrading.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public abstract  class TransactionBaseDTO {
    @JsonProperty(value = "transactionId",required=true)
    private Long transactionId;
}
