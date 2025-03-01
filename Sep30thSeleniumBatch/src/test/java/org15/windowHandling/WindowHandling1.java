package org15.windowHandling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org12.seleniumUtilities.SeleniumUtil;

public class WindowHandling1 extends SeleniumUtil{
	public static void main(String[] args) {
		WindowHandling1 ref=new WindowHandling1();
		ref.testWindowHandling();
	}
	void testWindowHandling() {
		WebDriver driver=setUp("edge", "https://etrain.info/in");
		//get current window/parent window handle
		String parentWindowId=driver.getWindowHandle();//Id1
		clickOnElement(driver.findElement(By.cssSelector(".icon-twitter")));
		//get all window ids opened by current instance
		Set<String> getAllWindow=driver.getWindowHandles();
		getAllWindow.remove(parentWindowId);
		//get child window id
		Iterator<String> itr=getAllWindow.iterator();
		String childWindowId=itr.next();
		//now you can switch your control from home window to child window
		driver.switchTo().window(childWindowId);
		String title=getApplicationTitle("Log in to X / X");
		System.out.println("Child window title: "+title);
		//close current window
		//driver.close();
		//again switch to home window
		driver.switchTo().window(parentWindowId);
		System.out.println("Home win title: "+getApplicationTitle());
		//driver.close();		
		driver.quit();
	}
}
