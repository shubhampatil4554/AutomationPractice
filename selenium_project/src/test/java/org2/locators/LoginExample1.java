package org2.locators;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginExample1 {

	public static void main(String[] args) {
		// open Browser
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");

		// Identify username
		WebElement usernameInputField = driver.findElement(By.id("user-name"));
		usernameInputField.sendKeys("standard_user");

		// Identify password
		WebElement passwordInputField = driver.findElement(By.id("password"));
		passwordInputField.sendKeys("secret_sauce");

		// Identify LoginButton
		WebElement loginButton = driver.findElement(By.className("submit-button"));
		loginButton.click();

		String currentURL = driver.getCurrentUrl();
		System.out.println("Login successfull or not?" + currentURL.endsWith("/inventory.html"));
		driver.quit();
	}
}
/*
 * Step1: identify the required element using findElement(By)
 * 
 * findElement(By)- use to identify the element using "By" class and this class
 * has predefined methods which are also known as locators and return the
 * WebElement.
 * 
 * WebElement element=driver.findElement(By.id("")); .name("")); .linkText(""));
 * .className("")); .partialLinkText("")); .tagName("")); .cssSelector(""));
 * .xpath(""));
 * 
 * Step2: once you identify the WebElement you can perform required operation it
 * a. type text ----> sendkeys(""); b. delete existing text ----> clear(); c.
 * click on element ----> click();
 * 
 * element.sendkeys("amdin"); element.clear(); element.click();
 */