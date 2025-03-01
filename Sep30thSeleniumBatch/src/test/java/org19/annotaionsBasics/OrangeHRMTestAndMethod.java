package org19.annotaionsBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import org12.seleniumUtilities.SeleniumUtil;

public class OrangeHRMTestAndMethod extends SeleniumUtil {
	WebDriver driver;
	@BeforeTest
	public void openBrowswer() {
		// open browser
		driver = setUp("chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@BeforeMethod
	public void login() {
		// enter username
		typeRequiredText(driver.findElement(By.name("username")), "Admin");
		// enter password
		typeRequiredText(driver.findElement(By.name("password")), "admin123");
		// click on login button
		clickOnElement(driver.findElement(By.className("orangehrm-login-button")));
		getUrlMatch("/web/index.php/dashboard/index");
	}

	@Test(priority = 1)
	public void testPIMCreation() {
		// click on PIM
		clickOnElement(driver.findElement(By.xpath("//a[@href='/web/index.php/pim/viewPimModule']")));
		// click on +Add
		clickOnElement(driver.findElement(By.xpath("//button[text()=' Add ']")));
		// fill required details
		typeRequiredText(driver.findElement(By.name("firstName")), "QA");
		typeRequiredText(driver.findElement(By.className("orangehrm-lastname")), "Engineer");
		WebElement empId = driver.findElement(By.xpath("//div/div[2]/input[@class='oxd-input oxd-input--active']"));
		for (int i = 0; i < 6; i++) {
			empId.sendKeys(Keys.BACK_SPACE);
		}
		typeRequiredText(empId, "4554");
		// click on save button
		clickOnElement(driver.findElement(By.xpath("//button[text()=' Save ']")));
		// click on PIM
		clickOnElement(driver.findElement(By.xpath("//a[@href='/web/index.php/pim/viewPimModule']")));
		// search by created ID
		typeRequiredText(driver.findElement(By.xpath("//div/div[2]/input[@class='oxd-input oxd-input--active']")),
				"4554");
		for (int i = 0; i < 4; i++) {
			driver.findElement(By.xpath("//body")).sendKeys(Keys.ARROW_DOWN);
		}
		clickOnElement(driver.findElement(By.xpath("//button[text()=' Search ']")));

		// validate it
		WebElement id = driver.findElement(
				By.xpath("//div[@class='oxd-table orangehrm-employee-list']/div[2]/div/div/div[2]/div[text()='4554']"));
		String expectedId = "4554";
		String actualId = id.getText();
		Assert.assertEquals(actualId, expectedId);
	}

	@Test(priority = 2)
	public void testPIMUpdate() throws InterruptedException {
		// click on PIM
		clickOnElement(driver.findElement(By.xpath("//a[@href='/web/index.php/pim/viewPimModule']")));
		// search by created ID
		typeRequiredText(driver.findElement(By.xpath("//div/div[2]/input[@class='oxd-input oxd-input--active']")),
				"4554");
		Thread.sleep(2000);
		clickOnElement(driver.findElement(By.xpath("//button[text()=' Search ']")));
		for (int i = 0; i < 6; i++) {
			driver.findElement(By.xpath("//body")).sendKeys(Keys.ARROW_DOWN);
		}
		driver.findElement(By.xpath("//div[@role='columnheader']/div[@class='oxd-checkbox-wrapper']/label/span"))
				.click();

		// edit it
		clickOnElement(driver.findElement(
				By.xpath("//div[@class='oxd-table orangehrm-employee-list']/div[2]/div/div/div[9]/div/button[1]")));

		clickOnElement(driver.findElement(By.xpath("//a[text()='Job']")));
		Thread.sleep(2000);
		List<WebElement> dropDown = driver
				.findElements(By.xpath("//div[@class='oxd-select-text oxd-select-text--active']"));
		WebElement dropdown1 = dropDown.get(0);
		dropdown1.click();
		List<WebElement> options = driver.findElements(By.xpath("//div[@role='listbox']/div"));
		for (int i = 0; i < options.size(); i++) {
			WebElement eleClick = options.get(i);
			if (i == 2) {
				eleClick.click();
			}
		}
		for (int i = 0; i < 4; i++) {
			driver.findElement(By.xpath("//body")).sendKeys(Keys.ARROW_DOWN);
		}
		clickOnElement(driver.findElement(By.xpath("//button[text()=' Save ']")));
		clickOnElement(driver.findElement(By.xpath("//a[@href='/web/index.php/pim/viewPimModule']")));
		// search by created ID
		typeRequiredText(driver.findElement(By.xpath("//div/div[2]/input[@class='oxd-input oxd-input--active']")),
				"4554");

		clickOnElement(driver.findElement(By.xpath("//div[2]/button[text()=' Search ']")));
		for (int i = 0; i < 5; i++) {
			driver.findElement(By.xpath("//body")).sendKeys(Keys.ARROW_DOWN);
		}
		// validate it
		WebElement job = driver.findElement(By.xpath("//div[@class='oxd-table-card']/div/div[5]/div"));
		String expectedjob = "Automaton Tester";
		String actualjob = job.getText();
		Assert.assertEquals(actualjob, expectedjob);
	}

	@Test(priority = 3)
	public void testPIMDelete() throws InterruptedException {
		// click on PIM
		clickOnElement(driver.findElement(By.xpath("//a[@href='/web/index.php/pim/viewPimModule']")));
		// search by created ID
		typeRequiredText(driver.findElement(By.xpath("//div/div[2]/input[@class='oxd-input oxd-input--active']")),
				"4554");
		Thread.sleep(2000);
		clickOnElement(driver.findElement(By.xpath("//button[text()=' Search ']")));
		Thread.sleep(2000);
		for (int i = 0; i < 6; i++) {
			driver.findElement(By.xpath("//body")).sendKeys(Keys.ARROW_DOWN);
		}
		driver.findElement(By.xpath("//div[@role='columnheader']/div[@class='oxd-checkbox-wrapper']/label/span"))
				.click();
		// edit it
		clickOnElement(driver.findElement(
				By.xpath("//div[@class='oxd-table orangehrm-employee-list']/div[2]/div/div/div[9]/div/button[2]")));
		clickOnElement(driver.findElement(By.xpath("//button[text()=' Yes, Delete ']")));
		typeRequiredText(driver.findElement(By.xpath("//div/div[2]/input[@class='oxd-input oxd-input--active']")),
				"4554");
		Thread.sleep(2000);
		clickOnElement(driver.findElement(By.xpath("//button[text()=' Search ']")));
	}

	@AfterMethod
	public void logOut() {
		clickOnElement(driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")));
		clickOnElement(driver.findElement(By.xpath("//a[text()='Logout']")));
	}
	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}
}
/*
OpenBrowserAndEnterURL - @BeforeTest
	Login - @BeforeMethod
		createPIM - @Test
	Logout - @AfterMethod
	login - @BeforeMethod
		editPIM
	logout - @AfterMethod
	login - @BeforeMethod
		deletePIM
	logout - @AfterMethod
CloseBrowser - @AfterTest
*/