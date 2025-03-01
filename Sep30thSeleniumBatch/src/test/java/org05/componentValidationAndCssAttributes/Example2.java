package org05.componentValidationAndCssAttributes;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Example2 {
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		// to open browser on full screen
		driver.manage().window().maximize();
		// to avoid NoSuchElementException defining implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://online.actitime.com/ubs/login.do");
		driver.findElement(By.id("loginButton")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.textToBe(By.className("errormsg"),
				"Username or Password is invalid. Please try again."));
		WebElement errorMsg=driver.findElement(By.className("errormsg"));
		Point error_Msg_Cords=errorMsg.getLocation();
		int error_Msg_x=error_Msg_Cords.getX();
		int error_Msg_y=error_Msg_Cords.getY();
		System.out.println("Error msg X cord "+error_Msg_x);
		System.out.println("Error msg y cord "+error_Msg_y);
		
		WebElement username=driver.findElement(By.id("username"));
		Point username_Cords=username.getLocation();
		int username_Cords_x=username_Cords.getX();
		int username_Cords_y=username_Cords.getY();
		System.out.println("Username X cord "+username_Cords_x);
		System.out.println("Username Y cord "+username_Cords_y);
		
		System.out.println("Is error msg displayed above username i/p field "+(username_Cords_y > error_Msg_y));
	}
}
