package org13.switchingFrame;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org12.seleniumUtilities.SeleniumUtil;

public class TestCase1 extends SeleniumUtil{
	public static void main(String[] args) throws InterruptedException {
		TestCase1 ref=new TestCase1();
		ref.loginWithoutIdentifyingAnyObject();
	}
	public void loginWithoutIdentifyingAnyObject() throws InterruptedException {
		WebDriver driver=setUp("edge","https://demowebshop.tricentis.com/login");
		driver.switchTo().activeElement().sendKeys("tester01@vomoto.com",Keys.TAB);
		driver.switchTo().activeElement().sendKeys("Abc@12345",Keys.ENTER);
		Thread.sleep(2000);
		driver.quit();
	}
}
/*
TC1:
login into https://demowebshop.tricentis.com/login without identifying any object
tester01@vomoto.com/Abc@12345
*/