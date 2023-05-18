package com.customerapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.customerapi.model.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer> {

}
