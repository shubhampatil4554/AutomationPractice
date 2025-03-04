package org.testNGAssignments;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import org12.seleniumUtilities.SeleniumUtil;

public class OrangeHRMTestCase extends SeleniumUtil {
	ExtentReports extentReports;
	ExtentTest extentTest;
	boolean result;
	WebDriver driver;

	@BeforeClass
	public void precondition() {
		extentReports = new ExtentReports(".\\ExtentReport\\OrangeHrmPIM.html");
	}

	@Test(enabled = true, priority = 1)
	public void testPIMCreation() throws InterruptedException {
		extentTest = extentReports.startTest("OrangrHRM_PIM_Creation");
		// open browser
		driver = setUp("chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		// enter username
		typeRequiredText(driver.findElement(By.name("username")), "Admin");
		// enter password
		typeRequiredText(driver.findElement(By.name("password")), "admin123");
		// click on login button
		clickOnElement(driver.findElement(By.className("orangehrm-login-button")));
		getUrlMatch("/web/index.php/dashboard/index");
		// click on PIM
		clickOnElement(driver.findElement(By.xpath("//a[@href='/web/index.php/pim/viewPimModule']")));
		// click on +Add
		clickOnElement(driver.findElement(By.xpath("//button[text()=' Add ']")));
		// fill required details
		typeRequiredText(driver.findElement(By.name("firstName")), "QA");
		typeRequiredText(driver.findElement(By.className("orangehrm-lastname")), "Engineer");
		WebElement empId = driver.findElement(By.xpath("//div/div[2]/input[@class='oxd-input oxd-input--active']"));
		for (int i = 0; i < 4; i++) {
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
		Assert.assertEquals(expectedId, actualId);
	}

	@Test(enabled = true, priority = 2)
	public void testPIMUpdate() throws InterruptedException {
		extentTest = extentReports.startTest("OrangrHRM_PIM_Update");
		// click on PIM
		clickOnElement(driver.findElement(By.xpath("//a[@href='/web/index.php/pim/viewPimModule']")));
		// search by created ID
		typeRequiredText(driver.findElement(By.xpath("//div/div[2]/input[@class='oxd-input oxd-input--active']")),
				"4554");
		Thread.sleep(2000);
		clickOnElement(driver.findElement(By.xpath("//button[text()=' Search ']")));
		Thread.sleep(2000);
		for (int i = 0; i < 4; i++) {
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
				break;
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
		driver.findElement(By.xpath("//body")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//body")).sendKeys(Keys.ARROW_DOWN);

		// validate it
		WebElement job = driver
				.findElement(By.xpath("//div[@class='oxd-table-card']/div/div[5]/div[text()='Automaton Tester']"));
		String expectedjob = "Automaton Tester";
		String actualjob = job.getText();
		Assert.assertEquals(expectedjob, actualjob);
	}

	@Test(enabled = true, priority = 3)
	public void testPIMDelete() throws InterruptedException {
		extentTest = extentReports.startTest("OrangrHRM_PIM_Delete");
		// click on PIM
		clickOnElement(driver.findElement(By.xpath("//a[@href='/web/index.php/pim/viewPimModule']")));
		// search by created ID
		typeRequiredText(driver.findElement(By.xpath("//div/div[2]/input[@class='oxd-input oxd-input--active']")),
				"4554");
		Thread.sleep(2000);
		clickOnElement(driver.findElement(By.xpath("//button[text()=' Search ']")));
		Thread.sleep(2000);
		for (int i = 0; i < 4; i++) {
			driver.findElement(By.xpath("//body")).sendKeys(Keys.ARROW_DOWN);
		}
		driver.findElement(By.xpath("//div[@role='columnheader']/div[@class='oxd-checkbox-wrapper']/label/span"))
				.click();
		// edit it
		clickOnElement(driver.findElement(
				By.xpath("//div[@class='oxd-table orangehrm-employee-list']/div[2]/div/div/div[9]/div/button[2]")));
		clickOnElement(driver.findElement(By.xpath("//button[text()=' Yes, Delete ']")));
	}

	@AfterMethod
	public void tearDown(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			extentTest.log(LogStatus.FAIL, "Test Case Failed is " + result.getName());
			extentTest.log(LogStatus.FAIL, extentTest.addScreenCapture(screenShot(driver)),
					"Test Case Failed is " + result.getThrowable());
		} else if (result.getStatus() == ITestResult.SKIP) {
			extentTest.log(LogStatus.SKIP, "Test Case Skipped is " + result.getName());
		} else if (result.getStatus() == ITestResult.SUCCESS) {
			extentTest.log(LogStatus.PASS, extentTest.addScreenCapture(screenShot(driver)),
					"Test Case pass is " + result.getName());
		}
		extentReports.endTest(extentTest);
	}

	public static String screenShot(WebDriver driver) {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File Dest = new File(".\\src\\test\\resources\\Screenshots" + System.currentTimeMillis() + ".png");
		String errflpath = Dest.getAbsolutePath();
		try {
			FileUtils.copyFile(scrFile, Dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return errflpath;
	}
}
