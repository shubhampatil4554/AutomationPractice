package org04.tricentisWebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class Tricentis1LoginPage extends SeleniumUtility {
	public Tricentis1LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='ico-login']")
	private WebElement loginLink;
	public void clickOnLoginLink() {
		clickOnElement(loginLink);
	}
	@FindBy(id = "Email")
	private WebElement emailInputField;

	@FindBy(id = "Password")
	private WebElement passwordInputField;
	public void enterEmailPassword() {
		typeInput(emailInputField,"tester01@vomoto.com");
		typeInput(passwordInputField,"Abc@12345");
	}

	@FindBy(xpath = "//input[@class='button-1 login-button']")
	private WebElement loginButton;
	public void clickOnLoginButton() {
		clickOnElement(loginButton);
	}
	@FindBy(xpath = "//a[text()='tester01@vomoto.com']")
	private WebElement profile;
	public boolean verifyEmail() {
		String expectedEmail="tester01@vomoto.com";
		String actualEmail=profile.getText();
		return expectedEmail.equals(actualEmail);
	}
	public void tricentisLoginPage(String email, String password) {
		typeInput(emailInputField, email);
		typeInput(passwordInputField, password);
		clickOnElement(loginButton);
	}
}
