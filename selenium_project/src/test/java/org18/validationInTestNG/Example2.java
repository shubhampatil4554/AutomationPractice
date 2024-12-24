package org18.validationInTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import org12.seleniumUtilities.SeleniumUtil;

public class Example2 extends SeleniumUtil{
	WebDriver driver;
	@Test(enabled=true,priority=3)
	public void testActiTimeLoginWithAssert2() {
		typeRequiredText(driver.findElement(By.id("username")),"admin01");
		typeRequiredText(driver.findElement(By.name("pwd")),"admin01");
		clickOnElement(driver.findElement(By.id("loginButton")));
		String expectedTitle="actiTIME - Enter Time-Track";
		String actualTitle=getApplicationTitle(expectedTitle);
		//Assert.assertEquals(expectedTitle, actualTitle);
		Assert.assertEquals(expectedTitle, actualTitle,"Login failed, either title changes or invalid password entered");
	}
	@Test(enabled=true,priority=2)
	public void testActiTimeUsernameField() {
		boolean res=driver.findElement(By.id("username")).isDisplayed();
		//Assert.assertTrue(res);
		Assert.assertTrue(res,"Either application is not loaded or username input field is not available in the screen");
	}
	@Test(enabled=true,priority=1)
	public void testActiTimeCheckBox() {
		driver=setUp("Edge","https://online.actitime.com/ubs/login.do");
		boolean res=driver.findElement(By.id("keepLoggedInCheckBox")).isSelected();
		//Assert.assertFalse(res);
		Assert.assertFalse(res, "Either application is not loaded or keepme logged in checkbox is already selected");
	}
}
/*
Assert:
 	Assert.assertEquals(arg1, arg2);
 	Assert.assertEquals(arg1, arg2,"msg");
 	
 	Assert.assertTrue(boolean condition);//expected condition result as true to get test case pass
 	Assert.assertTrue(boolean condition,"msg");
 	
 	Assert.assertFalse(boolean condition);//expected condition result as false to get test case pass
 	Assert.assertFalse(boolean condition,"msg");
 */
