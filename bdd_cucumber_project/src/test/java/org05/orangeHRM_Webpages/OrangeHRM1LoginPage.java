package org05.orangeHRM_Webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class OrangeHRM1LoginPage extends SeleniumUtility {
	public OrangeHRM1LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "username")
	private WebElement usernameInputField;

	public void enterUsername() {
		typeInput(usernameInputField, "Admin");
	}

	@FindBy(name = "password")
	private WebElement passwordInputField;

	public void enterPassword() {
		typeInput(passwordInputField, "admin123");
	}

	@FindBy(className = "orangehrm-login-button")
	private WebElement loginButton;

	public void clickOnLoginButton() {
		clickOnElement(loginButton);
	}

	public boolean getCurrentUrlForVerification() {
		String expected = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		String actual = driver.getCurrentUrl();
		return expected.equals(actual);
	}

}
