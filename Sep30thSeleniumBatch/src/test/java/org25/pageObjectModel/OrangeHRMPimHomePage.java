package org25.pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org12.seleniumUtilities.SeleniumUtil;

public class OrangeHRMPimHomePage extends SeleniumUtil {
	public OrangeHRMPimHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = ".orangehrm-header-container>button")
	private WebElement addButton;
	@FindBy(xpath = "//div[div[label[text()='Employee Id']]]/div[2]/input")
	private WebElement employeeIdInputField;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement searchButtonPimPage;
	@FindBy(css = ".orangehrm-vertical-padding>span")
	private WebElement searchResultCountMsg;
	@FindBy(css = ".oxd-table-body>div:nth-child(1) label")
	private WebElement firstEmpCheckBox;
	@FindBy(css = ".oxd-table-body>div:nth-child(1) .bi-pencil-fill")
	private WebElement firstEmpEditSymbol;
	@FindBy(css = ".oxd-table-body>div:nth-child(1) .bi-trash")
	private WebElement firstEmpDeleteSymbol;
	@FindBy(css = ".orangehrm-modal-footer>button:nth-of-type(2)")
	private WebElement yesButtonOnConfirmationPopUp;
	@FindBy(xpath="//div[@class='oxd-table-card']/div/div[5]/div")
	private WebElement actualJobTitle;
	// Function click on addButton
	public void clickOnAddButton() {
		clickOnElement(addButton);
	}

	// Function: search employee
	public void searchCreatedEmployee(int employeeId) {
		typeRequiredText(employeeIdInputField, String.valueOf(employeeId));
		clickOnElement(searchButtonPimPage);
		setSleepTime(2000);
	}
	public String actualJobTitle() {
		return actualJobTitle.getText();
	}
	// Function: getSearchResultMsg
	public String getSearchResultMsg() {
		setSleepTime(2000);
		return getTextFromElement(searchResultCountMsg);
	}

	// Function: editCreatedEmployee
	public void editCreatedEmployee(String jobTitle) {
		clickOnElement(firstEmpCheckBox);
		clickOnElement(firstEmpEditSymbol);
	}

	// Function: deleteCreatedEmployee
	public void deleteCreatedEmployee() {
		clickOnElement(firstEmpCheckBox);
		clickOnElement(firstEmpDeleteSymbol);
		clickOnElement(yesButtonOnConfirmationPopUp);
	}
}
