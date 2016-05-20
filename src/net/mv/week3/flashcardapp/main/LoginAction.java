package net.mv.week3.flashcardapp.main;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import net.mv.week3.flashcardapp.flashcard.domain.FlashCard;
import net.mv.week3.flashcardapp.flashcard.service.FlashCardService;
import net.mv.week3.flashcardapp.flashcarduser.domain.FlashCardUserDTO;
import net.mv.week3.flashcardapp.flashcarduser.domain.UserForm;
import net.mv.week3.flashcardapp.flashcarduser.service.FlashCardUserService;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class LoginAction extends Action {

	/**
	 * The execute method takes 4 parameters: An Action Mapping object An
	 * ActionForm object A HttpServletRequest object A HttpServletResponse
	 * object
	 */

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		// Setup Service:
		FlashCardUserService userService = new FlashCardUserService();
		FlashCardService cardService = new FlashCardService();
		HttpSession session = request.getSession();

		String nextPage = null;

		if (form != null) 
		{
			// Create Userform:
			UserForm flashuser = (UserForm) form;
			String username = flashuser.getUsername();
			String password = flashuser.getPassword();

			FlashCardUserDTO user = userService.authenticateFlashCardUser(
					username, password);

			if (user.isAuthenticated()) 
			{
				List<FlashCard> flashCards = cardService
						.findAllFlashCardsByUserId(user.getUser().getId());
				session.setAttribute("User", user);
				session.setAttribute("FlashCards", flashCards);
				session.setMaxInactiveInterval(180);

				nextPage = "goodLogin";
			}

		} 
		else 
		{
			System.out.println("Form is null!");
			nextPage = "badLogin";
		}
		
		return mapping.findForward(nextPage);
	}
}