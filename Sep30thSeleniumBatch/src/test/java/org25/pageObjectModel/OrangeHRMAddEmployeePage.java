package org25.pageObjectModel;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org12.seleniumUtilities.SeleniumUtil;

public class OrangeHRMAddEmployeePage extends SeleniumUtil {
	public OrangeHRMAddEmployeePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// First Name
	@FindBy(name = "firstName")
	private WebElement firstNameInputField;
	// Last Name
	@FindBy(name = "lastName")
	private WebElement lastNameInputField;
	// EmployeeId
	@FindBy(xpath = "//div[div[label[text()='Employee Id']]]/div[2]/input")
	private WebElement employeeIdInputField;
	// Save Button
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement saveButtonOnAddEmployeePage;

	// Function: AddEmployee
	public void addEmployee(String firstName, String lastName, int empId) {
		typeRequiredText(firstNameInputField, firstName);
		typeRequiredText(lastNameInputField, lastName);
		setSleepTime(2000);
		getActiveElementFromUI().sendKeys(Keys.TAB, Keys.BACK_SPACE);
		waitUntilElementVisible(employeeIdInputField);
		typeRequiredText(employeeIdInputField, String.valueOf(empId));
		setSleepTime(1000);
		clickOnElement(saveButtonOnAddEmployeePage);
	}
}
