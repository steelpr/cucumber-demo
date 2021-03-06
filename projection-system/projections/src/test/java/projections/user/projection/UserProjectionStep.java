package projections.user.projection;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import projections.project.model.ProjectionScreenModel;

public class UserProjectionStep {
	private ProjectionScreenModel projectionScreenModel;
	
	@Given("^Потребителят отваря екрана на прожекциите$")
	public void openPostScreen() throws Throwable {
		projectionScreenModel = new ProjectionScreenModel();
	}

	@When("^Избира прожекция: \\\"([^\\\"]*)\\\"$")
	public void getProjection(final String title) throws Throwable {
		projectionScreenModel.setTitle(title);
	}

	@When("^Избира дата на прожекцията: \\\"([^\\\"]*)\\\"$")
	public void getDate(final Date date) throws Throwable {
		projectionScreenModel.setDateTime(date);
	}
	
	@When("^Избира място: \\\"([^\\\"]*)\\\"$")
	public void getContent(final int seat) throws Throwable {
		projectionScreenModel.setSeat(seat);
	}

	@When("^Натиска бутона запази$")
	public void clickCreatePostButton() throws Throwable {
		projectionScreenModel.clickCreatePostButton();
	}

	@Then("^Потребителят вижда съобщение: \"([^\"]*)\"$")
	public void checkMessage(final String expectedMessage) throws Throwable {
		assertEquals(expectedMessage, projectionScreenModel.getMessage());
	}
}
