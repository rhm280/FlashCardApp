package net.mv.week3.flashcardapp.flashcarduser.service;
import java.sql.SQLException;
import net.mv.week3.flashcardapp.flashcarduser.dao.FlashCardUserDao;
import net.mv.week3.flashcardapp.flashcarduser.domain.FlashCardUser;
import net.mv.week3.flashcardapp.flashcarduser.domain.FlashCardUserDTO;

public class FlashCardUserService {

	private FlashCardUserDao fcud = new FlashCardUserDao();

	public void registerFlashCardAppUser(String username, String password){

		FlashCardUser fcu = new FlashCardUser(username, password);

			fcud.createFlashCardUser(fcu);
	}

	public FlashCardUserDTO authenticateFlashCardUser(String username,
			String password)
	{

		FlashCardUserDTO userDTO = null;

		FlashCardUser user = fcud.retrieveFlashCardUserByUsername(username);

		/*
		 * If user is not null (found) and passwords match, set the
		 * FlashCardUser object and boolean if the true in the FlashCardUserDTOP
		 * object.
		 */
		if (user != null && user.getPassword().equals(password)) 
		{
			userDTO = new FlashCardUserDTO(user, true);
		}
		/*
		 * If user is found, and passwords do not match return the
		 * FlashCardUserDTOobject with a boolean of false.
		 */
		else 
		{
			userDTO = new FlashCardUserDTO(user, false);
		}
		return userDTO;
	}
}