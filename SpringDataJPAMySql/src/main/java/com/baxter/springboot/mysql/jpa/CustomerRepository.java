package com.baxter.springboot.mysql.jpa;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Integer>{

	public List<Customer> findBylastname(String lastname);
	
}
