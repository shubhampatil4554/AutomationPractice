package org11.keyBoardMouseOperations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Example1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.xpath("//body")).sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//body")).sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//body")).sendKeys(Keys.PAGE_UP);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//body")).sendKeys(Keys.PAGE_UP);
		Thread.sleep(1000);
		driver.quit();
	}
}
