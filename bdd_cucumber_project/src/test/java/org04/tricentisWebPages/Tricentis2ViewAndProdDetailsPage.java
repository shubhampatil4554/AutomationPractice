package org04.tricentisWebPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class Tricentis2ViewAndProdDetailsPage extends SeleniumUtility {
	public Tricentis2ViewAndProdDetailsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='header-links']/ul/li[1]/a")
	private WebElement profileAccount;

	@FindBy(xpath = "//div[@class='product-grid home-page-product-grid']/div/div/div[2]/h2")
	private List<WebElement> productList;
	@FindBy(xpath = "//div[@class='product-name']/h1")
	private WebElement productName;
	public String getProductName(String prodName) {
		return productName.getText();
	}
	@FindBy(xpath = "//input[@id='add-to-cart-button-31']")
	private WebElement addToCartButton;
	@FindBy(xpath = "//span[text()='Shopping cart']")
	private WebElement shippingCart;
	

	public void getProductDetails() {
		for(int i=0;i<10;i++) {
		driver.findElement(By.xpath("//body")).sendKeys(Keys.ARROW_DOWN);
		}
		for (int i = 0; i < productList.size(); i++) {
			WebElement element = productList.get(i);
			if (i == 1) {
				clickOnElement(element);
				break;
			}
		}
	}


	public void clickOnAddToCart() {
		clickOnElement(addToCartButton);
	}

	public void clickOnShippingCartLink() {
		clickOnElement(shippingCart);
	}

	public void clickOnProfileLink() {
		clickOnElement(profileAccount);
	}

}
