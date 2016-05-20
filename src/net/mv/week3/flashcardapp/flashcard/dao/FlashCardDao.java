package net.mv.week3.flashcardapp.flashcard.dao;
import net.mv.week3.flashcardapp.flashcard.domain.FlashCard;
import net.mv.week3.flashcardapp.util.HibernateUtil;
import java.util.List;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;

public class FlashCardDao {

	private HibernateUtil util = HibernateUtil.getUtil();
	private SessionFactory sf = util.getSF();

	public void createFlashCard(FlashCard fc) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();

		s.save(fc);
		t.commit();
		s.close();
	}

	public List<FlashCard> retrieveAllFlashCardsByUserId(long userId) {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();

		List<FlashCard> accounts = s
				.createQuery("from FlashCard where user.userId= :userId")
				.setLong("userId", userId).list();
		t.commit();
		s.close();
		return accounts;
	}
}

//public class FlashCardDao {
//
//	private ConnUtil util = ConnUtil.getUtil();
//
//	/*
//	 * Deprecated as it is redundant to pass userId.
//	 */
//	@Deprecated
//	public void createFlashCard(FlashCard card, long userId) {
//
//		String query = "INSERT INTO FLASH_CARD (F_C_U_ID, QUESTION, ANSWER) VALUES (?,?,?)";
//
//		try (Connection conn = util.createConnection();
//				PreparedStatement createFlashCardStatement = conn
//						.prepareStatement(query);) {
//			
//			String nextPage = "newQuestion";
//			createFlashCardStatement.setLong(1, card.getUserId());
//			createFlashCardStatement.setString(2, card.getQuestion());
//			createFlashCardStatement.setString(3, card.getAnswer());
//
//			createFlashCardStatement.executeUpdate();
//
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//	}
//
//	/**
//	 * Added in to replace old createFlashCard method as passing a userId is
//	 * redundant. The userId is also contained in the FlashCard object
//	 * 
//	 * @param card
//	 */
//	public void createFlashCard(FlashCard card) {
//
//		String query = "INSERT INTO FLASH_CARD (F_C_U_ID, QUESTION, ANSWER) VALUES (?,?,?)";
//
//		try (Connection conn = util.createConnection();
//				PreparedStatement createFlashCardStatement = conn
//						.prepareStatement(query);) {
//			System.out.println(card.getUserId());
//			createFlashCardStatement.setLong(1, card.getUserId());
//			createFlashCardStatement.setString(2, card.getQuestion());
//			createFlashCardStatement.setString(3, card.getAnswer());
//
//			createFlashCardStatement.executeUpdate();
//
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//	}
//
//	public List<FlashCard> retrieveAllFlashCardsByUserId(long userId) {
//
//		String query = "SELECT * FROM FLASH_CARD WHERE F_C_U_ID = ?";
//
//		List<FlashCard> cards = new ArrayList<FlashCard>();
//
//		try (Connection conn = util.createConnection();
//				PreparedStatement retrieveCardsStatement = conn
//						.prepareStatement(query);) {
//			retrieveCardsStatement.setLong(1, userId);
//
//			ResultSet rs = retrieveCardsStatement.executeQuery();
//
//			while (rs.next()) {
//				FlashCard card = new FlashCard(rs.getLong("F_C_ID"),
//						rs.getLong("F_C_U_ID"), rs.getString("QUESTION"),
//						rs.getString("ANSWER"));
//				cards.add(card);
//			}
//
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		
//		return cards;
//	}
//}