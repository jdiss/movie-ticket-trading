package com.jd.movieticketstrading.core.contract;

import com.jd.movieticketstrading.core.exceptions.NotFoundException;
import com.jd.movieticketstrading.domain.Customer;
import com.jd.movieticketstrading.dto.TransactionRequestDTO;
import com.jd.movieticketstrading.dto.TransactionResponseDTO;

import java.util.List;

public interface ICustomerService {
    List<Customer> getCustomers(TransactionRequestDTO customers) throws NotFoundException;
}
