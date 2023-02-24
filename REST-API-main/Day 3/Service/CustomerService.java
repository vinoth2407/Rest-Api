package com.example.demo.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.Customer;
import com.example.demo.repository.CustomerRepository;

@Service
public class CustomerService {
	@Autowired
	CustomerRepository repository;
	public String addCustomer(Customer customer) {
		repository.save(customer);
		return "Added";
	}
	public List<Customer> getCustomer(){
		return repository.findAll();
	}
}