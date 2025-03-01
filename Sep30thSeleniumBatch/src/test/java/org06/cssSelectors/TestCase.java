package org06.cssSelectors;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class TestCase {
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebElement credentials = driver.findElement(By.className("orangehrm-demo-credentials"));
		System.out.println("Credentials are displayed=" + credentials.isDisplayed());
		WebElement username = driver.findElement(By.cssSelector("div.orangehrm-demo-credentials>p:nth-child(1)"));
		String username1 = username.getText();
		String username2[] = username1.split(" : ");
		String username3 = username2[1];
		System.out.println(username3);
		WebElement password = driver.findElement(By.cssSelector("div.orangehrm-demo-credentials>p:nth-of-type(2)"));
		String pwd = password.getText();
		String pwd1[] = pwd.split(" : ");
		String pwd2 = pwd1[1];
		System.out.println(pwd2);
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys(username3);
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys(pwd2);
		driver.findElement(By.className("orangehrm-login-button")).click();
		driver.quit();
	}
}
/*
 * TC2: open browser and enter url
 * https://opensource-demo.orangehrmlive.com/web/index.php/auth/login get
 * username and password from the screen and try to login into application
 */
