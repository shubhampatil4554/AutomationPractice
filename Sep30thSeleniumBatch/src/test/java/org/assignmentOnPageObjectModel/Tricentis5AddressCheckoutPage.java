package org.assignmentOnPageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org12.seleniumUtilities.SeleniumUtil;

public class Tricentis5AddressCheckoutPage extends SeleniumUtil {
	public Tricentis5AddressCheckoutPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
    @FindBy(xpath="//input[@onclick='Billing.save()']")
    private WebElement continueBillingPage1;
    public void clickOnContinueAddressPage() {
    	clickOnElement(continueBillingPage1);
    }
    
}
