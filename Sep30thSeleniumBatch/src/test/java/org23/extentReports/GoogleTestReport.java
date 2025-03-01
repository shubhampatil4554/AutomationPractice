package org23.extentReports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import org12.seleniumUtilities.SeleniumUtil;

public class GoogleTestReport extends SeleniumUtil {
	static ExtentTest et;
	static ExtentReports er;
	static WebDriver driver;
	static boolean status;

	@BeforeTest
	public void preCondition() {
		er = new ExtentReports(".\\extentReportRepo\\ActitimeTestReport1.html");
	}

	@Test(priority=1)
	public void testActitimeLoginPage() {
		et = er.startTest("LoginPageValidation");
		driver = setUp("chrome", "https://online.actitime.com/ubs/login.do");
		String expectedTitle = "actiTIME - Login";
		String actualTitle = getApplicationTitle(expectedTitle);
		status = actualTitle.equals(expectedTitle);
		Assert.assertTrue(status);
	}

	@Test(priority=2)
	public void testActitimeLoginLogout() {
		et = er.startTest("LoginLogoutValidation");
		typeRequiredText(driver.findElement(By.id("username")), "admin01");
		typeRequiredText(driver.findElement(By.name("pwd")), "admin01");
		clickOnElement(driver.findElement(By.id("loginButton")));
		String expectedTitle = "actiTIME - Enter Time-Track";
		String actualTitle = getApplicationTitle(expectedTitle);
		status = actualTitle.equals(expectedTitle);
		clickOnElement(driver.findElement(By.id("logoutLink")));
	}
	@AfterMethod
	public void getResult(ITestResult result) {
		if(result.getStatus() == ITestResult.FAILURE){
			et.log(LogStatus.FAIL, "Test Case Failed is "+result.getName());
			et.log(LogStatus.FAIL, "Test Case Failed is "+result.getThrowable());
		}else if(result.getStatus() == ITestResult.SKIP){
			et.log(LogStatus.SKIP, "Test Case Skipped is "+result.getName());
		}else if(result.getStatus() == ITestResult.SUCCESS){
			et.log(LogStatus.PASS, "Test Case pass is "+result.getName());
		}
		// ending test
		//endTest(logger) : It ends the current test and prepares to create HTML report
		er.endTest(et);
	}
	@AfterTest
	public void endReport(){
		// writing everything to document
		//flush() - to write or update test information to your report. 
        er.flush();
        //Call close() at the very end of your session to clear all resources. 
        //If any of your test ended abruptly causing any side-affects (not all logs sent to ExtentReports, information missing), this method will ensure that the test is still appended to the report with a warning message.
        //You should call close() only once, at the very end (in @AfterSuite for example) as it closes the underlying stream. 
       //Once this method is called, calling any Extent method will throw an error.
       //close() - To close all the operation
       er.close();
    }	
}
