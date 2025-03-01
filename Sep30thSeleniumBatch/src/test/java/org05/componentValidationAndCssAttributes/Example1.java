package org05.componentValidationAndCssAttributes;

import org.openqa.selenium.edge.EdgeDriver;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Example1 {
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		// to open full screen
		driver.manage().window().maximize();
		// to avoid NoSuchElementException defining Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://online.actitime.com/ubs/login.do");
		WebElement userName = driver.findElement(By.id("username"));
		System.out.println("Is username input field visible on the screen?" + userName.isDisplayed());
		System.out.println("Is userName iput field editable on th screen?" + userName.isEnabled());
		System.out.println("Default value of username input field:" + userName.getAttribute("placeholder"));

		WebElement keepLoggedInCheckBox = driver.findElement(By.id("keepLoggedInCheckBox"));
		System.out.println("Is keepLoggedInCheckBox is visible?" + keepLoggedInCheckBox.isDisplayed());
		System.out.println("is keepLoggedInCheckBox is clickable?" + keepLoggedInCheckBox.isEnabled());
		System.out.println("is keepLoggedInCheckBox by default selected?" + keepLoggedInCheckBox.isSelected());
		keepLoggedInCheckBox.click();
		System.out.println("After selecting keepLoggedInCheckBox status is " + keepLoggedInCheckBox.isSelected());

		WebElement loginButton = driver.findElement(By.id("loginButton"));
		System.out.println("Is login Button is visible?" + loginButton.isDisplayed());
		System.out.println("Is login Button is Clickable?" + loginButton.isEnabled());
		System.out.println("Defaul name on Button is " + loginButton.getText());
		driver.quit();
	}
}
/*
 * Username:
 *         visible
 *         editable
 *         default value
 * CheckBox:
 *         visible
 *         functional/clickable
 *         default selection
 *         after selection
 * Button:
 *         visible
 *         functional
 *         Button name
*/