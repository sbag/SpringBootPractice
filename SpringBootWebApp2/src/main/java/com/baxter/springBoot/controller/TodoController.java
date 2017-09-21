package com.baxter.springBoot.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.baxter.springBoot.service.TodoService;


@Controller
@SessionAttributes("name")
public class TodoController {
	
	@Autowired
	TodoService service;
	
	@RequestMapping(value="/list-todos", method = RequestMethod.GET)
	public String showTodos(ModelMap model){
		String name = (String) model.get("name");
		model.put("todos", service.retrieveTodos(name));
		return "list-todos";
	}
	
	
	@RequestMapping(value="/add-todos", method = RequestMethod.GET)
	public String showAddToDo(ModelMap model){		
		return "todos";
	}
	
	@RequestMapping(value="/add-todos", method = RequestMethod.POST)
	public String addTodos(ModelMap model,@RequestParam String description){
		service.addTodo((String) model.get("name"), description, new Date(), false);
		model.put("todos", service.retrieveTodos((String) model.get("name")));
		System.out.println("Hello...");
		return "list-todos";
	}
	
	@RequestMapping(value="/delete-todo", method = RequestMethod.GET)
	public String deleteTodo(ModelMap model,@RequestParam int id){
		service.deleteTodo(id);
		return "redirect:/list-todos";
	}
}
