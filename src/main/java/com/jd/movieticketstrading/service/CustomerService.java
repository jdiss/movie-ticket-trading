package com.jd.movieticketstrading.service;

import com.jd.movieticketstrading.core.contract.ICustomerService;
import com.jd.movieticketstrading.core.exceptions.NotFoundException;
import com.jd.movieticketstrading.domain.Customer;
import com.jd.movieticketstrading.dto.TransactionRequestDTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomerService implements ICustomerService {

    @Override
    public List<Customer> getCustomers(TransactionRequestDTO tradings) throws NotFoundException {

        if(tradings.getTransactionId() == null){
            throw new NotFoundException("Transaction Id can not be null !!! ");
        }
         if(tradings.getCustomers() == null || tradings.getCustomers().isEmpty()){
             throw new NotFoundException("Customers can not be null !!! ");
         }

         return tradings
                 .getCustomers()
                 .stream()
                 .filter(customer -> customer.getAge() != null )
                 .map(customer -> new Customer(customer.getName(), customer.getAge()))
                 .collect(Collectors.toList());

    }
}
