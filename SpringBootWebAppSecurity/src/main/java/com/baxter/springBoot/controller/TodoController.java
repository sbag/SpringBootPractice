package com.baxter.springBoot.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.baxter.springBoot.model.Todo;
import com.baxter.springBoot.service.TodoService;


@Controller
@SessionAttributes("name")
public class TodoController {
	
	@Autowired
	TodoService service;
	
	@InitBinder
	public void initDateBinder(WebDataBinder binder)
	{
		SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(format, false));
	}
	
	@RequestMapping(value="/list-todos", method = RequestMethod.GET)
	public String showTodos(ModelMap model){
		String name = getLoggedInUserName(model);
		model.put("todos", service.retrieveTodos(name));
		return "list-todos";
	}
	
	
	@RequestMapping(value="/add-todos", method = RequestMethod.GET)
	public String showAddToDo(ModelMap model,Todo todo){
		model.put("todo", new Todo(0, (String)model.get("name"), "", new Date(), false));
		return "todos";
	}
	
	@RequestMapping(value="/add-todos", method = RequestMethod.POST)
	public String addTodos(ModelMap model,@Valid Todo todo, BindingResult result){
		if(result.hasErrors())
		{
			return "todos";
		}
		service.addTodo((String) model.get("name"), todo.getDesc(), new Date(), false);
		model.put("todos", service.retrieveTodos((String) getLoggedInUserName(model)));
		System.out.println("Hello...");
		return "list-todos";
	}
	
	@RequestMapping(value="/delete-todo", method = RequestMethod.GET)
	public String deleteTodo(ModelMap model,@RequestParam int id){
		if(id==1)
		{
			throw new RuntimeException("Some Error Occured!!!");
		}
		service.deleteTodo(id);
		return "redirect:/list-todos";
	}
	
	@RequestMapping(value="/update-todo", method = RequestMethod.GET)
	public String updateTodo(ModelMap model,@RequestParam int id){
		model.put("todo", service.retrieveTodo(id));
		return "todos";
	}
	
	@RequestMapping(value="/update-todo", method = RequestMethod.POST)
	public String updateTodo(ModelMap model,@Valid Todo todo,BindingResult result){
		if(result.hasErrors())
		{
			return "todos";
		}
		todo.setUser((String)getLoggedInUserName(model));
		service.updateTodo(todo);
		return "redirect:/list-todos";
	}
	
	private String getLoggedInUserName(ModelMap model) {
		return (String) model.get("name");
	}
}
