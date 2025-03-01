package org25.pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org12.seleniumUtilities.SeleniumUtil;

public class OrangeHRMLoginPage extends SeleniumUtil{
	public OrangeHRMLoginPage(WebDriver driver) {
		//will help to initialize current page elements against WebDriver
		PageFactory.initElements(driver, this);
	}
	//username
	@FindBy(name="username")
	private WebElement usernameInputField;
	//Password
	@FindBy(name="password")
	private WebElement passwordInputField;
	//login button
	@FindBy(css=".orangehrm-login-button")
	private WebElement loginButton;
	public WebElement getUsernameInputField() {
		return usernameInputField;
	}
	public WebElement getPasswordField() {
		return passwordInputField;
	}
	public WebElement getLoginButton() {
		return loginButton;
	}
	public void logIntoOrangeHRM(String username,String password) {
		typeRequiredText(usernameInputField,username);
		typeRequiredText(passwordInputField,password);
		clickOnElement(loginButton);
	}
}
