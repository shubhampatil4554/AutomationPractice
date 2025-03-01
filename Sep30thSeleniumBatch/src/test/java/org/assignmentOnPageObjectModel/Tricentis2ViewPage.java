package org.assignmentOnPageObjectModel;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org12.seleniumUtilities.SeleniumUtil;

public class Tricentis2ViewPage extends SeleniumUtil {
	public Tricentis2ViewPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//span[text()='Shopping cart']")
	private WebElement shippingCart;
	@FindBy(xpath="//div[@class='header-links']/ul/li[1]/a")
	private WebElement profileAccount;
	@FindBy(xpath="//div[@class='product-grid home-page-product-grid']")
	private List<WebElement> productList;
	
	public void clickOnShippingCart() {
		clickOnElement(shippingCart);
	}
	public void clickOnProfileLink() {
		clickOnElement(profileAccount);
	}
	public void getProductDetails() {
		for(int i=0;i<productList.size();i++) {
			WebElement element=productList.get(i);
			if(i==2) {
				clickOnElement(element);
				break;
			}
		}
	}
}
