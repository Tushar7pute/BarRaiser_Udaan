package service;

import java.util.ArrayList;

import database.Database;
import entities.Question;
import entities.Quiz;

public class QuizImpl implements QuizService 
{
	private Database database = new Database();

	public boolean createQuiz(int id, String name, int numberOfQuestions) 
	{
		Quiz quiz = new Quiz(id, name,  numberOfQuestions);
		database.addQuizToDB(id,quiz);
		return true;
	}

	
	public void addQuestion(Question question, Quiz...quizes) 
	{
		for(int i=0;i<quizes.length;i++)
		{
			if(quizes[i].addQuestion(question.getId() , question))
			{
				System.out.println("Question with id=" + question.getId() + " added to the Quiz with id=" + quizes[i].getId());
				
				database.addQuizToDB(quizes[i].getId(), quizes[i]);	
			}
			
			else
				System.out.println("Could not add Question with id=" + question.getId() + " added to the Quiz with id=" + quizes[i].getId());	
		}
		
		// Duplicates questions scenario
	}
	
	@Override
	public void submitAnswer(Quiz  quiz, int questionId, String answer) 
	{
		Question que = quiz.getQuestion(questionId);
		que.setAnswer(answer);
		database.addQuizToDB(quiz.getId(), quiz);			
		
	}
	
	
	public int submitQuiz(int quizId)
	{
		int marks=0;
		Quiz submittedQuiz = database.getQuizFromDB(quizId);
		
		ArrayList<Question> questions = submittedQuiz.getQuestions();
		
		for(int i=0; i< questions.size();i++)
		{
			Question tempQue = questions.get(i);
			
			if(tempQue.getAnswer().equals(tempQue.getSubmittedAnswer()))
				marks++;
		}
			
		return marks;
	}


	@Override
	public Quiz getQuiz(int quizId) 
	{
		Quiz tempQ =  database.getQuizFromDB(quizId);
		
		
		
		return tempQ;
		
		
	}




}
