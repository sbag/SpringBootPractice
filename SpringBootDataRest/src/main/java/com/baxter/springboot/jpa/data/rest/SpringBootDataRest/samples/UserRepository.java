package com.baxter.springboot.jpa.data.rest.SpringBootDataRest.samples;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.stereotype.Component;

@RepositoryRestResource(path="user",collectionResourceRel="user")
public interface UserRepository extends CrudRepository<User, Long>{
	
	//public List<User> findByRole(String role);
	
	public List<User> findByName(@Param("name") String name);
	
	public List<User> findByRole(@Param("role") String role);
	
	public List<User> findByRoleIgnoreCase(@Param("role") String role);
	
	public List<User> findByNameIgnoreCase(@Param("name") String name);
	
}

