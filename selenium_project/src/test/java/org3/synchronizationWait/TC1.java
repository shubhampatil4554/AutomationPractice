package org3.synchronizationWait;

import org.openqa.selenium.edge.EdgeDriver;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC1 {
	public static void main(String[] args) {
		//open browser
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//maximize window 
		driver.manage().window().maximize();
		//enter url
		driver.get("https://demo.automationtesting.in/Register.html");
		//validate register page
		String expectedTitle = "Register";
		String actualTitle = driver.getTitle();
		System.out.println("Validate Register Page?" + expectedTitle.equals(actualTitle));
		//click on WebTable
		driver.findElement(By.linkText("WebTable")).click();
		//validate webtable page
		String expectedTitle1 = "Web Table";
		String actualTitle1 = driver.getTitle();
		System.out.println("Validate WebTable Page?" + expectedTitle1.equals(actualTitle1));
		//come back to register page
		driver.navigate().back();
		//validate register page
		String expectedTitle2 = "Register";
		String actualTitle2 = driver.getTitle();
		System.out.println("Validate Register Page?" + expectedTitle2.equals(actualTitle2));
		//go to webtable page
		driver.navigate().forward();
		//validate webtable page
		String expectedTitle3 = "Web Table";
		String actualTitle3 = driver.getTitle();
		System.out.println("Validate WebTable Page?" + expectedTitle3.equals(actualTitle3));
		//close browser
		driver.quit();
	}
}
/*
 * open browser
 * maximize window 
 * enter url https://demo.automationtesting.in/Register.html 
 * validate register page 
 * click on WebTable 
 * validate webtable page 
 * come back to register page 
 * validate register page 
 * go to webtable page 
 * validate webtable page 
 * close browser
 */