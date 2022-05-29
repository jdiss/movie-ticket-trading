package com.jd.movieticketstrading.dto;

import lombok.*;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TransactionRequestDTO  extends TransactionBaseDTO{
    private List<CustomerDTO> customers;
}
