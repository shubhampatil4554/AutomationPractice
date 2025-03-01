package org02.locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class LoginTC2 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement loginLink=driver.findElement(By.className("ico-login"));
		loginLink.click();
		WebElement usernameInputField=driver.findElement(By.id("Email"));
		usernameInputField.sendKeys("tester01@vomoto.com");
		WebElement passwordInputField=driver.findElement(By.id("Password"));
		passwordInputField.sendKeys("Abc@12345");
		WebElement loginButton=driver.findElement(By.className("login-button"));
		loginButton.click();
		String currentTitle=driver.getTitle();
		String expectedTitle="Demo Web Shop";
		System.out.println("login successful or not?"+currentTitle.equals(expectedTitle));
		WebElement logOutLink=driver.findElement(By.linkText("Log out"));
		logOutLink.click();
		driver.quit();
	}
}
/*
 * TC2: Open browser enter application url as https://demowebshop.tricentis.com/
 * click on login enter username as tester01@vomoto.com enter password as
 * Abc@12345 click on login button validate login is done or not click on logout
 * close the browser
 */