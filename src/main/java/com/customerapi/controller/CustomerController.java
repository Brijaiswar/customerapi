package com.customerapi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.customerapi.model.Customer;
import com.customerapi.repository.CustomerRepository;

@RestController
@RequestMapping("/customers")
public class CustomerController {

	@Autowired
	CustomerRepository customerRepository;

	@PostMapping("/addCustomer")
	public Customer addCustomer(@RequestBody Customer customer) {

		Customer user = new Customer();
		user.setName(customer.getName());
		user.setContactInfo(customer.getContactInfo());
		customerRepository.save(user);
		return user;
	}

	@GetMapping("/viewAll")
	public List<Customer> getAllCustomer() {
		return (List<Customer>) customerRepository.findAll();

	}

	@GetMapping("/view/id")
	public Optional<Customer> getCustomerById(Integer id) {
		return customerRepository.findById(id);
	}
	
	

}
