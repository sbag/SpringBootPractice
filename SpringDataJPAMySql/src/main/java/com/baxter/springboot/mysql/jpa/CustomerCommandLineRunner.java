package com.baxter.springboot.mysql.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CustomerCommandLineRunner implements  CommandLineRunner{

	@Autowired
	private CustomerRepository repository;
	@Override
	public void run(String... args) throws Exception {
		
		repository.save(new Customer("Sourav", "Bag", "sbag@baxter.com"));
		repository.save(new Customer("Saikat", "Bag", "saikat@baxter.com"));
		repository.save(new Customer("Saonli", "Mallik", "saonli@baxter.com"));
		repository.save(new Customer("Rajiv", "Mandal", "rajiv@baxter.com"));
		
		System.out.println("Retrieve all the Customers from Database...");
		for (Customer cust : repository.findAll()) {
			System.out.println(cust);
		}
		
		System.out.println("Retrieve all the Customers by Last Name from Database...");
		for (Customer cust : repository.findBylastname("Bag")) {
			System.out.println(cust);
		}
		
	}

}
