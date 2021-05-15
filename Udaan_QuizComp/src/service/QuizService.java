package service;

import entities.Question;
import entities.Quiz;

public interface QuizService 
{
	
	public boolean createQuiz(int id, String name, int numberOfQuestions);
	
	public void addQuestion(Question question, Quiz... quizes);
	
	public void submitAnswer(Quiz quiz, int questionId, String answer);

	public Quiz getQuiz(int quizId);
	

}
