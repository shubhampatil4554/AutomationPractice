package org25.pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import org12.seleniumUtilities.SeleniumUtil;

public class OrangeHRMPIMTestScripts extends SeleniumUtil {
	WebDriver driver;
	OrangeHRMLoginPage getLoginPage;
	OrangeHRMHomePage getHomePage;
	OrangeHRMPimHomePage getPimHomePage;
	OrangeHRMAddEmployeePage getAddEmployeePage;
	OrangeHRMPersonalDetailsPage getPersonalDetailsPage;

	@BeforeTest
	public void preCondition() {
		driver = setUp("edge", "https://opensource-demo.orangehrmlive.com/");
		getLoginPage = new OrangeHRMLoginPage(driver);
		getHomePage = new OrangeHRMHomePage(driver);
		getPimHomePage = new OrangeHRMPimHomePage(driver);
		getAddEmployeePage = new OrangeHRMAddEmployeePage(driver);
		getPersonalDetailsPage = new OrangeHRMPersonalDetailsPage(driver);
		getLoginPage.logIntoOrangeHRM("Admin", "admin123");
		getHomePage.clickOnPim();
	}

	@Test
	public void testPimCreation() {
		getPimHomePage.clickOnAddButton();
		getAddEmployeePage.addEmployee("Mobile", "Lead", 4554);
		getHomePage.clickOnPim();
		getPimHomePage.searchCreatedEmployee(4554);
		String actualMsg = getPimHomePage.getSearchResultMsg();
		String expectedMsg = "(1) Record Found";
		Assert.assertEquals(actualMsg, expectedMsg);
	}
	
	@Test(dependsOnMethods = "testPimCreation")
	public void testPimEdit() {
		getHomePage.clickOnPim();
		getPimHomePage.searchCreatedEmployee(4554);
		String expectedJobTitle = "Chief Technical Officer";
		getPimHomePage.editCreatedEmployee(expectedJobTitle);
		getPersonalDetailsPage.updateCreatedEmployee();
		getHomePage.clickOnPim();
		getPimHomePage.searchCreatedEmployee(4554);
		String actualJobTitle=getPimHomePage.actualJobTitle();
		Assert.assertEquals(actualJobTitle, expectedJobTitle);
	}

	@Test(dependsOnMethods = "testPimEdit")
	public void testPimDeletion() {
		getHomePage.clickOnPim();
		getPimHomePage.searchCreatedEmployee(4554);
		getPimHomePage.deleteCreatedEmployee();
		String actualMsg = getPimHomePage.getSearchResultMsg();
		String expectedMsg = "No Records Found";
		Assert.assertEquals(actualMsg, expectedMsg);
	}

	@AfterTest
	public void postCondtion() {
		driver.quit();
	}
}
