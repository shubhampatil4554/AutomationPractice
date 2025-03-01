package org11.keyBoardMouseOperations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example6 {
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://jqueryui.com/draggable/");
		driver.switchTo().frame(0);
		Actions act=new Actions(driver);
		
		WebElement src=driver.findElement(By.id("draggable"));
		act.dragAndDropBy(src,100,0).build().perform();
		driver.quit();
	}
}
