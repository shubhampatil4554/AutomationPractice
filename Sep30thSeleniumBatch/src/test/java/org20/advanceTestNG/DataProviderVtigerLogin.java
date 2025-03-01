package org20.advanceTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import org12.seleniumUtilities.SeleniumUtil;

public class DataProviderVtigerLogin extends SeleniumUtil{
	@DataProvider
	public Object[][] getCred() {
		Object[][] data = new Object[3][3];
		// 1st row
		data[0][0] = "chrome";
		data[0][1] = "admin";
		data[0][2] = "Test@123";
		// 2nd row
		data[1][0] = "firefox";
		data[1][1] = "admin3";
		data[1][2] = "@123";
		// 3rd row
		data[2][0] = "";
		data[2][1] = "";
		data[2][2] = "";
		return data;
	}
//	@Test(dataProvider="getCred")
//	public void testDataProvider(String br,String un,String pwd) {
//		System.out.println(br);
//		System.out.println(un);
//		System.out.println(pwd);
//	}
	@Test(dataProvider="getCred")
	public void loginInVtiger(String browser,String username,String password) {
		setUp(browser,"https://demo.vtiger.com/vtigercrm/index.php");
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys(password,Keys.ENTER);
		driver.quit();
	}
//	@Test
//	public void testLoginOfVtiger_valid() {
//		setUp("chrome", "https://demo.vtiger.com/vtigercrm/index.php");
//		driver.findElement(By.id("username")).clear();
//		driver.findElement(By.id("username")).sendKeys("admin");
//		driver.findElement(By.id("password")).clear();
//		driver.findElement(By.id("password")).sendKeys("Test@123", Keys.ENTER);
//		driver.close();
//	}
//	@Test
//	public void testLoginOfVtiger_invalid() {
//		setUp("chrome", "https://demo.vtiger.com/vtigercrm/index.php");
//		driver.findElement(By.id("username")).clear();
//		driver.findElement(By.id("username")).sendKeys("213admin");
//		driver.findElement(By.id("password")).clear();
//		driver.findElement(By.id("password")).sendKeys("@123", Keys.ENTER);
//		driver.close();
//	}
//
//	@Test
//	public void testLoginOfVtiger_empty() {
//		setUp("chrome", "https://demo.vtiger.com/vtigercrm/index.php");
//		driver.findElement(By.id("username")).clear();
//		driver.findElement(By.id("username")).sendKeys("");
//		driver.findElement(By.id("password")).clear();
//		driver.findElement(By.id("password")).sendKeys("", Keys.ENTER);
//		driver.close();
//	}
}
