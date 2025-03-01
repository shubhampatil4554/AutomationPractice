package org08.dropDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
public class Example2 {
	//This is a standard dropdown
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoqa.com/select-menu");
		//identify dropdown uniquely 
		WebElement dropdown=driver.findElement(By.id("cars"));
		//create instance of select class 
		Select slt=new Select(dropdown);
		System.out.println("dropdown is multiselect "+slt.isMultiple());
		//now you can perform any required operation on dropdown using select class object
		Thread.sleep(2000);
		slt.selectByVisibleText("Audi");
		Thread.sleep(2000);
		slt.selectByValue("saab");
		Thread.sleep(2000);
		slt.selectByIndex(2);
		System.out.println("Get selected option count "+slt.getAllSelectedOptions().size());
		System.out.println("Dropdown list option count "+slt.getOptions().size());
		//Thread.sleep(2000);
		//slt.deselectByIndex(2);
		//Thread.sleep(2000);
		//slt.deselectByValue("saab");
		//slt.deselectByVisibleText("Audi");
		slt.deselectAll();
		driver.quit();
	}
}
/* 
Operations on Skill dropdown
	- check multiselect allowed or not
	- by default selection
	- select required value from dropdown and validation that is selected or not
	- Total options getting displayed in the dropdown
*/