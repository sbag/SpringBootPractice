package com.baxter.survey.rest.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import org.springframework.stereotype.Component;

import com.baxter.survey.rest.model.Question;
import com.baxter.survey.rest.model.Survey;

@Component
public class SurveyService {
	
	private static List<Survey> surveys = new ArrayList<Survey>();
	
	static
	{
		
		Question question1 = new Question(1,"What's the color of Sky?","Blue",new HashSet<String>(Arrays.asList("red","blue","white")));
		Question question2 = new Question(1,"What's the largest animal in the world?","Blue Whale",new HashSet<String>(Arrays.asList("Elephant","Blue Whale","Shark")));
		Question question3 = new Question(1,"What's the largest country in the World?","Russia",new HashSet<String>(Arrays.asList("Russia","India","USA")));
		
		List<Question> questions = new ArrayList<>(Arrays.asList(question1,question2,question3));		
		Survey survey = new Survey(1, "Survey1", "General Knowledge", questions);		
		surveys.add(survey);
				
	}
	
	public List<Survey> retrieveSurveys()
	{
		return surveys;
	}
	
	public Survey retriveSpecificSurvey(int surveyId)
	{
		//System.out.println("Inside retriveSpecificSurvey()");
		for (Survey survey : surveys) {
			 if(survey.getId()==surveyId)
			 {
				 return survey;
			 }
		}
		return null;
	}
	
	public List<Question> retriveAllQuestionsForSpecificSurvey(int surveyId)
	{
		
		for (Survey survey : surveys) {
			 if(survey.getId()==surveyId)
			 {
				 return survey.getQuestions();
			 }
		}
		return null;
	}

	public Question specificQuestionForSpecificSurvey(int surveyId, int questionId) {
		
		Survey survey = retriveSpecificSurvey(surveyId);
		for (Question question : survey.getQuestions()) {
			
			if(question.getId() == questionId)
			{
				return question;
			}
			
		}
		
		return null;
		
	}

	public List<Question> addQuestionToSurvey(int surveyId, Question newQuestion) {
		System.out.println("Hello...");
		Survey survey = retriveSpecificSurvey(surveyId);
		
		if (survey == null) {
			return null;
		}
		System.out.println("Hello1");
		survey.getQuestions().add(newQuestion);
		return 	retriveAllQuestionsForSpecificSurvey(surveyId);		
	}

}
