package org.sample.service;

import org.sample.Entity.CustomerEntity;
import org.sample.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository custrepo;
	
	List<CustomerEntity> customers;
	
	public List<CustomerEntity> getCustomer() {
		customers = new ArrayList<>();
		for(CustomerEntity cust:custrepo.findAll())
		{
			customers.add(cust);
		}
		return customers;
		
	}

	public CustomerEntity getCustomer(int id) {
		return custrepo.findById(id).get();    
	}
	
	public void addCustomer(CustomerEntity custElement) {
		custrepo.save(custElement);
	}
	
	public void updateCustomer(CustomerEntity customer) {
		custrepo.save(customer);		
	}
	
	public void deleteCustomer(int id) {
		custrepo.deleteById(id);		
	}

}
