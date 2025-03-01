package org24.DataDrivenTesting;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import org12.seleniumUtilities.ExcelUtil;
import org12.seleniumUtilities.SeleniumUtil;


public class NewTest1 extends SeleniumUtil {

	String url,userName,password,expectTitle,actualTitle,status;
	@BeforeTest
	public void precondition() {
		 url=ExcelUtil.getCellValue(".\\ExtentReport\\AppData.xlsx", "TC", 1, 0);
		 userName=ExcelUtil.getCellValue(".\\ExtentReport\\AppData.xlsx", "TC", 1, 1);
		 password=ExcelUtil.getCellValue(".\\ExtentReport\\AppData.xlsx", "TC", 1, 2);
		 expectTitle=ExcelUtil.getCellValue(".\\ExtentReport\\AppData.xlsx", "TC", 1, 3);
		 driver=setUp("edge", url);
	}

	@Test
	public void testActitimeLogin() {
		typeRequiredText(driver.findElement(By.id("username")),userName);
		typeRequiredText(driver.findElement(By.name("pwd")),password);
		clickOnElement(driver.findElement(By.id("loginButton")));
		
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
		ExcelUtil.updateCellValue(".\\ExtentReport\\AppData.xlsx", "TC", 1,4 , actualTitle);
		ExcelUtil.updateCellValue(".\\ExtentReport\\AppData.xlsx", "TC", 1,5 , status);
		driver.quit();
	}

}
//Data should be taken from Excel and result should be update on excel
