package org18.validationInTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import org12.seleniumUtilities.SeleniumUtil;

public class Example1 extends SeleniumUtil {
	@Test(enabled=true,priority=3)
	public void testActiTimeLoginWithEquals() {
		WebDriver driver=setUp("edge","https://online.actitime.com/ubs/login.do");
		typeRequiredText(driver.findElement(By.id("username")),"admin01");
		typeRequiredText(driver.findElement(By.name("pwd")),"admin01");
		clickOnElement(driver.findElement(By.id("loginButton")));
		String expectedTitle="actiTIME - Enter Time-Track";
		String actualTitle=getApplicationTitle();
		System.out.println("Is login successful? "+actualTitle.equals(expectedTitle));
	}
	@Test(enabled=true,priority=4)
	public void testActiTimeLoginWithAssert1() {
		WebDriver driver=setUp("edge","https://online.actitime.com/ubs/login.do");
		typeRequiredText(driver.findElement(By.id("username")),"admin01");
		typeRequiredText(driver.findElement(By.name("pwd")),"admin01");
		clickOnElement(driver.findElement(By.id("loginButton")));
		String expectedTitle="actiTIME - Enter Time-Track";
		String actualTitle=getApplicationTitle();
		 //System.out.println("Is login successful? "+actualTitle.equals(expectedTitle));
		//Assert.assertEquals(expectedTitle, actualTitle);
		Assert.assertEquals(expectedTitle, actualTitle,"Login failed, either title changes or invalid password entered");
	}
	@Test(enabled=true,priority=5)
	public void testActiTImeLoginWithAssert2() {
		WebDriver driver=setUp("edge","https://online.actitime.com/ubs/login.do");
		typeRequiredText(driver.findElement(By.id("username")),"admin01");
		typeRequiredText(driver.findElement(By.name("pwd")),"admin01");
		clickOnElement(driver.findElement(By.id("loginButton")));
		String expectedTitle="actiTIME - Enter Time-Track";
		String actualTitle=getApplicationTitle(expectedTitle);
		 //System.out.println("Is login successful? "+actualTitle.equals(expectedTitle));
		//Assert.assertEquals(expectedTitle, actualTitle);
		Assert.assertEquals(expectedTitle, actualTitle,"Login failed, either title changes or invalid password entered");
	}
	 @Test(enabled=true, priority=2)
	  public void testActiTimeUsernameField() {
		 WebDriver driver= setUp("edge", "https://online.actitime.com/ubs/login.do");
		 boolean res=driver.findElement(By.id("username")).isDisplayed();
		 Assert.assertTrue(res);
		 Assert.assertTrue(res,"Either application is not loaded or username input field is not available in the screen");
	}
	 @Test(enabled=true, priority=1)
	  public void testActiTimeCheckbox() {
		 WebDriver driver= setUp("edge", "https://online.actitime.com/ubs/login.do");	 
		 boolean res=driver.findElement(By.id("keepLoggedInCheckBox")).isSelected();
		 //Assert.assertFalse(res);//or
		 Assert.assertFalse(res,"Either application is not loaded or keepme logged in checkbox is already selected");
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