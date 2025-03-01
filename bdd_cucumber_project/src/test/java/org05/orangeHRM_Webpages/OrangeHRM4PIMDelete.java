package org05.orangeHRM_Webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class OrangeHRM4PIMDelete extends SeleniumUtility {
	public OrangeHRM4PIMDelete(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@role='columnheader']/div[@class='oxd-checkbox-wrapper']/label/span")
	private WebElement checkBox;

	public void clickOnCheckBox() {
		clickOnElement(checkBox);
	}

	@FindBy(xpath = "//div[@class='oxd-table orangehrm-employee-list']/div[2]/div/div/div[9]/div/button[2]")
	private WebElement deleteButton;

	public void clickOnDeleteButton() {
		clickOnElement(deleteButton);
	}

	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']")
	private WebElement yesDelete;

	public void clickOnYesDelete() {
		setSleepTime(2000);
		clickOnElement(yesDelete);
	}

	@FindBy(xpath = "//span[text()='No Records Found']")
	private WebElement recordsMsg;

	public boolean verifyRecordsMsg(String msg) {
		String actual = recordsMsg.getText();
		String expected = msg;
		return actual.equals(expected);
	}
}
