package net.mv.week3.flashcardapp.flashcard.domain;

public class FlashCard {

	private long id;
	private long userId;
	private String question;
	private String answer;

	public FlashCard() {
	}

	public FlashCard(long userId, String question, String answer) {
		this.userId = userId;
		this.question = question;
		this.answer = answer;
	}

	public FlashCard(long id, long userId, String question, String answer) {
		this.id = id;
		this.userId = userId;
		this.question = question;
		this.answer = answer;
	}

	public String toString() {
		return "FlashCard [id=" + id + ", userId=" + userId + ", question="
				+ question + ", answer=" + answer + "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

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

}
