package net.mv.week3.flashcardapp.flashcard.domain;

import org.apache.struts.action.ActionForm;

public class CardForm extends ActionForm {
	
	private String question;
	private String answer;
	
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	
}
