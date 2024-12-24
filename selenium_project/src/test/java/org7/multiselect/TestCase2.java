package org7.multiselect;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class TestCase2 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.gsmarena.com/");
		List<WebElement> brandNames=driver.findElements(By.cssSelector("div.brandmenu-v2>ul>li>a"));
		System.out.println(brandNames.size());
		for(int i=0;i<brandNames.size();i++) {
			WebElement element=brandNames.get(i);
			System.out.println(element.getText());
		}
		driver.quit();
	}
}
/*
TC2: https://www.gsmarena.com/
Get the all device name present under phone finder 
 */