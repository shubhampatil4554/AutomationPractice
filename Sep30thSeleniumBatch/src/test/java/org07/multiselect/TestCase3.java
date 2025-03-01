package org07.multiselect;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class TestCase3 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.gsmarena.com/");
		driver.findElement(By.cssSelector("div.brandmenu-v2>ul>li>a[href='samsung-phones-9.php']")).click();
		List<WebElement> deviceName=driver.findElements(By.cssSelector("div.makers>ul>li>a>strong>span"));
		System.out.println(deviceName.size());
		for(int i=0;i<deviceName.size();i++) {
			WebElement element=deviceName.get(i);
			System.out.println(element.getText());
		}
		driver.quit();
	}
}
/*
TC3: https://www.gsmarena.com/
click on SAMSUNG link present under phone finder and print all SAMSUNG device names
*/