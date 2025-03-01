package org04.tricentisWebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class Tricentis3ShippingCartPage extends SeleniumUtility {
	public Tricentis3ShippingCartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='product-name']")
	private WebElement productName;
	public boolean verifyProductName(String prodName) {
		String expected=prodName;
		String actual=productName.getText();
		return expected.equals(actual);
	}
	@FindBy(xpath = "//input[@name='removefromcart']")
	private WebElement productCheckBox;
	@FindBy(xpath = "//input[@id='termsofservice']")
	private WebElement termsAndCondnCheckBox;
	public void clickOnCheckBoxes() {
		clickOnElement(productCheckBox);
		clickOnElement(termsAndCondnCheckBox);
	}
	@FindBy(xpath = "//button[@id='checkout']")
	private WebElement checkoutButton1;
	@FindBy(xpath = "//input[@onclick='Billing.save()']")
	private WebElement continueBillingPage1;
	@FindBy(xpath = "//input[@onclick='Shipping.save()']")
	private WebElement continueShippingAddress;
	@FindBy(xpath="//input[@onclick='ShippingMethod.save()']")
	private WebElement continueShippingMethod;
	public void productCheckOut() {
		clickOnElement(checkoutButton1);
		clickOnElement(continueBillingPage1);
		clickOnElement(continueShippingAddress);
		clickOnElement(continueShippingMethod);
	}
}
