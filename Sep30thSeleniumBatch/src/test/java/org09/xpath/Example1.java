package org09.xpath;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
public class Example1 {
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.demoblaze.com/");
		WebElement element =driver.findElement(By.xpath("//div[h4[a[text()='Sony xperia z5']]]/h5"));
		System.out.println(element.getText());
		driver.quit();
	}
}
//print price of sony xperia z5