package projections;

import projections.login.service.LoginService;
import projections.register.service.RegisterService;

public class HomeScreenModel {
	private String username;
	private String password;
	private String firstPassword;
	private String secondPassword;
	private String message;
	
	public void setFirstPassword(String password) {
		this.firstPassword=password;
	}	

	public void setSecondPassword(String password) {
		this.secondPassword=password;
	}

	public void setUsername(final String username) {
		this.username = username;
	}

	public void setPassword(final String password) {
		this.password = password;
	}

	public void clickLoginButton() {
		message = LoginService.login(username, password);

	}
	
	public void clickRegisterButton() {
		message = RegisterService.register(username, firstPassword, secondPassword);
	}

	public String getMessage() {
		return message;
	}

}
