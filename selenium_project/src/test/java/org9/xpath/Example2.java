package org9.xpath;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.flipkart.com/samsung-mobile-store?otracker=nmenu_sub_Electronics_0_Samsung");
		WebElement element=driver.findElement(By.xpath("//div[div[1][a[text()='SAMSUNG Galaxy M35 5G (DayBreak Blue, 128 GB)']]]/div[3]/div[1]/div"));
		System.out.println(element.getText());
		driver.quit();
	}
}
//print price of SAMSUNG Galaxy M35 5G