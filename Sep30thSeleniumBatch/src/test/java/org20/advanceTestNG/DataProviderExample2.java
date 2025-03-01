package org20.advanceTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import org12.seleniumUtilities.SeleniumUtil;

public class DataProviderExample2 extends SeleniumUtil{
	@DataProvider
	public Object[] getTextForSearch() {
		Object [] data= {"Selenium","Automation Testing","API Testing"};
		return data;
	}
	@Test(dataProvider="getTextforSearch")
	public void testGoogleSearch(String textToBeSearched) {
		setUp("chrome","https://www.google.com");
		typeRequiredText(driver.findElement(By.name("q")),textToBeSearched);
		getActiveElementFromUI().sendKeys(Keys.ENTER);
		driver.quit();
		
	}
}
