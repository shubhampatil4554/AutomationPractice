package org04.tricentisWebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class Tricentis5OrderDetailsPage extends SeleniumUtility{
	public Tricentis5OrderDetailsPage(WebDriver driver) {
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
	@FindBy(className="order-completed-continue-button")
	private WebElement continueForOrderPlace;
	@FindBy(xpath="//div[@class='section order-completed']/div/strong")
	private WebElement orderSuccessMsg;
	public void clickOnConfirm() {
		clickOnElement(confirmOrder);
	}
	public void clickOnContinue() {
		clickOnElement(continueForOrderPlace);
	}
	public boolean verifyOrderSuccessMsg(String successMsg) {
		String actualMsg=orderSuccessMsg.getText();
		String expected=successMsg;
		return actualMsg.equals(expected);
	}
}