package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {
		"html:target/cucumber-html-report" }, features = "src/test/resources/features", glue = "src/test/groovy/stepsdef", tags = {
				"@login" })
public class Launcher {

}
