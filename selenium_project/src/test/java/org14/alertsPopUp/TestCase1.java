package org14.alertsPopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org12.seleniumUtilities.SeleniumUtil;

public class TestCase1 extends SeleniumUtil {
	public static void main(String[] args) throws InterruptedException {
		TestCase1 ref = new TestCase1();
//		ref.testAlertPopUp();
//		ref.testPopUpAfter5Sec();
//		ref.testConfirmationPopUp();
		ref.testPromptBox();
	}

	public void testAlertPopUp() throws InterruptedException {
		WebDriver driver = setUp("edge", "https://demoqa.com/alerts");
		driver.findElement(By.xpath("//body")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//body")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//body")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//body")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//body")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//body")).sendKeys(Keys.ARROW_DOWN);
		clickOnElement(driver.findElement(By.cssSelector("#alertButton")));
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		driver.quit();
	}

	public void testPopUpAfter5Sec() throws InterruptedException {
		WebDriver driver = setUp("edge", "https://demoqa.com/alerts");
		driver.findElement(By.xpath("//body")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//body")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//body")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//body")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//body")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//body")).sendKeys(Keys.ARROW_DOWN);
		clickOnElement(driver.findElement(By.cssSelector("#timerAlertButton")));
		Thread.sleep(6000);
		driver.switchTo().alert().accept();
		driver.quit();
	}

	public void testConfirmationPopUp() throws InterruptedException {
		WebDriver driver = setUp("edge", "https://demoqa.com/alerts");
		driver.findElement(By.xpath("//body")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//body")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//body")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//body")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//body")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//body")).sendKeys(Keys.ARROW_DOWN);
		clickOnElement(driver.findElement(By.cssSelector("#confirmButton")));
		Thread.sleep(1000);
		// driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		driver.quit();
	}
	public void testPromptBox() throws InterruptedException {
		WebDriver driver = setUp("edge", "https://demoqa.com/alerts");
		driver.findElement(By.xpath("//body")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//body")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//body")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//body")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//body")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//body")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//body")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//body")).sendKeys(Keys.ARROW_DOWN);
		clickOnElement(driver.findElement(By.cssSelector("#promtButton")));
		Thread.sleep(1000);
		driver.switchTo().alert().sendKeys("Hello");
		Thread.sleep(1000);
//		driver.switchTo().alert().dismiss();
		driver.switchTo().alert().accept();
		driver.quit();
	}
}
//test all alert popups- https://demoqa.com/alerts