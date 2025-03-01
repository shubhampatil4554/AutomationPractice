package org.assignmentOnPageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org12.seleniumUtilities.SeleniumUtil;

public class Tricentis6ShiippingAddress extends SeleniumUtil{
	public Tricentis6ShiippingAddress(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@onclick='Shipping.save()']")
	private WebElement continueShippingAddress;
	public void clickOnContinueShippingAddress() {
		clickOnElement(continueShippingAddress);
	}
}
