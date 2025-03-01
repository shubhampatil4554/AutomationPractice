package org.assignmentOnPageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org12.seleniumUtilities.SeleniumUtil;

public class Tricentis1LoginPage extends SeleniumUtil{
	public Tricentis1LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="Email")
	private WebElement emailInputField;
	@FindBy(id="Password")
	private WebElement passwordInputField;
	@FindBy(xpath="//input[@class='button-1 login-button']")
	private WebElement loginButton;
	
	public void tricentisLoginPage(String email,String password) {
		typeRequiredText(emailInputField,email);
		typeRequiredText(passwordInputField,password);
		clickOnElement(loginButton);
	}
}
