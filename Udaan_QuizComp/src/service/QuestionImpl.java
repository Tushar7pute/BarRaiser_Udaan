package service;

import java.util.ArrayList;

import database.Database;
import entities.Question;

public class QuestionImpl implements QuestionService 
{

	private Database database = new Database();

	@Override
	public void createQuestion(int id, String name, String description, ArrayList<String> options, String answer) 
	{
		Question question = new Question( id, name, description, options,  answer);
		
		database.addQuestionToDB(id, question);

	}

	@Override
	public void submitAnswer(int id, String answer) 
	{
		
	}

}
