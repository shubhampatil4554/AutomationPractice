package org02.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class LoginExample2 {
	public static void main(String[] args) {
		// open Browser
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");

		// Identify Username
		WebElement usernameInputField = driver.findElement(By.id("username"));
		// clear username inputField
		usernameInputField.clear();
		usernameInputField.sendKeys("admin");

		// Identify Password
		WebElement passwordInputField = driver.findElement(By.id("password"));
		// clear password inputField
		passwordInputField.clear();
		passwordInputField.sendKeys("admin");

		// Identify LoginButton
		WebElement loginButton = driver.findElement(By.className("buttonBlue"));
		loginButton.click();

		String currentTitle = driver.getTitle();
		String expectedTitle = "Dashboard";
		System.out.println("is login successful or not?"+currentTitle.equals(expectedTitle));

		driver.quit();
	}
}
