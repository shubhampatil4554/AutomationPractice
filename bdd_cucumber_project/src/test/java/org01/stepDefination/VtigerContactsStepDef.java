package org01.stepDefination;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org02.vtigerWebPages.VtigerContactsPage;
import org02.vtigerWebPages.VtigerHomePage;
import org02.vtigerWebPages.VtigerLeadsPage;
import org02.vtigerWebPages.VtigerLoginPage;
import utilities.SeleniumUtility;

public class VtigerContactsStepDef extends SeleniumUtility {
	VtigerLoginPage getVtigerLoginPage;
	VtigerHomePage getVtigerHomePage;
	VtigerContactsPage getVtigerContactsPage;

	@Given("user is on login page")
	public void user_is_on_login_page() {
		driver = setUp("edge", "https://demo.vtiger.com/vtigercrm/index.php");
		getVtigerLoginPage = new VtigerLoginPage(driver);
		getVtigerHomePage = new VtigerHomePage(driver);
		getVtigerContactsPage = new VtigerContactsPage(driver);
	}

	@Given("enter username enter password click on login button")
	public void enter_username_enter_password_click_on_login_button() {
		getVtigerLoginPage.loginInVtiger("admin", "admin");
	}

	@Then("validate login sucessful")
	public void validate_login_sucessful() {
		Assert.assertTrue(getVtigerHomePage.urlVerify());
	}

	@Then("click on navigation bar for contact")
	public void click_on_Navigation_bar() {
		getVtigerHomePage.flownavigator();
	}

	@Then("click on marketing")
	public void click_on_marketing() {
		getVtigerHomePage.clickOnMarketingOption();
	}

	@Then("click on contacts")
	public void clickOnContacts() {
		getVtigerHomePage.clickOnContactOption();
	}

	@Given("create new contact")
	public void create_new_contact() {
		getVtigerContactsPage.clickOnCreateOption();
	}

	@Given("click on salotation")
	public void click_on_salotation() {
		getVtigerContactsPage.clickOnSalotation();
	}

	@Given("^enter firstname as (.+)$")
	public void enter_firstname_as_qa(String firstName) {
		getVtigerContactsPage.enterFirstName(firstName);
	}

	@Given("^enter lastname as (.+)$")
	public void enter_lastname_as_tester(String lastName) {
		getVtigerContactsPage.enterLastName(lastName);
	}

	@Given("^enter office phone as (.+)$")
	public void enter_office_phone_as(String officePhone) {
		getVtigerContactsPage.enterPhoneNumber(officePhone);
	}

	@Given("click on save on new created contact page")
	public void click_on_save_on_new_created_contact_page() {
		getVtigerContactsPage.clickOnSaveButtonForNewCreated();
	}

	@Given("click on header contacts")
	public void click_on_header_contacts() {
		getVtigerContactsPage.clickOnHeaderContact();
	}

	@Given("^search new created contact with first name (.+)$")
	public void search_new_created_contact(String firstName) {
		getVtigerContactsPage.searchFirstNameField(firstName);
	}

	@Then("^valiadate new created with (.+)$")
	public void valiadate_new_created_with_qa(String firstName) {
		getVtigerContactsPage.firstNameWithValidation(firstName);
	}

	@Then("quit the browser")
	public void quit_the_browser() {
		getVtigerContactsPage.driverQuit();
	}

	@Given("update new contact click on header contact")
	public void update_new_contact_click_on_header_contact() {
		getVtigerContactsPage.clickOnHeaderContact();
	}

	@Given("click on new created contact checkbox")
	public void click_on_new_created_contact_checkbox() {
		getVtigerContactsPage.clickOnNewlyCreatedCheckBox();
	}

	@Given("click on edit pencil")
	public void click_on_edit_pencil() {
		getVtigerContactsPage.clickOnEditPencil();
	}

	@Given("click on job title checkbox")
	public void click_on_job_title_checkbox() {
		getVtigerContactsPage.clickOnTitleCheckBox();
	}

	@Given("^enter job title as (.+)$")
	public void enter_job_title_as_test_engineer(String title) {
		getVtigerContactsPage.enterJobTitle(title);
	}

	@Given("click on save button on update page")
	public void click_on_save_button_on_update_page() {
		getVtigerContactsPage.clickOnEditPageSaveButton();
	}

	@Then("^validate with title as (.+)$")
	public void validate_with_it_test_engineer(String title) {
		getVtigerContactsPage.verifyTitle(title);
	}

	@Given("click on delete button")
	public void click_on_delete_button() {
		getVtigerContactsPage.clickOnDeletebutton();
	}

	@Then("click on yes button of confirmation pop up")
	public void click_on_yes_button_of_confirmation_pop_up() {
		getVtigerContactsPage.clickOnYes();
	}

	@Then("^delete verify with (.+)$")
	public void delete_verify_with_text(String text) {
		getVtigerContactsPage.verifyDeleteWithText(text);
	}
}
