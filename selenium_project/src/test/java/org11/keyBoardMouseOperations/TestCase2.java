package org11.keyBoardMouseOperations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import org12.seleniumUtilities.SeleniumUtil;

public class TestCase2 extends SeleniumUtil {
	public void performMouseHoverInTheMenuBar() throws InterruptedException {
		WebDriver driver=setUp("edge","https://demowebshop.tricentis.com/login");
		List<WebElement> menuList=driver.findElements(By.xpath("//ul[@class='top-menu']/li/a"));
		//Actions action=new Actions(driver);
		for(int i=0;i<menuList.size();i++) {
			SeleniumUtil.action.moveToElement(menuList.get(i)).build().perform();
			Thread.sleep(2000);
		}
		driver.quit();
	}
	public static void main(String[] args) throws InterruptedException {
		TestCase2 ref=new TestCase2();
		ref.performMouseHoverInTheMenuBar();
	}
}
