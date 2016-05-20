package net.mv.week3.flashcardapp.flashcard.service;
import java.util.List;
import net.mv.week3.flashcardapp.flashcard.dao.FlashCardDao;
import net.mv.week3.flashcardapp.flashcard.domain.FlashCard;

public class FlashCardService {

	private FlashCardDao cardDao = new FlashCardDao();

	public void addFlashCard(long userId, String question, String answer) {

		FlashCard card = new FlashCard(userId, question, answer);

		/*
		 * Commented out as it is redundant to pass both the FlashCard and
		 * userId.
		 */
		// cardDao.createFlashCard(card, userId);

		/*
		 * Replaces old createFlashCard Method
		 */
		cardDao.createFlashCard(card);
	}

	public List<FlashCard> findAllFlashCardsByUserId(long userId) {

		return cardDao.retrieveAllFlashCardsByUserId(userId);
	}

	public FlashCard findRandomFlashCard(long userId) {

		List<FlashCard> cards = cardDao.retrieveAllFlashCardsByUserId(userId);
		FlashCard randomCard = cards.get((int) (cards.size() * Math.random()));
		return randomCard;
	}
}
