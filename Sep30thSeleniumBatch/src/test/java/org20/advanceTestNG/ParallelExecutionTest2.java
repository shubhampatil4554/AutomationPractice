package org20.advanceTestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import org12.seleniumUtilities.SeleniumUtil;

public class ParallelExecutionTest2 extends SeleniumUtil {
	@Test
	public void testLoginOfVtiger() {
		driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("Test@123");
		driver.findElement(By.id("password")).sendKeys(Keys.ENTER);
		driver.quit();
	}
	@Test
	public void testLoginOfActiTime() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://online.actitime.com/ubs/login.do");
		driver.findElement(By.id("username")).sendKeys("admin01");
		driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("admin01");
		driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys(Keys.ENTER);
		driver.quit();
	}
}
