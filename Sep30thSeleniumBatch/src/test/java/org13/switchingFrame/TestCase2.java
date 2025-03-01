package org13.switchingFrame;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org12.seleniumUtilities.SeleniumUtil;

public class TestCase2 extends SeleniumUtil {
	public static void main(String[] args) throws InterruptedException {
		TestCase2 ref = new TestCase2();
		ref.sortTheElementWebElement();
		ref.sortTheElementIndex();

	}

	public void sortTheElementIndex() throws InterruptedException {
		WebDriver driver = setUp("edge", "https://jqueryui.com/");
		clickOnElement(driver.findElement(By.linkText("Sortable")));
		driver.switchTo().frame(0);
		List<WebElement> itemList = driver.findElements(By.xpath("//body/ul/li"));
		for (int i = 0; i <(itemList.size()-1); i++) {
			Thread.sleep(2000);
			itemList = driver.findElements(By.xpath("//body/ul/li"));
			SeleniumUtil.action.dragAndDrop(itemList.get(itemList.size()-1), itemList.get(i)).build().perform();
		}
		driver.quit();
	}

	public void sortTheElementWebElement() throws InterruptedException {
		WebDriver driver = setUp("edge", "https://jqueryui.com/");
		clickOnElement(driver.findElement(By.linkText("Sortable")));
		WebElement frm = driver.findElement(By.cssSelector(".demo-frame"));
		driver.switchTo().frame(frm);
		List<WebElement> itemList = driver.findElements(By.xpath("//body/ul/li"));
		for (int i = 0; i <(itemList.size()-1); i++) {
			Thread.sleep(2000);
			itemList = driver.findElements(By.xpath("//body/ul/li"));
			SeleniumUtil.action.dragAndDrop(itemList.get(itemList.size()-1), itemList.get(i)).build().perform();
		}
		driver.quit();
	}
}
/*
 * TC2:- https://jqueryui.com/ click on sortable sort the elements
 */