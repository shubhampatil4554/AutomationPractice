package org8.dropDown;

import java.util.List;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
public class Example3 {
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoqa.com/select-menu");
		//custom dropdown handling
		driver.findElement(By.cssSelector("#selectOne>div>*:first-child")).click();
		//get all options
		List<WebElement> options=driver.findElements(By.cssSelector("div[id^='react-select-3-option']"));
		System.out.println("Options count "+options.size());
		for(WebElement element :options) {
			System.out.println(element.getText());
		}
		options.get(3).click();
		driver.quit();
	}
}
//handling custom drop drown