package pages.locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

/*This class is used to keep Web Element Locators for Login Page*/

public class LoginPageLocators {

	@FindBy(id = "username")
	public WebElement usernameFeild;

	@FindBy(id = "password")
	public WebElement passwordFeild;

	@FindBy(xpath = "//button[@class = 'btn btn-primary btn-lg is-fullwidth']")
	public WebElement logInButton;

	@FindBy(xpath = "//body[@id='login']//span[@class='message flex-grow-1']")
	public WebElement errorMessage;

	@FindBy(tagName = "a")
	public List<WebElement> linkList;
	
	@FindBy(xpath = "//img[@alt = 'Quore']")
	public WebElement imgLogo;
	
	@FindBy(xpath = "//div[@class='copyright text-center']/p")
	public WebElement appVersion;

}
