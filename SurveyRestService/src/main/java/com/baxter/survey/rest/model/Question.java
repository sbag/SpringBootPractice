package com.baxter.survey.rest.model;

import java.util.Set;

public class Question {
	
	private int id;
	private String description;
	private String correctAnswer;
	private Set<String> options;
	
	public Question(){
			
	}
	
	
	public Question(int id, String description, String correctAnswer,
			Set<String> options) {
		super();
		this.id = id;
		this.description = description;
		this.correctAnswer = correctAnswer;
		this.options = options;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getCorrectAnswer() {
		return correctAnswer;
	}


	public void setCorrectAnswer(String correctAnswer) {
		this.correctAnswer = correctAnswer;
	}


	public Set<String> getOptions() {
		return options;
	}


	public void setOptions(Set<String> options) {
		this.options = options;
	}


	@Override
	public String toString() {
		return "Question [id=" + id + ", description=" + description
				+ ", correctAnswer=" + correctAnswer + ", options=" + options
				+ "]";
	}
	
}
