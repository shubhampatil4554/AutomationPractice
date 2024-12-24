package org3.synchronizationWait;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExampleExplicitWait {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://online.actitime.com/ubs/login.do");
		driver.findElement(By.name("username")).sendKeys("admin01");
		driver.findElement(By.name("pwd")).sendKeys("admin01");
		driver.findElement(By.id("loginButton")).click();

		// Explicit wait -WebDriverWait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		String expectedTitle = "actiTIME - Enter Time-Track";
		
		// implementing conditional wait,this will wait for max 20 sec to get exact title match
		wait.until(ExpectedConditions.titleIs(expectedTitle));
		String actualTitle = driver.getTitle();
		System.out.println("Actual Title Received=" + actualTitle);
		System.out.println("is login Successful?" + actualTitle.equals(expectedTitle));

		// implementing conditional wait
		wait.until(ExpectedConditions.elementToBeClickable(By.id("logoutLink")));
		driver.findElement(By.id("logoutLink"));
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