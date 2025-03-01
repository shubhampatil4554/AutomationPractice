package org.assignmentOnPageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org12.seleniumUtilities.SeleniumUtil;

public class Tricentis3ProductDetailsPage extends SeleniumUtil{
	public Tricentis3ProductDetailsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div[@class='product-name']/h1")
	private WebElement productName;
	@FindBy(xpath="//input[@id='add-to-cart-button-31']")
	private WebElement addToCartButton;
	@FindBy(xpath="//span[text()='Shopping cart']")
	private WebElement shippingCart;
	public String getProductName() {
		return productName.getText();
	}
	public void clickOnAddToCart() {
		clickOnElement(addToCartButton);
	}
	public void clickOnShippingCartLink() {
		clickOnElement(shippingCart);
	}
}
