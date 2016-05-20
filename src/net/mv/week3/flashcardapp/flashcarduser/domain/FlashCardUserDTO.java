package net.mv.week3.flashcardapp.flashcarduser.domain;

public class FlashCardUserDTO {

	private FlashCardUser user;
	private boolean authenticated;

	public FlashCardUserDTO() {

	}

	public FlashCardUserDTO(FlashCardUser user, boolean authenticated) {
		this.user = user;
		this.authenticated = authenticated;
	}

	@Override
	public String toString() {
		return "FlashCardUserDTO [user=" + user + ", authenticated="
				+ authenticated + "]";
	}

	public FlashCardUser getUser() {
		return user;
	}

	public void setUser(FlashCardUser user) {
		this.user = user;
	}

	public boolean isAuthenticated() {
		return authenticated;
	}

	public void setAuthenticated(boolean authenticated) {
		this.authenticated = authenticated;
	}

}
