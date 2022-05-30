package com.jd.movieticketstrading.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TransactionRequestDTO  extends TransactionBaseDTO{
    @JsonProperty(value = "customers",required=true)
    private List<CustomerDTO> customers;
}
