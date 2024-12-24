package org2.locators;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class LoginTC3 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/login");
		String currentURL = driver.getCurrentUrl();
		String expectedURL = "https://www.opencart.com/index.php?route=account/login";
		System.out.println("login page successful opened or not?" + currentURL.equals(expectedURL));
		driver.quit();
	}
}
/*
 * TC3: Open browser enter application url as
 * https://www.opencart.com/index.php?route=account/login validate login page
 * opened or not close browser
 */
