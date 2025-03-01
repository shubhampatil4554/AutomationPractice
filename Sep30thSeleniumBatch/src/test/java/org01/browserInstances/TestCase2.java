package org01.browserInstances;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase2 {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
        driver.get("https://demowebshop.tricentis.com/");
        String expectURL="https://demowebshop.tricentis.com/";
        String actualURL=driver.getCurrentUrl();
        System.out.println("Check URL Correctly Entered or not ="+expectURL.equals(actualURL));
        driver.quit();
	}
}
