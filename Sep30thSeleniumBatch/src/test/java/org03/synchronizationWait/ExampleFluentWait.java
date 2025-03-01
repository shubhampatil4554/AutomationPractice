package org03.synchronizationWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class ExampleFluentWait {
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://online.actitime.com/ubs/login.do");
		driver.findElement(By.id("username")).sendKeys("admin01");
		driver.findElement(By.name("pwd")).sendKeys("admin01");
		driver.findElement(By.id("loginButton")).click();

		// Explicit Wait-Fluent Wait
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);
		
		String expectedTitle = "actiTIME - Enter Time-Track";
		
		// implementing conditional wait,this will wait for max 20 sec to get exact
		// title match
		wait.until(ExpectedConditions.titleIs(expectedTitle));
		String actualTitle = driver.getTitle();
		System.out.println("is login successful?" + expectedTitle.equals(actualTitle));
		
        //implementing conditional wait
		wait.until(ExpectedConditions.elementToBeClickable(By.id("logoutLink")));
		driver.findElement(By.id("logoutLink")).click();
		driver.quit();
	}
}
/*
 * TC:-
 * open browser
 * enter appliction
 * https://online.actitime.com/ubs/login.do
 * enter username as admin01
 * enter password as admin01
 * click login button
 * validate login is successful or not
 * click logout link
 * close the browser
 */