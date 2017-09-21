package com.baxter.survey.rest.model;

import java.util.List;

public class Survey {
	
	private int id;
	private String name;
	private String description;
	private List<Question> questions;
	
	public Survey()
	{
		
	}
	
	public Survey(int id, String name, String description,
			List<Question> questions) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.questions = questions;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<Question> getQuestions() {
		return questions;
	}
	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}

	@Override
	public String toString() {
		return "Survey [id=" + id + ", name=" + name + ", description="
				+ description + ", questions=" + questions + "]";
	}
	
}
