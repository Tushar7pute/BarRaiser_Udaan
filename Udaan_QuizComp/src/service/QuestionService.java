package service;

import java.util.ArrayList;

public interface QuestionService 
{
	public void createQuestion(int id, String name, String description, ArrayList<String> options, String answer);
	
	public void submitAnswer(int id, String answer);

}
