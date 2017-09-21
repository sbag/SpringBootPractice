package com.baxter.survey.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baxter.survey.rest.model.Question;
import com.baxter.survey.rest.model.Survey;
import com.baxter.survey.rest.service.SurveyService;

@RestController
public class SurveyController {
	
	@Autowired
	private SurveyService service;
	
	@RequestMapping("/surveys")
	public List<Survey> getAllSurvey()
	{
		return service.retrieveSurveys();
	}
	
	@GetMapping("/surveys/{id}")
	public Survey retrieveSurvey(@PathVariable int id)
	{
		return service.retriveSpecificSurvey(id);
	}
	
	@GetMapping("/surveys/{id}/questions")
	public List<Question> retrieveQuestions(@PathVariable int id)
	{
		return service.retriveAllQuestionsForSpecificSurvey(id);
	}
	
	@GetMapping("/surveys/{surveyId}/question/{questionId}")
	public Question retrieveQuestions(@PathVariable int surveyId,@PathVariable int questionId)
	{
		return service.specificQuestionForSpecificSurvey(surveyId,questionId);
				
	}
	
	@PostMapping("/surveys/{id}/question")
	public List<Question> addQuestion(@PathVariable int id,@RequestBody Question question)
	{
		return service.addQuestionToSurvey(id,question);
	}

}
