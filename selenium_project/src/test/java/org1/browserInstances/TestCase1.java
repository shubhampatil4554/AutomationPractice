package org1.browserInstances;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class TestCase1 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		String expectURL = "https://www.saucedemo.com/";
		String actualURL = driver.getCurrentUrl();
		System.out.println("Check URL correctly entered or not=" + expectURL.equals(actualURL));
		driver.quit();
	}
}
