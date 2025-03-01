package org25.pageObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org12.seleniumUtilities.SeleniumUtil;

public class OrangeHRMPersonalDetailsPage extends SeleniumUtil {
	public OrangeHRMPersonalDetailsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// job Link
	@FindBy(css = ".orangehrm-tabs>div:nth-child(6)>a")
	private WebElement jobLink;
	@FindBy(xpath = "//div/div[2]/div/div[2]/div/div")
	private WebElement dropDownJobTitles;
	@FindBy(linkText = "Chief Technical Officer")
	private WebElement jobTitle;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement saveButtonJobPage;

	// Function UpdatePIM
	public void updateCreatedEmployee() {
		clickOnElement(jobLink);
		clickOnElement(dropDownJobTitles);
		clickOnElement(jobTitle);
		driver.findElement(By.xpath("//body")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//body")).sendKeys(Keys.ARROW_DOWN);
		clickOnElement(saveButtonJobPage);
	}
}
