package org24.DataDrivenTesting;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import org12.seleniumUtilities.ExcelUtil;
import org12.seleniumUtilities.SeleniumUtil;


public class Test3 extends SeleniumUtil {

	String url,userName,password,expectTitle,actualTitle,status;
	@BeforeTest
	public void precondition() {
		 url=ExcelUtil.getCellValue(".\\ExtentReport\\AppData.xlsx", "TC", 3, 0);
		 userName=ExcelUtil.getCellValue(".\\ExtentReport\\AppData.xlsx", "TC", 3, 1);
		 password=ExcelUtil.getCellValue(".\\ExtentReport\\AppData.xlsx", "TC", 3, 2);
		 expectTitle=ExcelUtil.getCellValue(".\\ExtentReport\\AppData.xlsx", "TC", 3, 3);
		 driver=setUp("edge", url);
	}

	@Test
	public void testOrangeHRMLogin() {
		typeRequiredText(driver.findElement(By.name("username")),userName);
		typeRequiredText(driver.findElement(By.name("password")),password);
		clickOnElement(driver.findElement(By.className("orangehrm-login-button")));
		
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
		ExcelUtil.updateCellValue(".\\ExtentReport\\AppData.xlsx", "TC", 3,4 , actualTitle);
		ExcelUtil.updateCellValue(".\\ExtentReport\\AppData.xlsx", "TC", 3,5 , status);
		driver.quit();
	}

}
