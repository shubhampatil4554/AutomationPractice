package org25.pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org12.seleniumUtilities.SeleniumUtil;

public class OrangeHRMHomePage extends SeleniumUtil {
	public OrangeHRMHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(css="ul.oxd-main-menu>li:nth-of-type(2) span")
	private WebElement pimLink;
	
	public void clickOnPim() {
		clickOnElement(pimLink);
	}

	public WebElement getPimLink() {
		return pimLink;
	}
}
