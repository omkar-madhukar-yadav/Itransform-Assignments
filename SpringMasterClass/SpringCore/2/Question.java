package assignment.springcore.assignment.springcore.second;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Question<T> {
	
	@Autowired
	MethodReturn methodreturn;

	int OuestionId;
	String Question,Answer;
	
	public Question(int ouestionId, String question, String answer) {
		super();
		OuestionId = ouestionId;
		Question = question;
		Answer = answer;
	}
	
public void display() {
	
	T a = (T) methodreturn.valueReturn(new Question(OuestionId,Question,Answer));
	
	System.out.println(a);
	
}
	
	
	
	

}
