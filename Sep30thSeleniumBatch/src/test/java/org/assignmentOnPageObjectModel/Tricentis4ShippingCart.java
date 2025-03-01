package org.assignmentOnPageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org12.seleniumUtilities.SeleniumUtil;

public class Tricentis4ShippingCart extends SeleniumUtil {
	public Tricentis4ShippingCart(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@name='removefromcart']")
	private WebElement productCheckBox;
	@FindBy(xpath="//input[@id='termsofservice']")
	private WebElement termsAndCondnCheckBox;
	@FindBy(xpath="//button[@id='checkout']")
	private WebElement checkoutButton1;
	
	public void productCheckOut() {
		clickOnElement(productCheckBox);
		clickOnElement(termsAndCondnCheckBox);
		clickOnElement(checkoutButton1);
	}
}
