package com.baxter.springboot.jpa.entity;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.baxter.springboot.jpa.entity.User;

public interface UserRepository extends CrudRepository<User, Long>{
	
	public List<User> findByRole(String role);
	
	public List<User> findByName(String name);
	
}

