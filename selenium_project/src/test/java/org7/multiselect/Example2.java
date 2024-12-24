package org7.multiselect;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.demoblaze.com/");
		List<WebElement> deviceList = driver.findElements(By.cssSelector("#tbodyid>div>div>div>h4>a"));
		System.out.println("Device list in the page?" + deviceList.size());
		for (int i = 0; i < deviceList.size(); i++) {
			WebElement element = deviceList.get(i);
			System.out.println(element.getText());
		}
		driver.quit();
	}
}
//Device name List