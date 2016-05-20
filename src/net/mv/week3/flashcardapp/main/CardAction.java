package net.mv.week3.flashcardapp.main;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import net.mv.week3.flashcardapp.flashcard.domain.CardForm;
import net.mv.week3.flashcardapp.flashcard.service.FlashCardService;
import net.mv.week3.flashcardapp.flashcarduser.domain.FlashCardUserDTO;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class CardAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		HttpSession session = request.getSession();
		FlashCardService service = new FlashCardService();
		String nextPage = null;
	
		if(form != null )
		{
			CardForm cardform = (CardForm) form;
		
			String question = cardform.getQuestion();
			String answer = cardform.getAnswer();
			FlashCardUserDTO user  = (FlashCardUserDTO)session.getAttribute("User");
			 			
			if(user != null)
			{
				service.addFlashCard(user.getUser().getId(), question, answer);
				nextPage = "Success";
			}
			else
			{
				System.out.println("User null");
				nextPage = "Failure";
			}
		}
		else
		{
			System.out.println("Card form null!");
		}
		
		return mapping.findForward(nextPage);
	}

	
}
