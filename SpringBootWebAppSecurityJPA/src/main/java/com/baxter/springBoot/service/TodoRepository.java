package com.baxter.springBoot.service;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.baxter.springBoot.model.Todo;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Integer>{
	
	public List<Todo> findByUser(String user);

}
