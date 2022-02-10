package projections.log;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import projections.HomeScreenModel;

public class LoginSteps {
	private HomeScreenModel loginModel;

	public LoginSteps(final HomeScreenModel loginModel) {
		this.loginModel = loginModel;
	}

	@Given("^Потребителя отваря екрана за вход в системата$")
	public void openLoginScree() throws Throwable {
		// loginModel = new LoginScreenModel();
	}

	@When("^Въведе потребителско име: \"([^\"]*)\"$")
	public void addUsername(final String username) throws Throwable {
		loginModel.setUsername(username);
	}

	@When("^въведе потребителска парола: \"([^\"]*)\"$")
	public void addPassword(final String pass) throws Throwable {
		loginModel.setPassword(pass);
	}

	@When("^натисне бутона за вход в системата$")
	public void clickLoginButton() throws Throwable {
		loginModel.clickLoginButton();
	}

	@Then("^Вижда съобщение: \"([^\"]*)\"$")
	public void checkMessage(final String expectedMessage) throws Throwable {
		assertEquals(expectedMessage, loginModel.getMessage());
	}
}
