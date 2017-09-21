package com.baxter.springboot.jpa.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import com.baxter.springboot.jpa.entity.User;

@Component
public class UserCommandLineRunner implements CommandLineRunner{

    @Autowired
	private UserRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello..");
		repository.save(new User("Sourav", "Admin"));
		repository.save(new User("Saikat", "User"));
		repository.save(new User("Saonli", "User"));
		repository.save(new User("Rajiv", "User"));
		
		System.out.println("Retrieving all the Users");
		for (User user : repository.findAll()) {
			System.out.println(user);
		}	
		
		System.out.println("Retrieving all the Users by Roles");
		for (User user : repository.findByRole("User")) {
			System.out.println(user);
		}
		
		System.out.println("Retrieving all the Users by Name");
		for (User user : repository.findByName("Sourav")) {
			System.out.println(user);
		}
	}

}
