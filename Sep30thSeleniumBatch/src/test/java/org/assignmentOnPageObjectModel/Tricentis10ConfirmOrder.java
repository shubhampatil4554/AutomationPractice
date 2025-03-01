package org.assignmentOnPageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org12.seleniumUtilities.SeleniumUtil;

public class Tricentis10ConfirmOrder extends SeleniumUtil{
	public Tricentis10ConfirmOrder() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@onclick='ConfirmOrder.save()']")
	private WebElement confirmOrder;
	@FindBy(xpath="//input[@value='Continue']")
	private WebElement continueConfirmPlaceOrder;
	@FindBy(xpath="//a[text()='Click here for order details.']")
	private WebElement orderDetails;
	public void clickOnConfirm() {
		clickOnElement(confirmOrder);
		clickOnElement(continueConfirmPlaceOrder);
	}
	public void viewOrderDetails() {
		clickOnElement(orderDetails);
	}
}
