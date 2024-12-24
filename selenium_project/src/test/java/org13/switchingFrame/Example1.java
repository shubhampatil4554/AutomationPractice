package org13.switchingFrame;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org12.seleniumUtilities.SeleniumUtil;

public class Example1 extends SeleniumUtil{
	public static void main(String[] args) throws InterruptedException {
		Example1 ref=new Example1();
		ref.loginIntoActitimeWithoutIdentifyingElement();
	}
	public void loginIntoActitimeWithoutIdentifyingElement() throws InterruptedException {
		WebDriver driver=setUp("edge","https://online.actitime.com/ubs/login.do");
		//Driver will perform operation on username input field which in mouse is blinking
		driver.switchTo().activeElement().sendKeys("admin01",Keys.TAB);
		//Driver will perform operation on password input field which in mouse is blinking
		driver.switchTo().activeElement().sendKeys("admin01",Keys.ENTER);
		Thread.sleep(5000);
		driver.quit();
	}
}
//tab is use for next