package org24.DataDrivenTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import org12.seleniumUtilities.ExcelUtil;
import org12.seleniumUtilities.SeleniumUtil;


public class Test2 extends SeleniumUtil {

	String url,userName,password,expectTitle,actualTitle,status;
	@BeforeTest
	public void precondition() {
		 url=ExcelUtil.getCellValue(".\\ExtentReport\\AppData.xlsx", "TC", 2, 0);
		 userName=ExcelUtil.getCellValue(".\\ExtentReport\\AppData.xlsx", "TC", 2, 1);
		 password=ExcelUtil.getCellValue(".\\ExtentReport\\AppData.xlsx", "TC", 2, 2);
		 expectTitle=ExcelUtil.getCellValue(".\\ExtentReport\\AppData.xlsx", "TC", 2, 3);
		 driver=setUp("edge", url);
	}

	@Test
	public void testVtigerLogin() {
		WebElement userIP=driver.findElement(By.id("username"));
		userIP.sendKeys(Keys.chord(Keys.CONTROL,"a"),Keys.BACK_SPACE);
		typeRequiredText(userIP,userName);
		WebElement passWord=driver.findElement(By.id("password"));
		passWord.sendKeys(Keys.chord(Keys.CONTROL,"a"),Keys.BACK_SPACE);
		typeRequiredText(passWord,password);
		clickOnElement(driver.findElement(By.className("buttonBlue")));
		
		actualTitle=getApplicationTitle(expectTitle);
		if(actualTitle.equals(expectTitle)) {
			status="PASS";
		}else {
			status="FAIL";
		}
		Assert.assertEquals(actualTitle,expectTitle, "Either login failed or page title got changed....");
	}
	@AfterTest
	public void postCondition() {
		ExcelUtil.updateCellValue(".\\ExtentReport\\AppData.xlsx", "TC", 2,4 , actualTitle);
		ExcelUtil.updateCellValue(".\\ExtentReport\\AppData.xlsx", "TC", 2,5 , status);
		driver.quit();
	}

}
