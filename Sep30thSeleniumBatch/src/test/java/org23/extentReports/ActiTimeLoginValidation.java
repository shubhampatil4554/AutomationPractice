package org23.extentReports;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import org12.seleniumUtilities.SeleniumUtil;

public class ActiTimeLoginValidation extends SeleniumUtil{
	ExtentReports extentReports;
	ExtentTest extentTest;
	boolean result;
	@BeforeClass
	public void preCondition() {
		extentReports =new ExtentReports(".\\ExtentReport\\ActiTimeValidation.html");
		extentTest=extentReports.startTest("TestingActitimeLogin");
	}
	@Test
	public void testActitimeLogin() {
		setUp("chrome", "https://online.actitime.com/ubs/login.do");
		String expectedTitle="actiTIME - Login";
		String actualTitle=getApplicationTitle();
		result=actualTitle.equals(expectedTitle);
		Assert.assertTrue(result, "Login validation failed");
	}	
	@AfterClass
	public void postcondition() {
		
		if(result) {
			extentTest.log(LogStatus.PASS, "Login validation is successfull");
		}else {
			extentTest.log(LogStatus.FAIL, "Login validation is not successfull");
		}		
		extentReports.endTest(extentTest);
		extentReports.flush();
	}
}
