package org05.componentValidationAndCssAttributes;

import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestCase1 {
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.className("login-button")).click();
		WebElement errormsg = driver.findElement(By.className("validation-summary-errors"));
		System.out.println("Validate Error msg is displayed=" + errormsg.isDisplayed());
		Point errorMsgLoc = errormsg.getLocation();
		int errormsg_x = errorMsgLoc.getX();
		int errormsg_y = errorMsgLoc.getY();
		System.out.println("Error Msg X cords=" + errormsg_x);
		System.out.println("Error Msg Y cords=" + errormsg_y);
		System.out.println("Error Msg color="+errormsg.getCssValue("color"));
		System.out.println("Error Msg font size="+errormsg.getCssValue("font-size"));
		System.out.println("Error Msg font family="+errormsg.getCssValue("font-family"));
		WebElement email = driver.findElement(By.id("Email"));
		System.out.println("Email input field is displayed=" + email.isDisplayed());
		Point emailLoc = email.getLocation();
		int email_x = emailLoc.getX();
		int email_y = emailLoc.getY();
		System.out.println("Email X cords=" + email_x);
		System.out.println("Email Y cords=" + email_y);
		System.out.println("validate error msg diplayed above email inputField=" + (email_y > errormsg_y));
		System.out.println("Error Msg color="+errormsg.getCssValue("color"));
		System.out.println("Error Msg font size="+errormsg.getCssValue("font-size"));
		System.out.println("Error Msg font family="+errormsg.getCssValue("font-family"));
		driver.quit();
	}
}
/*
 * TC1: 
 * open browser and url https://demowebshop.tricentis.com/login
 * click on login button 
 * validate: error msg is getting displayed above email id input field 
 * error msg color,error msg font-size, error msg font-family
 */