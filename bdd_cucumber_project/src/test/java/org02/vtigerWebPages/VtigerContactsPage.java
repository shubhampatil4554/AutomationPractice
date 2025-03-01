package org02.vtigerWebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utilities.SeleniumUtility;

public class VtigerContactsPage extends SeleniumUtility {
	public VtigerContactsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath = "//button[@id='Contacts_listView_basicAction_LBL_ADD_RECORD']")
	private WebElement createLink;
	public void clickOnCreateOption() {
		clickOnElement(createLink);
	}
	
	@FindBy(css = "#select2-chosen-2")
	private WebElement salotaionForContact;

	@FindBy(xpath = "//div[@id='select2-drop']/ul/li[2]")
	private WebElement selectSalotationTypeForContact;
	public void clickOnSalotation() {
		clickOnElement(salotaionForContact);
		clickOnElement(selectSalotationTypeForContact);
	}

	@FindBy(id = "Contacts_editView_fieldName_firstname")
	private WebElement firstNameInputField;
	public void enterFirstName(String firstName) {
		typeInput(firstNameInputField,firstName);
	}

	@FindBy(id = "Contacts_editView_fieldName_lastname")
	private WebElement lastNameInputField;
	public void enterLastName(String lastName) {
		typeInput(lastNameInputField,lastName);
	}

	@FindBy(id = "Contacts_editView_fieldName_phone")
	private WebElement phoneNoField;
	public void enterPhoneNumber(String officePhone) {
		typeInput(phoneNoField,officePhone);
	}

	@FindBy(xpath = "//button[@class='btn btn-success saveButton']")
	private WebElement newCreatedSaveButton;
	public void clickOnSaveButtonForNewCreated() {
		clickOnElement(newCreatedSaveButton);
	}
	
	@FindBy(name = "firstname")
	private WebElement firstNameInputFieldSearch;
	public void enterfirstnameforSearch(String firstName) {
		typeInput(firstNameInputFieldSearch,firstName);
	}
	
	@FindBy(xpath = "//h4[text()=' Contacts ']")
	private WebElement contactsHeaderClick;
	public void clickOnHeaderContact() {
		clickOnElement(contactsHeaderClick);
	}
	@FindBy(xpath="//input[@name='firstname']")
	private WebElement searchFirstNameField;
	@FindBy(xpath = "//span[text()='Search']")
	private WebElement searchButton;
	public void searchFirstNameField(String firstName) {
		typeInput(searchFirstNameField,firstName);
		clickOnElement(searchButton);
	}
	@FindBy(xpath="//a[text()='QA']")
	private WebElement firstNameForValidation;
	public boolean firstNameWithValidation(String firstName) {
		String actualFN=firstNameForValidation.getText();
		String expectedFN=firstName;
		return actualFN.equals(expectedFN);
	}
	public void driverQuit() {
		driver.quit();
	}
	//tr[td[span[span[a[contains(text(),'Tester')]]]]]/td[1]//input
	@FindBy(xpath = "//tr[td[span[span[a[contains(text(),'Tester')]]]]]/td[1]//input")
	private WebElement newlyCreatedCheckBox;
	public void clickOnNewlyCreatedCheckBox() {
		clickOnElement(newlyCreatedCheckBox);
	}
	@FindBy(id = "Contacts_listView_massAction_LBL_EDIT")
	private WebElement editPencil;
	public void clickOnEditPencil() {
		clickOnElement(editPencil);
	}

	@FindBy(id = "include_in_mass_edit_title")
	private WebElement titleCheckBox;
	public void clickOnTitleCheckBox() {
		clickOnElement(titleCheckBox);
	}

	@FindBy(xpath = "Contacts_editView_fieldName_title")
	private WebElement titleInputField;
	public void enterJobTitle(String title) {
		typeInput(titleInputField,title);
	}

	@FindBy(xpath = "//button[@class='btn btn-success saveButton']")
	private WebElement editSaveButton;
	public void clickOnEditPageSaveButton() {
		clickOnElement(editSaveButton);
	}
	@FindBy(xpath="//td[4]/span/span")
	private WebElement title;
	public boolean verifyTitle(String jobTitle) {
		String actualTitle=title.getText();
		String expectedTitle=jobTitle;
		return actualTitle.contains(expectedTitle);
	}
	@FindBy(xpath = "//a[contains(text(),'QA')]")
	private WebElement newlyCreatedContactName;
	

	@FindBy(id = "Contacts_listView_massAction_LBL_DELETE")
	private WebElement deleteContactLink;
	public void clickOnDeletebutton() {
		clickOnElement(deleteContactLink);
	}

	@FindBy(xpath = "//button[@data-bb-handler='confirm']")
	private WebElement yesButtonOnConfirmPopup;
	public void clickOnYes() {
		clickOnElement(yesButtonOnConfirmPopup);
	}
	@FindBy(css = ".emptyRecordsContent")
	private WebElement searchResultForNoContact;
	public boolean verifyDeleteWithText(String text) {
		String actualText=searchResultForNoContact.getText();
		String expectedText=text;
		return actualText.contains(expectedText);
	}
	
}
