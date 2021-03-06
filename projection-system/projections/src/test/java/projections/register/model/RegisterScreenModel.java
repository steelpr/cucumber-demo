package projections.register.model;

import projections.register.service.RegisterService;

public class RegisterScreenModel {
	private String username;
	private String firstPassword;
	private String secondPassword;
	private String message;

	public void setUsername(final String username) {
		this.username = username;
	}

	public void setFirstPassword(String password) {
		this.firstPassword=password;
	}

	public void setSecondPassword(String password) {
		this.secondPassword=password;
	}


	public void clickRegisterButton() {
		message = RegisterService.register(username, firstPassword, secondPassword);
	}
	
	

	public String getMessage() {
		return message;
	}
}
