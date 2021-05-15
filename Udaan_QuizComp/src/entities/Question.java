package entities;

import java.util.ArrayList;

public class Question 
{
	private int id;
	private String name;
	private String description;
	private ArrayList<String> options;
	private String actualAnswer;
	private String submittedAnswer;
	
	public Question(int id, String name, String description, ArrayList<String> options, String answer) 
	{
		this.id = id;
		this.name = name;
		this.description = description;
		this.options = options;
		this.actualAnswer = answer;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public ArrayList<String> getOptions() {
		return options;
	}

	public String getAnswer() {
		return actualAnswer;
	}

	public void setAnswer(String answer) {
		this.actualAnswer = answer;
	}

	public String getSubmittedAnswer() {
		return submittedAnswer;
	}

	public void setSubmittedAnswer(String submittedAnswer) {
		this.submittedAnswer = submittedAnswer;
	}
	
	
	public void printQuestion()
	{
		char j=97;
		System.out.println(description);
		
		for(int i=0;i<options.size();i++,j++)
		{
			System.out.print(j + ")" + options.get(i) + " ");
		}
		System.out.println("");
	}
	
	
	

	

}
