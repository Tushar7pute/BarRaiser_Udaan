package DriverClasses;

import java.util.ArrayList;

import entities.Question;
import entities.Quiz;
import service.QuizImpl;
import service.QuizService;

public class Driver1 {

	public static void main(String[] args) 
	{
		QuizService quizService = new QuizImpl();
		
		quizService.createQuiz(1, "DS", 5);

		Quiz quiz1 = quizService.getQuiz(1);

		ArrayList<String> options = new ArrayList<String>();
		options.add(0,"order n");
		options.add(0,"order n*n");
		options.add(0,"order n * sqrt(n)");
		options.add(0,"order 1");

		
		Question q1 = new Question(1, "Array query", "Querying an array takes --- time ", options, "A");
		Question q2 = new Question(2, "Array query", "Inserting an array takes --- time ", options, "A");
		Question q3 = new Question(3, "Array query", "Querying a HashMap takes --- time ", options, "D");
		Question q4 = new Question(4, "Array query", "Inserting in a HashMap takes --- time ", options, "D");
		Question q5 = new Question(5, "Array query", " One for loop insode another will take --- time ", options, "B");
		
		quiz1.addQuestion(1, q1);
		quiz1.addQuestion(2, q2);
		quiz1.addQuestion(3, q3);
		quiz1.addQuestion(4, q4);
		quiz1.addQuestion(5, q5);
		
		
		 quiz1 = quizService.getQuiz(1);

		ArrayList<Question> allQue = quiz1.getQuestions();
		
		for(int i=0; i < allQue.size(); i++)
		{
			allQue.get(i).printQuestion();
			System.out.println();
		}
		
	}

}
