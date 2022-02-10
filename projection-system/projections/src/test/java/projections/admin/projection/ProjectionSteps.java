package projections.admin.projection;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import projections.project.model.ProjectionScreenModel;

public class ProjectionSteps {
	private ProjectionScreenModel projectionScreenModel;

	@Given("^Администратора отваря екрана за управление на прожекциите")
	public void openPostScreen() throws Throwable {
		projectionScreenModel = new ProjectionScreenModel();
	}

	@When("^Добавя заглавие: \"([^\"]*)\"$")
	public void addTitle(final String title) throws Throwable {
		projectionScreenModel.setTitle(title);
	}

	@When("^Добавя съдържание: \"([^\"]*)\"$")
	public void addContent(final String content) throws Throwable {
		projectionScreenModel.setContent(content);
	}
	
	@When("^Добавя дата: \"([^\"]*)\"$")
	public void addDate(final String content) throws Throwable {
		projectionScreenModel.setContent(content);
	}

	@When("^Натиска бутона публикувай$")
	public void clickCreatePostButton() throws Throwable {
		projectionScreenModel.clickCreatePostButton();
	}

	@Then("^Администатора вижда съобщение: \"([^\"]*)\"$")
	public void checkMessage(final String expectedMessage) throws Throwable {
		assertEquals(expectedMessage, projectionScreenModel.getMessage());
	}
}
