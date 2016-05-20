package net.mv.week3.flashcardapp.flashcarduser.domain;
import java.util.Set;
import net.mv.week3.flashcardapp.flashcard.domain.FlashCard;

public class FlashCardUser {

	private long id;
	private String username;
	private String password;
	private Set<FlashCard> cards;

	public FlashCardUser() {}

	public FlashCardUser(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public FlashCardUser(long id, String username, String password) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
	}

	public long getId() {
		return id;
	}

	public Set<FlashCard> getCards() {
		return cards;
	}

	public void setCards(Set<FlashCard> cards) {
		this.cards = cards;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "net.mv.flashcardapp.flashcarduser.domain.FlashCardUser{"
				+ "id=" + id + ", username='" + username + '\''
				+ ", password='" + password + '\'' + '}';
	}

}
