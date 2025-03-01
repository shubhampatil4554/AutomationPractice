package org25.pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org12.seleniumUtilities.SeleniumUtil;

public class OrangeHRMDashboardPage extends SeleniumUtil {
	public OrangeHRMDashboardPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(css=".oxd-userdropdown-img")
	private WebElement profileIcon;
	
	@FindBy(linkText="Logout")
	private WebElement logoutLink;
	
	public WebElement getProfileIcon() {
		return profileIcon;
	}
	public WebElement getLogoutLink() {
		return logoutLink;
	}
	public void logoutFromOrangeHRM() {
		clickOnElement(profileIcon);
		clickOnElement(logoutLink);
	}
	public String getDashboardUrl() {
		return getApplicationUrl();
	}
}
