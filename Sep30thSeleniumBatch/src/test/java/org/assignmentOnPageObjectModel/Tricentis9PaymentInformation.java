package org.assignmentOnPageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org12.seleniumUtilities.SeleniumUtil;

public class Tricentis9PaymentInformation extends SeleniumUtil {
	public Tricentis9PaymentInformation() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@onclick='PaymentInfo.save()']")
	private WebElement continuePaymentInformation;
	public void clickOnContinuePaymentInformation() {
		clickOnElement(continuePaymentInformation);
	}
}
