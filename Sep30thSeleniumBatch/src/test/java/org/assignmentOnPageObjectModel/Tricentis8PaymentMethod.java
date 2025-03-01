package org.assignmentOnPageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org12.seleniumUtilities.SeleniumUtil;

public class Tricentis8PaymentMethod extends SeleniumUtil{
	public Tricentis8PaymentMethod(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@onclick='PaymentMethod.save()']")
	private WebElement continuePaymentMethod;
	public void clickOnContinuePaymentMethod() {
		clickOnElement(continuePaymentMethod);
	}
}
