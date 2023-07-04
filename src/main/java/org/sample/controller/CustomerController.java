package org.sample.controller;
import java.util.List;

import org.sample.Entity.CustomerEntity;
import org.sample.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
	@Autowired
	private CustomerService custservice;
	
	@RequestMapping("/customer")
    public List<CustomerEntity> getCustomer(){
    	return custservice.getCustomer();
    }

	@RequestMapping("/customer/{id}")
	public CustomerEntity getCustomer(@PathVariable int id) {
		return custservice.getCustomer(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/customer")
	public void addCustomer(@RequestBody CustomerEntity custElement) {
		custservice.addCustomer(custElement);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/customer/{id}")
	public void updateCustomer(@RequestBody CustomerEntity customer) {
		custservice.updateCustomer(customer);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/customer/{id}")
	public void deleteCustomer(@PathVariable int id) {
		custservice.deleteCustomer(id);
	}
}
