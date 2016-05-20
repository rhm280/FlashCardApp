package net.mv.week3.flashcardapp.flashcarduser.domain;
import org.apache.struts.action.ActionForm;

public class UserForm extends ActionForm {

	/**
	 * 
	 */
	private long id;
	private String username;
	private String password;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public UserForm(long id, String username, String password) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
	}

	@Override
	public String toString() {
		return "UserForm [id=" + id + ", username=" + username + ", password="
				+ password + "]";
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

	public UserForm() {
		super();
	}

	public UserForm(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
}