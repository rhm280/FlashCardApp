package net.mv.week3.flashcardapp.flashcarduser.dao;
import net.mv.week3.flashcardapp.flashcarduser.domain.FlashCardUser;
import net.mv.week3.flashcardapp.util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class FlashCardUserDao {

	private HibernateUtil util = HibernateUtil.getUtil();
	private SessionFactory sf = util.getSF();

	public void createFlashCardUser(FlashCardUser fcuser) {
		Session s = sf.openSession();

		Transaction t = s.beginTransaction();

		s.save(fcuser);

		t.commit();

		s.close();
	}

	public FlashCardUser retrieveFlashCardUserByUsername(String username) {
		Session s = sf.openSession();

		Transaction t = s.beginTransaction();

		FlashCardUser fcuser = (FlashCardUser) s
				.createQuery("from FlashCardUser where username = :username")
				.setString("username", username).uniqueResult();
		t.commit();
		s.close();
		return fcuser;
	}

	public List<FlashCardUser> retrieveAllUsers() {
		Session s = sf.openSession();

		Transaction t = s.beginTransaction();

		List<FlashCardUser> users = s.createQuery(
				"from FlashCardUser u order by u.username asc").list();

		t.commit();

		s.close();

		return users;
	}
}

//
// public class FlashCardUserDao {
//
// private ConnUtil util = ConnUtil.getUtil();
//
// public void createFlashCardUser(FlashCardUser user) throws SQLException {
//
// String query =
// "INSERT INTO FLASH_CARD_USER (USERNAME, PASSWORD) VALUES (?,?)";
// try {Connection conn = util.createConnection();
// PreparedStatement registerStatement = conn.prepareStatement(query);
//
// registerStatement.setString(1, user.getUsername());
// registerStatement.setString(2, user.getPassword());
//
// registerStatement.executeUpdate();
//
// } catch (SQLException e) {
//
// e.printStackTrace();
// throw e;
// }
// }
//
// public FlashCardUser retrieveFlashCardUserByUserName(String username){
// String query = "SELECT * FROM FLASH_CARD_USER WHERE USERNAME = ?";
//
// FlashCardUser user = null;
//
// try(Connection conn = util.createConnection();
// PreparedStatement retrieveUserStatement = conn.prepareStatement(query);){
//
// retrieveUserStatement.setString(1,username);
//
// ResultSet rs = retrieveUserStatement.executeQuery();
//
// if(rs.next()){
// user = new FlashCardUser(
// rs.getLong("F_C_U_ID"),
// rs.getString("USERNAME"),
// rs.getString("PASSWORD"));
// }
//
// }catch (SQLException e){
// e.printStackTrace();
// }
//
// return user;
// }
// }

