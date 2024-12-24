package org11.keyBoardMouseOperations;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example3 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demo.automationtesting.in/Register.html");
		List<WebElement> menuList=driver.findElements(By.xpath("//ul[@class='nav navbar-nav']/li/a"));
		Actions act=new Actions(driver);
	/*	act.moveToElement(menuList.get(0)).perform();
		Thread.sleep(1000);
		act.moveToElement(menuList.get(2),100,0).perform(); 
	*/
		for(int i=0;i<menuList.size();i++) {
			act.moveToElement(menuList.get(i)).perform();
			Thread.sleep(1000);
		}
		driver.quit();
	}
}
