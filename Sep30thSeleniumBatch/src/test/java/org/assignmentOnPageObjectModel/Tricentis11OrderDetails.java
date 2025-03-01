package org.assignmentOnPageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org12.seleniumUtilities.SeleniumUtil;

public class Tricentis11OrderDetails extends SeleniumUtil{
	public Tricentis11OrderDetails(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div[@class='order-number']/strong")
	private WebElement orderId;
	@FindBy(xpath="//div[@class='order-details']/span[1]")
	private WebElement date;
	@FindBy(xpath="//div[@class='order-total']/strong")
	private WebElement price;
	@FindBy(xpath="//input[@onclick='ConfirmOrder.save()']")
	private WebElement confirmOrder;
}
