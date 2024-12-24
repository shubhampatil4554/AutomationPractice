package org7.multiselect;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Example1 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.demoblaze.com/");
		
		List<WebElement> linkList=driver.findElements(By.tagName("a"));
		System.out.println("Links in the page?"+linkList.size());
		for(int i=0;i<linkList.size();i++) {
			WebElement element=linkList.get(i);
			System.out.println(element.getAttribute("href"));
		}
		driver.quit();
	}
}
//Available Links in a page