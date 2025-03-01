package org05.orangeHRM_Webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class OrangeHRM2PIMCreation extends SeleniumUtility {
	public OrangeHRM2PIMCreation(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href='/web/index.php/pim/viewPimModule']")
	private WebElement pimModule;

	public void clickOnPIMModule() {
		clickOnElement(pimModule);
	}

	@FindBy(xpath = "//button[text()=' Add ']")
	private WebElement addButton;

	public void clickOnAddButton() {
		clickOnElement(addButton);
	}

	@FindBy(name = "firstName")
	private WebElement firstNameField;

	public void enterFirstName(String firstName) {
		typeInput(firstNameField, firstName);
	}

	@FindBy(className = "orangehrm-lastname")
	private WebElement lastNameField;

	public void enterLastName(String lastName) {
		typeInput(lastNameField, lastName);
	}

	@FindBy(xpath = "//div/div[2]/input[@class='oxd-input oxd-input--active']")
	private WebElement empIdField;

	public void enterEmpId(String empId) {
		empIdField.sendKeys(Keys.chord(Keys.CONTROL,"a"),Keys.BACK_SPACE);
		clickOnElement(lastNameField);
		typeInput(empIdField, empId);
	}

	@FindBy(xpath = "//button[text()=' Save ']")
	private WebElement saveButton;

	public void clickOnSaveButton() {
		clickOnElement(saveButton);
	}

	@FindBy(xpath = "//div/div[2]/input[@class='oxd-input oxd-input--active']")
	private WebElement searchEmpId;
	@FindBy(xpath = "//button[text()=' Search ']")
	private WebElement searchButton;
	@FindBy(xpath = "//div[@class='oxd-table orangehrm-employee-list']/div[2]/div/div/div[2]/div[text()='A4554']")
	private WebElement idVerify;

	public boolean searchEmployeeField(String empId) {
		typeInput(searchEmpId, empId);
		for (int i = 0; i < 4; i++) {
			driver.findElement(By.xpath("//body")).sendKeys(Keys.ARROW_DOWN);
		}
		setSleepTime(2000);
		clickOnElement(searchButton);
		String actual = idVerify.getText();
		String expected = empId;
		return actual.equals(expected);
	}
}
