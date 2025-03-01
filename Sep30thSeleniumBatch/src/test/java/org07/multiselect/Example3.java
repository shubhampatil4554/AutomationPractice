package org07.multiselect;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Example3 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("selenium");
		List<WebElement> suggList=driver.findElements(By.cssSelector("ul.G43f7e>li>div>*:nth-child(2)>*:first-child>*:first-child>span"));
		System.out.println("is suggList is equals to 10? "+(suggList.size()==10));
		for(int i=0;i<suggList.size();i++) {
			//re-initializing suggestion list to avoi staleElementException
			suggList=driver.findElements(By.cssSelector("ul.G43f7e>li>div>*:nth-child(2)>*:first-child>*:first-child>span"));
			WebElement element=suggList.get(i);
			System.out.println(element.getText());
			if(element.getText().contains("selenium")) {
				System.out.println("Suggestion contains slenium word...");
			}else {
				System.out.println("Suggestion does not contain slenium word...");
			}
		}
		driver.quit();
	}
}
