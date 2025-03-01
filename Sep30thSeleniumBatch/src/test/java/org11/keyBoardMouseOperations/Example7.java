package org11.keyBoardMouseOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org12.seleniumUtilities.SeleniumUtil;

public class Example7 extends SeleniumUtil {
	public static void main(String[] args) {
		Example7 ref=new Example7();
		ref.performDragAndDrop();
	}

	public void performDragAndDrop() {
		WebDriver driver = setUp("edge", "https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		WebElement src = driver.findElement(By.id("draggable"));
		WebElement des = driver.findElement(By.id("droppable"));
		dragAndDropElements(src, des);
		driver.quit();
	}
}
