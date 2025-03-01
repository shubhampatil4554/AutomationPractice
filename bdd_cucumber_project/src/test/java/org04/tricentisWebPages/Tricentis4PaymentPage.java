package org04.tricentisWebPages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class Tricentis4PaymentPage extends SeleniumUtility {
	public Tricentis4PaymentPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//label[text()='Cash On Delivery (COD) (7.00)']")
	private WebElement cod;
	public void clickOnCod() {
		clickOnElement(cod);
	}
//	@FindBy(xpath="//label[text()='Check / Money Order (5.00)']")
//	private WebElement moneyOrder;
//	@FindBy(xpath="//label[text()='Credit Card']")
//	private WebElement creditCard;
//	@FindBy(xpath="//label[text()='Purchase Order']")
//	private WebElement purchaseOrder;
	@FindBy(xpath = "//input[@onclick='PaymentMethod.save()']")
	private WebElement continuePaymentMethod;
	@FindBy(xpath = "//input[@onclick='PaymentInfo.save()']")
	private WebElement continuePaymentInformation;

	public void clickOnContinuePaymentMethod() {
		clickOnElement(continuePaymentMethod);
		clickOnElement(continuePaymentInformation);
	}

	@FindBy(xpath = "//ul/li/div/div[2]/label")
	private List<WebElement> listOfPaymentOption;

	public void listOfPaymentOptionsCheck() {
		for (int i = 0; i < listOfPaymentOption.size(); i++) {
			WebElement element = listOfPaymentOption.get(i);
			System.out.println(element.getText());
		}
	}
}
