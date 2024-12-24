package org11.keyBoardMouseOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org12.seleniumUtilities.SeleniumUtil;

public class TestCase1 extends SeleniumUtil{
	public void loginWithoutIdntifyingLoginButton() {
		WebDriver driver=setUp("edge","https://demowebshop.tricentis.com/login");
		driver.findElement(By.id("Email")).sendKeys("tester01@vomoto.com");
		driver.findElement(By.id("Password")).sendKeys("Abc@12345",Keys.ENTER);
		driver.quit();
	}
	public static void main(String[] args) {
		TestCase1 ref=new TestCase1();
		ref.loginWithoutIdntifyingLoginButton();
	}
}
