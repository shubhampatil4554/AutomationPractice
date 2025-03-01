package org14.alertsPopUp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org12.seleniumUtilities.SeleniumUtil;

public class TestCase2 extends SeleniumUtil{
	public static void main(String[] args) throws InterruptedException {
		TestCase2 ref=new TestCase2();
		ref.testDragAndDrop();
	}
	public void testDragAndDrop() throws InterruptedException {
		WebDriver driver=setUp("edge","https://www.globalsqa.com/demo-site/draganddrop/");
		List<WebElement> frameList=driver.findElements(By.cssSelector(".demo-frame"));
		WebElement frm=frameList.get(0);
		driver.switchTo().frame(frm);
		List<WebElement> imageList=driver.findElements(By.xpath("//ul[@id='gallery']/li"));
		for(int i=0;i<imageList.size();i++) {
			WebElement src=imageList.get(i);
			WebElement des=driver.findElement(By.xpath("//div[@id='trash']"));
			Thread.sleep(1000);
			SeleniumUtil.action.dragAndDrop(src, des).build().perform();
		}
		driver.quit();
	}
}
//TC4: perform drag and drop on this https://www.globalsqa.com/demo-site/draganddrop/