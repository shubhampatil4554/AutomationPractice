package org25.pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org12.seleniumUtilities.SeleniumUtil;

public class GoogleSearchResultPage extends SeleniumUtil {
	public GoogleSearchResultPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "q")
	private WebElement searchedElement;

	public WebElement getSearchedElement() {
		return searchedElement;
	}
	public String textDisplayed() {
		return getSearchedElement().getText();
	}
}
