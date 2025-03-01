package org01.browserInstances;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestCase3 {
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://sampleapp.tricentis.com/101/app.php");
		String expectURL="https://sampleapp.tricentis.com/101/app.php";
		String actualURL=driver.getCurrentUrl();
		System.out.println("Check URL Correctly Entered or not ="+expectURL.equals(actualURL));
		driver.quit();
	}
}
