package org3.synchronizationWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExampleImplicitWait {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		// to avoid NoSuchElementException defining implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// After implicit wait,driver will have 0-30 sec to wait before throwing
		// NoSuchElementException
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//identify and perform required operation ,0-30 sec
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		//identify and perform required operation ,0-30 sec
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		driver.findElement(By.className("orangehrm-login-button")).click();
		
		driver.findElement(By.className("oxd-userdropdown-name")).click();
		
		driver.findElement(By.linkText("Logout")).click();
		
		driver.quit();
	}
}
