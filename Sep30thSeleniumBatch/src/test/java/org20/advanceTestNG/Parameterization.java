package org20.advanceTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import org12.seleniumUtilities.SeleniumUtil;

public class Parameterization extends SeleniumUtil{
	@Parameters({ "browser" })
	@Test
	public void testCaseOne(String browser) {

	}

	@Parameters({ "username", "password" })
	@Test
	public void testCaseTwo(String username, String password) {
		System.out.println("Parameter for User Name passed as :- " + username);
		System.out.println("Parameter for Password passed as :-" + password);
	}
	@Parameters({"browser","username","password"})
	@Test
	public void testCaseThree(String browser,String username,String password) {
		System.out.println("Browser name"+browser);
		System.out.println("Parameter for User Name passed as :-"+username);
		System.out.println("Parameter for Password passed as :-"+password);
	}
	@Parameters({"browser","username","password"})
	@Test
	public void testLogInOfVtiger(String browser,String username,String password) {
		setUp(browser,"https://demo.vtiger.com/vtigercrm/index.php");
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("password")).sendKeys(Keys.ENTER);
		driver.quit();
	}
}
