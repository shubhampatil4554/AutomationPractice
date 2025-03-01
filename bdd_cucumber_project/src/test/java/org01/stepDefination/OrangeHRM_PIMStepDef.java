package org01.stepDefination;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org05.orangeHRM_Webpages.OrangeHRM1LoginPage;
import org05.orangeHRM_Webpages.OrangeHRM2PIMCreation;
import org05.orangeHRM_Webpages.OrangeHRM3PIMUpdate;
import org05.orangeHRM_Webpages.OrangeHRM4PIMDelete;
import utilities.SeleniumUtility;

public class OrangeHRM_PIMStepDef extends SeleniumUtility {
	OrangeHRM1LoginPage getOrangeHRM1LoginPage;
	OrangeHRM2PIMCreation getOrangeHRM2PIMCreation;
	OrangeHRM3PIMUpdate getOrangeHRM3PIMUpdate;
	OrangeHRM4PIMDelete getOrangeHRM4PIMDelete;

	@Given("user in login page")
	public void user_in_login_page() {
		driver = setUp("edge", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		getOrangeHRM1LoginPage = new OrangeHRM1LoginPage(driver);
		getOrangeHRM2PIMCreation = new OrangeHRM2PIMCreation(driver);
		getOrangeHRM3PIMUpdate = new OrangeHRM3PIMUpdate(driver);
		getOrangeHRM4PIMDelete = new OrangeHRM4PIMDelete(driver);
	}

	@Given("enter username")
	public void enter_username() {
		getOrangeHRM1LoginPage.enterUsername();
	}

	@Given("enter password")
	public void enter_password() {
		getOrangeHRM1LoginPage.enterPassword();
	}

	@Given("click on login")
	public void click_on_login() {
		getOrangeHRM1LoginPage.clickOnLoginButton();
	}

	@Then("verify login successful using link")
	public void verify_login_successful_using_link() {
		Assert.assertTrue(getOrangeHRM1LoginPage.getCurrentUrlForVerification());
	}

	@Given("create pim employee")
	public void create_pim_employee() {
		getOrangeHRM1LoginPage = new OrangeHRM1LoginPage(driver);
		getOrangeHRM2PIMCreation = new OrangeHRM2PIMCreation(driver);
		getOrangeHRM3PIMUpdate = new OrangeHRM3PIMUpdate(driver);
		getOrangeHRM4PIMDelete = new OrangeHRM4PIMDelete(driver);
		getOrangeHRM2PIMCreation.clickOnPIMModule();
	}

	@Given("click on add button")
	public void click_on_add_button() {
		getOrangeHRM2PIMCreation.clickOnAddButton();
	}

	@Given("^add first name as (.+)$")
	public void add_first_name_as_qa(String firstName) {
		getOrangeHRM2PIMCreation.enterFirstName(firstName);
	}

	@Given("^add last name as (.+)$")
	public void add_last_name_as_engineer(String lastName) {
		getOrangeHRM2PIMCreation.enterLastName(lastName);
	}

	@Given("^add emp Id as (.+)$")
	public void add_emp_id_as(String empId) {
		getOrangeHRM2PIMCreation.enterEmpId(empId);
	}

	@Given("click on save for new employee page")
	public void click_on_save_for_new_employee_page() {
		getOrangeHRM2PIMCreation.clickOnSaveButton();
	}

	@Given("click on pim")
	public void click_on_pim() {
		getOrangeHRM2PIMCreation.clickOnPIMModule();
	}

	@Then("^search (.+) and verify pim creation$")
	public void search_and_verify_pim_creation(String empId) {
		Assert.assertTrue(getOrangeHRM2PIMCreation.searchEmployeeField(empId));
	}

	@Given("update pim employee details")
	public void update_pim_employee_details() {
		getOrangeHRM1LoginPage = new OrangeHRM1LoginPage(driver);
		getOrangeHRM2PIMCreation = new OrangeHRM2PIMCreation(driver);
		getOrangeHRM3PIMUpdate = new OrangeHRM3PIMUpdate(driver);
		getOrangeHRM4PIMDelete = new OrangeHRM4PIMDelete(driver);
	}

	@Given("^search emp id as (.+) click on search scroll down$")
	public void search_emp_id_as_click_on_search_scroll_down(String empId) {
		getOrangeHRM3PIMUpdate.searchEmpId(empId);
	}

	@Given("click on checkBox for update")
	public void click_on_check_box_for_update() {
		getOrangeHRM3PIMUpdate.clickOnCheckBox();
	}

	@Given("click on edit button")
	public void click_on_edit_button() {
		getOrangeHRM3PIMUpdate.clickOnEditPen();
	}

	@Given("click on job link")
	public void click_on_job_link() {
		getOrangeHRM3PIMUpdate.clickOnJobLink();
	}

	@Given("click on job title dropdown")
	public void click_on_job_title_dropdown() {
		getOrangeHRM3PIMUpdate.selectJobDropDown();
	}

	@Given("^select job title as (.+)$")
	public void select_job_title(String jobTitle) {
		getOrangeHRM3PIMUpdate.selectJobTitle(jobTitle);
	}

	@Given("click on save from job page")
	public void click_on_save_from_job_page() {
		getOrangeHRM3PIMUpdate.clickOnSave();
	}

	@Then("^verify job title as (.+)$")
	public void verify_job_title_as_automaton_tester(String jobTitle) {
		getOrangeHRM3PIMUpdate.verifyJobTitle(jobTitle);
	}
	@Given("delete process start")
	public void deleteprocessstart() {
		getOrangeHRM1LoginPage = new OrangeHRM1LoginPage(driver);
		getOrangeHRM2PIMCreation = new OrangeHRM2PIMCreation(driver);
		getOrangeHRM3PIMUpdate = new OrangeHRM3PIMUpdate(driver);
		getOrangeHRM4PIMDelete = new OrangeHRM4PIMDelete(driver);
	}
	@Given("click on checkBox for delete")
	public void click_on_check_box_for_delete() {
		getOrangeHRM4PIMDelete.clickOnCheckBox();
	}

	@Given("click on delete option")
	public void click_on_delete_option() {
		getOrangeHRM4PIMDelete.clickOnDeleteButton();
	}

	@Given("click on confirmation pop up yes,Delete")
	public void click_on_confirmation_pop_up_yes_delete() {
		getOrangeHRM4PIMDelete.clickOnCheckBox();
	}

	@Then("^verify employee delete successful with (.+)$")
	public void verify_employee_delete_successful_with_no_records_found(String msg) {
		getOrangeHRM4PIMDelete.verifyRecordsMsg(msg);
	}
}
