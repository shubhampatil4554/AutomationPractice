package org02.locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTC1 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		// to avoid NoSuchElementException defining implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// after implicit wait,driver will have 0-30 sec to wait before throwing
		// NoSuchElementException
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		WebElement usernameInputField = driver.findElement(By.name("username"));
		usernameInputField.sendKeys("Admin");  // OR
		//Identify and perform required operation 0-30 sec
		//driver.findElement(By.name("username")).sendKeys("Admin");
		
		WebElement passwordInputField = driver.findElement(By.name("password"));
		passwordInputField.sendKeys("admin123");   //OR
		//Identify and perform required operation 0-30 sec
		//driver.findElement(By.name("password")).sendKeys("admin123");
		
		WebElement loginButton = driver.findElement(By.className("orangehrm-login-button"));
		loginButton.click();   //OR
		//driver.findElement(By.className("orangehrm-login-button")).click();
		
		String currentURL = driver.getCurrentUrl();
		System.out.println("Login successful or not?" + currentURL.endsWith("/dashboard/index"));
		
		WebElement profileImage = driver.findElement(By.className("oxd-userdropdown-img"));
		profileImage.click();  //OR
		//driver.findElement(By.className("oxd-userdropdown-img")).click();
		
		WebElement logOut=driver.findElement(By.linkText("Logout"));
		logOut.click();
		//driver.findElement(By.linkText("Logout")).click();
		
		driver.quit();
	}
}
/*
 * TC1: Open browser enter application url as
 * https://opensource-demo.orangehrmlive.com/web/index.php/auth/login enter
 * username as Admin enter password as admin123 click login button validate
 * login is successful or not click on profile icon click logout link close the
 * browser
 */