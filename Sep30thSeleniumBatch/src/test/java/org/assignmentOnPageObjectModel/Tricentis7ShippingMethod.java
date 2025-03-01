package org.assignmentOnPageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org12.seleniumUtilities.SeleniumUtil;

public class Tricentis7ShippingMethod extends SeleniumUtil{
	public Tricentis7ShippingMethod(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@onclick='ShippingMethod.save()']")
	private WebElement continueShippingMethod;
	public void clickOncontinueShippingMethod() {
		clickOnElement(continueShippingMethod);
	}
}
