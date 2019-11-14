package pages.actions;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import pages.locators.LoginPageLocators;
import utils.WebDriverManager;

/*This class is used to perform actions on Login page*/

public class LoginPageActions {

	LoginPageLocators pageLocators = null;

	// Initializing web elements
	public LoginPageActions() {
		this.pageLocators = new LoginPageLocators();
		PageFactory.initElements(WebDriverManager.getDriver(), pageLocators);
	}

	public String getPageTitle() {
		String pageTile = WebDriverManager.getDriver().getTitle();
		return pageTile;
	}

	public void enterCredentials(String username, String password) {
		WebDriverManager.getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement user = pageLocators.usernameFeild;

		if (user.isDisplayed()) {
			user.sendKeys(username);
		} else
			Assert.fail("Unable to Locate Username Field on Login Page");

		WebDriverManager.getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement pass = pageLocators.passwordFeild;

		if (pass.isDisplayed())
			pass.sendKeys(password);
		else
			Assert.fail("Unable to Locate Password Field on Login Page");

	}

	public void performClickOperation() {
		WebDriverManager.getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// Check if login Button is Enabled
		if (pageLocators.logInButton.isEnabled())
			pageLocators.logInButton.click();
		else
			Assert.fail("Log In Button is disabled");
	}

	public String getErrorMsg() {
		WebDriverManager.waitForElementVisible();

		String message = null;
		if (pageLocators.errorMessage.isDisplayed())
			message = pageLocators.errorMessage.getText();

		return message;
	}

	public boolean verifyLinks(List<String> expectedlinkText) {
		String linkUrl;
		String linkText;
		HttpURLConnection httpConnection = null;
		int responseCode = 200;
		boolean isLinkValid = false;
		boolean isLinkPresent = false;
		int count = 0;

		List<String> actualLinkText = new ArrayList<String>();

		List<WebElement> linkList = pageLocators.linkList;

		System.out.println("Total Number of Links Found =======" + linkList.size());

		for (WebElement webElement : linkList) {
			linkText = webElement.getText();
			if (!linkText.isEmpty())
				actualLinkText.add(linkText.trim());

			linkUrl = webElement.getAttribute("href");
			System.out.println(++count + " Link is ======" + linkText + " Its URL ========" + linkUrl);

			if (linkUrl == null || linkUrl.isEmpty()) {
				System.out.println("URL is either not configured or It is empty ");
				continue;
			}
			try {
				httpConnection = (HttpURLConnection) (new URL(linkUrl).openConnection());
				httpConnection.setRequestMethod("HEAD");
				httpConnection.connect();

				responseCode = httpConnection.getResponseCode();

				// Verifying if Links aren't broken
				if (responseCode >= 400) {
					Assert.fail(linkText + " ======== Link is broken");
				} else {
					isLinkValid = true;
					System.out.println(linkText + " ========= Link is valid");
				}
				assertTrue("Link is Valid", isLinkValid);
			} catch (MalformedURLException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		// Verifying LinkText
		if (actualLinkText.equals(expectedlinkText))
			return isLinkPresent = true;
		else {
			System.out.println("Actual Links presents ==== " + actualLinkText.size() + "Expected Links presents ==== "
					+ expectedlinkText.size());
			Assert.fail("Expected Links are not present");
		}
		return isLinkPresent;
	}
}
