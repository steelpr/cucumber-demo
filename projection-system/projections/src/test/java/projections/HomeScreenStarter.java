package projections;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true, plugin = {"pretty","html:target/home-feature"})
public class HomeScreenStarter {
	
}
 