package org08.dropDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demo.automationtesting.in/Register.html");
		// Identifying dropdown uniquely
		WebElement dropDown = driver.findElement(By.id("Skills"));
		// create an instance of Select class
		Select slt = new Select(dropDown);
		// now you can perform any required operation on dropdown using select class
		// object
		System.out.println("does dropdown allowed to select multiple options? " + slt.isMultiple());
		// dropdown multiselect option .isMultiple()
		WebElement element = slt.getFirstSelectedOption();
		System.out.println("Default selected value " + element.getText());

		Thread.sleep(5000);
		slt.selectByVisibleText("Adobe Photoshop");
		System.out.println("After selecting value using visibleText " + slt.getFirstSelectedOption().getText());

		Thread.sleep(5000);
		slt.selectByValue("Backup Management");
		System.out.println("After selecting value using value " + slt.getFirstSelectedOption().getText());

		Thread.sleep(5000);
		slt.selectByIndex(4);
		System.out.println("After selecting value using index " + slt.getFirstSelectedOption().getText());

		driver.quit();
	}
}
//Standard DropDown handling and operations