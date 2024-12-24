package org11.keyBoardMouseOperations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Example2 {
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://online.actitime.com/ubs/login.do");
		WebElement usernameIPField=driver.findElement(By.id("username"));
		//type username and select it
		//usernameIPField.sendKeys("admin01",Keys.chord(Keys.CONTROL,"a"));
		//copy the content
		//usernameIPField.sendKeys(Keys.chord(Keys.CONTROL,"c"));
		//Or
		usernameIPField.sendKeys("admin01",Keys.chord(Keys.CONTROL,"a"),Keys.chord(Keys.CONTROL,"c"));
		//paste copied content into password field
		driver.findElement(By.name("pwd")).sendKeys(Keys.chord(Keys.CONTROL,"v"),Keys.ENTER);
		driver.quit();
	}
}
/* type username as admin01
copy it and paste it into password field
press enter buttton
*/