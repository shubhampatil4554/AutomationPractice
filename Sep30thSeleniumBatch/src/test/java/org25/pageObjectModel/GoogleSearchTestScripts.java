package org25.pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import org12.seleniumUtilities.SeleniumUtil;

public class GoogleSearchTestScripts extends SeleniumUtil{
	WebDriver driver;
	GoogleSearchPage getGoogleSearchPage;
	GoogleSearchResultPage getGoogleSearchResultPage;
	String text="selenium";
	@BeforeTest
	public void preRequisite() {
		driver=setUp("edge","https://www.google.com");
		getGoogleSearchPage=new GoogleSearchPage(driver);
		getGoogleSearchResultPage=new GoogleSearchResultPage(driver);
	}
	@Test(priority=1)
	public void validateSuggestionCount() {
		getGoogleSearchPage.typeRequiredInputText(text);
		int actualCount=getGoogleSearchPage.suggestionListCount();
		Assert.assertTrue(actualCount==10);
	}

	@Test(priority=2)
	public void validateSeletedSuggestionIsDisplayed() {
		getGoogleSearchPage.selectRequiredInputFromSuggestionList(text);
		String actualText=getGoogleSearchResultPage.textDisplayed();
		Assert.assertTrue(actualText.equals(text));
	}
}
