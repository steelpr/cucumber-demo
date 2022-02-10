package projections.reg;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import projections.HomeScreenModel;

public class RegisterSteps {
	private final HomeScreenModel registerScreenModel;

	public RegisterSteps(final HomeScreenModel registerScreenModel) {
		this.registerScreenModel = registerScreenModel;
	}

	@Given("^Потребителя отваря екрана за регистрация на нов потребител$")
	public void openRegisterScreen() throws Throwable {
		//registerScreenModel =new HomeScreenModel();
	}

	@When("^Въведе парола: \"([^\"]*)\"$")
	public void addFirstPassword(final String password) throws Throwable {
		registerScreenModel.setFirstPassword(password);
	}

	@When("^Въведе втора парола: \"([^\"]*)\"$")
	public void addSecondPassword(final String password) throws Throwable {
		registerScreenModel.setSecondPassword(password);
	}

	@When("^Натисне бутона за регистрация$")
	public void clickRegisterButton() throws Throwable {
		registerScreenModel.clickRegisterButton();
	}

}
