package org1.browserInstances;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;

public class GenericBrowserLaunch1 {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		// Enter application url
		driver.get("https://demo.automationtesting.in/Register.html");
		// validate title
		String expectTitle = "Register";
		String actualTitle = driver.getTitle();
		System.out.println("is registration page opened? " + expectTitle.equals(actualTitle));
		// validate url
		String expectURL = "https://demo.automationtesting.in/Register.html";
		String actualURL = driver.getCurrentUrl();
		System.out.println("is registration url entered correctly? " + expectURL.equals(actualURL));
		driver.quit();
	}
}
