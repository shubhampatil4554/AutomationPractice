package org25.pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import org12.seleniumUtilities.SeleniumUtil;

public class OrangeHRMLoginLogoutTestScripts extends SeleniumUtil {
	WebDriver driver;
	OrangeHRMLoginPage getOrangeHRMLoginPage;
	OrangeHRMDashboardPage getOrangeHRMDashboardPage;

	@BeforeTest
	public void preRequisite() {
		driver = setUp("edge", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		getOrangeHRMLoginPage = new OrangeHRMLoginPage(driver);
		getOrangeHRMDashboardPage = new OrangeHRMDashboardPage(driver);
	}

	@Test
	public void testLoginLogout() {
		getOrangeHRMLoginPage.logIntoOrangeHRM("Admin","admin123");
		String actualUrl=getOrangeHRMLoginPage.getApplicationUrl();
		Assert.assertTrue(actualUrl.contains("dashboard"));
		getOrangeHRMDashboardPage.logoutFromOrangeHRM();
	}
}
