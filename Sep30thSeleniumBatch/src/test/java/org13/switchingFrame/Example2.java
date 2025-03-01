package org13.switchingFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org12.seleniumUtilities.SeleniumUtil;

public class Example2 extends SeleniumUtil {
	public static void main(String[] args) throws InterruptedException {
		Example2 ref=new Example2();
		ref.handlingFrameUsingWebElement();
		ref.handlingFrameUsingIndex();
	}
	public void handlingFrameUsingWebElement() throws InterruptedException {
		WebDriver driver=setUp("edge","https://jqueryui.com/");
		clickOnElement(driver.findElement(By.linkText("Autocomplete")));////from seleniumutil
		//to perform any operation inside the Frame, get inside the frame 1st
		WebElement frm=driver.findElement(By.cssSelector(".demo-frame"));
		driver.switchTo().frame(frm);
		//now you are allowed to perform operation inside the frame only
		typeRequiredText(driver.findElement(By.id("tags")),"ja");////from seleniumutil
		Thread.sleep(1000);
		driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		//to perform operation on the element present outside the frame, dn switch to main page
		driver.switchTo().defaultContent();
		clickOnElement(driver.findElement(By.cssSelector(".logo")));//from seleniumutil
		driver.quit();
	}
	public void handlingFrameUsingIndex() throws InterruptedException {
		WebDriver driver=setUp("edge","https://jqueryui.com/");
		clickOnElement(driver.findElement(By.linkText("Autocomplete")));
		//to perform any operation inside the Frame, get inside the frame 1st
		driver.switchTo().frame(0);
		//now you are allowed to perform operation inside the frame only
	    typeRequiredText(driver.findElement(By.id("tags")),"ja");
		Thread.sleep(1000);
	    driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		//to perform operation on the element present outside the frame, dn switch to main page
		driver.switchTo().defaultContent();
		clickOnElement(driver.findElement(By.cssSelector(".logo")));
		driver.quit();
	}
	
}
