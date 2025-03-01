package org11.keyBoardMouseOperations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example4 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://online.actitime.com/ubs/login.do");
		Actions act = new Actions(driver);
		WebElement usernameIPField = driver.findElement(By.id("username"));
		usernameIPField.sendKeys("admin01");
		act.moveToElement(usernameIPField).doubleClick().build().perform();
		//copy username
		usernameIPField.sendKeys(Keys.chord(Keys.CONTROL,"c"));
		Thread.sleep(2000);
		//paste copied content into password field and press enter button
		driver.findElement(By.name("pwd")).sendKeys(Keys.chord(Keys.CONTROL,"v"),Keys.ENTER);
		Thread.sleep(2000);
		driver.quit();
	}
}
/*
 * type username as amdin01 copy it and paste it into password field press enter
 * button
 */