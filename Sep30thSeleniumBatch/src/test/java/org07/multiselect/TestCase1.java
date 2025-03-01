package org07.multiselect;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.demoblaze.com/");
		List<WebElement> deviceName=driver.findElements(By.cssSelector("#tbodyid>div>div>div.card-block>h4"));
		System.out.println(deviceName.size());
		List<WebElement> devicePrice=driver.findElements(By.cssSelector("#tbodyid>div>div>div.card-block>h5"));
		System.out.println(devicePrice.size());
		for(int i=0;i<deviceName.size();i++) {
			WebElement element=deviceName.get(i);
			WebElement element1=devicePrice.get(i);
			System.out.println(element.getText()+"="+element1.getText());
		}
		driver.quit();
	}
}
/*
TC1:
Print all device name along with there price
https://www.demoblaze.com/
*/