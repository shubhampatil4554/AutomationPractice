package org05.componentValidationAndCssAttributes;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
public class TestCase3 {
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.saucedemo.com/");
		WebElement loginCredentials=driver.findElement(By.id("login_credentials"));
		String login=loginCredentials.getText();
		String[] username=login.split("\n");
		String user=username[1];
		driver.findElement(By.id("user-name")).sendKeys(user);
		WebElement pwdCredentials=driver.findElement(By.className("login_password"));
		String pwd=pwdCredentials.getText();
		String[] password=pwd.split("\n");
		String pwd1=password[1];
		driver.findElement(By.id("password")).sendKeys(pwd1);
		driver.findElement(By.className("submit-button")).click();
		driver.quit();
	}
}
/*
TC3:
open browser and enter url https://www.saucedemo.com/
get username and password from the screen 
and try to login into application */