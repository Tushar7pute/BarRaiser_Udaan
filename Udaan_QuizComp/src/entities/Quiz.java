package entities;

import java.util.ArrayList;
import java.util.HashMap;

public class Quiz 
{
	
	private int id;
	private String name;
	private int numberOfQuestions;
	
	private HashMap<Integer,Question> questions;
	
	
	public Quiz(int id, String name, int numberOfQuestions)
	{
		this.id = id;
		this.name = name;
		this.numberOfQuestions = numberOfQuestions;
		questions = new HashMap<Integer,Question>(numberOfQuestions);
	}

	public int getId() {
		return id;
	}

	/*public void setId(int id) {
		this.id = id;
	}*/

	public String getName() {
		return name;
	}

	/*public void setName(String name) {
		this.name = name;
	}*/
	
	public int getNumberOfQuestions() 
	{
		return numberOfQuestions;
	}

	/*public void setNumberOfQuestions(int numberOfQuestions) 
	{
		this.numberOfQuestions = numberOfQuestions;
	}*/

	public ArrayList<Question> getQuestions() 
	{
		return new ArrayList(questions.values());
	}
	
	public Question getQuestion(int questionId) 
	{
		return questions.get(questionId);
	}
	
	public boolean addQuestion(Integer questionId, Question question) 
	{
		if(questions.size() < numberOfQuestions)
		{
			questions.put(questionId , question);
			
			return true;
		}
		
		else
		{
			System.out.println("The quiz is full!");
			return false;
		}
	}

	/*public void setQuestions(ArrayList<Question> questions) 
	{
		if(questions.size() < numberOfQuestions)
		{
			questions.add(null);
		}
	}*/
	
	

}
