package stepsdef;

import static org.junit.Assert.assertEquals
import static org.junit.Assert.assertTrue

import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.List

import org.apache.commons.io.FileUtils
import org.openqa.selenium.OutputType
import org.openqa.selenium.TakesScreenshot
import org.openqa.selenium.WebDriver

import pages.actions.LoginPageActions
import utils.CaptureScreenshot
import utils.WebDriverManager
import cucumber.api.DataTable
import cucumber.api.junit.Cucumber
import cucumber.api.Scenario

//Register steps and hooks
this.metaClass.mixin(cucumber.api.groovy.EN)
this.metaClass.mixin(cucumber.api.groovy.Hooks)

LoginPageActions pageActions;

Before(){

	//Driver set up
	WebDriverManager.setUpDriver()

	//WebElement Initialize
	pageActions = new LoginPageActions()

}

Given(~/^I navigate to Quore Web application url$/) {
	->
	WebDriverManager.openPage();
}

When(~/^I verify login page title$/) { DataTable titles ->
	List<String> titleList = titles.asList(String.class);
	String expectedTitle = titleList.get(1)
	String actualTitle = pageActions.getPageTitle()
	assertEquals(actualTitle, expectedTitle)
}

Then(~/^I enter valid username and password$/) {
	->
	System.out.println("Valid Credentials")
}


And(~/^I click on login button$/) {
	->
	System.out.println("Login button after Valid Credentials")
}


And(~/^I verify home page of application$/) {
	->
	System.out.println("Home Page")
}


Then(~/^I enter "([^"]*)" username and "([^"]*)" password$/) { String username, String password ->
	pageActions.enterCredentials username,password
}



And(~/^I click login button$/) {
	->
	pageActions.performClickOperation()
}

And(~/^I verify "([^"]*)" error message$/) { String error ->
	String actualError = null;
	try {
		actualError = pageActions.getErrorMsg()
	}catch (NullPointerException e ) {
		e.getStackTrace()
	}
	assertEquals(error, actualError)
}



Then(~/^I verify links are present and valid on page$/) { DataTable linkTexts ->
	List<String> linkTextList = linkTexts.asList(String.class)
	isTrue = pageActions.verifyLinks linkTextList
	assertTrue("All Link should be present ", isTrue)
}

Then(~/^I verify application Logo is present$/) {
	->
	isPresent = pageActions.pageLocators.imgLogo.isDisplayed()
	assertTrue("Application Logo is Present", isPresent)
}

And(~/^I verify application version is present$/) {
	->
	isPresent = pageActions.pageLocators.appVersion.isDisplayed()
	assertTrue("Application version is Present", isPresent)
}

After(){Scenario scenario ->

	// It will take Screenshot in case of failure
	CaptureScreenshot.afterScenario(scenario);

	// It will close & quit driver
	WebDriverManager.tearDown();
}
