package database;

import java.util.ArrayList;
import java.util.HashMap;

import entities.Question;
import entities.Quiz;

public class Database 
{
	HashMap<Integer,Quiz> DBquizes = new HashMap<Integer,Quiz>();
	
	HashMap<Integer,Question> DBquestions = new HashMap<Integer,Question>();
	
	
	public void addQuizToDB(Integer quizId , Quiz quiz)
	{
		DBquizes.put(quizId, quiz);
	}
	
	public Quiz getQuizFromDB(Integer quizId)
	{
		if(DBquizes.containsKey(quizId))
			return DBquizes.get(quizId);
		else
			return null;
	}	
	
	public void addQuestionToDB(Integer questionId, Question question)
	{		
		DBquestions.put(questionId,question);
	}
	
	
	public ArrayList<Quiz> listQuizes()
	{
		return new ArrayList<Quiz> (DBquizes.values());
	}


}
