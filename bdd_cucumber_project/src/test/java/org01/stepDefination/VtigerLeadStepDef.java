package org01.stepDefination;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org02.vtigerWebPages.VtigerHomePage;
import org02.vtigerWebPages.VtigerLeadsPage;
import org02.vtigerWebPages.VtigerLoginPage;
import utilities.SeleniumUtility;

public class VtigerLeadStepDef extends SeleniumUtility {
	VtigerLoginPage getVtigerLoginPage;
	VtigerHomePage getVtigerHomePage;
	VtigerLeadsPage getVtigerLeadsPage;

	@Given("^user already in login page$")
	public void user_already_in_login_page() {
		driver = setUp("edge", "https://demo.vtiger.com/vtigercrm/index.php");
		getVtigerLoginPage = new VtigerLoginPage(driver);
		getVtigerHomePage = new VtigerHomePage(driver);
		getVtigerLeadsPage = new VtigerLeadsPage(driver);
	}

	@And("^user login successfully with valid data$")
	public void user_login_successfully_with_valid_data() {
		getVtigerLoginPage.loginInVtiger("admin", "admin");
	}

	@When("^click on navigation bar$")
	public void click_on_navigation_bar() {
		clickOnElement(getVtigerHomePage.getFlowNavigator());
	}

	@And("^go to Marketing and select Leads$")
	public void go_to_marketing_and_select_leads() {
		clickOnElement(getVtigerHomePage.getSelectMarketingOption());
		clickOnElement(getVtigerHomePage.getSelectLeadsOption());
	}

	@And("^click on Add Leads button and enter firstname as (.+) ,last as (.+) ,number as (.+) and click on save button$")
	public void enter_firstname_as_last_as_number_as_and_click_on_save_button(String firstname, String lastname,
			String number) {
		getVtigerLeadsPage.createNewLead(firstname, lastname, number);
	}

	@And("^click on All link$")
	public void click_on_all_link() {
		getVtigerLeadsPage.clickOnHeader();
	}

	@Then("^varify lead is created with (.+)$")
	public void varify_lead_is_created_with(String lastname) {
		Assert.assertTrue(getVtigerLeadsPage.checkLeadCreation());
	}

	@Given("update new lead click on header lead")
	public void update_new_lead_click_on_header_lead() {
		
	}

	@Given("^search new created lead with (.+)$")
	public void search_new_created_lead_with_ali() {
		getVtigerLeadsPage.clickOnHeader();
	}

	@Given("click on new created lead checkbox")
	public void click_on_new_created_lead_checkbox() {
		getVtigerLeadsPage.clickOnNewlyCreatedLead();
	}

	@Given("click on edit pencil for lead")
	public void click_on_edit_pencil_for_lead() {

	}

	@Given("click on company name checkbox")
	public void click_on_company_name_checkbox() {
		getVtigerLeadsPage.clickOnCompanyCheckBox();
	}

	@Given("^enter company name as (.+)$")
	public void enter_company_name_as_infosys(String companyNameText) {
		getVtigerLeadsPage.sendCompanyName(companyNameText);
	}

	@Given("click on save button on update page for lead")
	public void click_on_save_button_on_update_page_for_lead() {
		getVtigerLeadsPage.clickOnSaveButton();
	}

	@And("^validate with it (.+)$")
	public void validate_with_it_companyName(String text) {
		Assert.assertTrue(getVtigerLeadsPage.verifyCompanyName().contains(text));
	}

	@And("click on newly created lead checkbox")
	public void selectNewlyCreatedLeadCheckbox() {
		getVtigerLeadsPage.clickOnNewlyCreatedLead();
	}

	@When("^click on select all leads checkbox$")
	public void click_on_select_all_leads_checkbox() {
		getVtigerLeadsPage.selectAllLeadsCheckBox();
	}

	@Then("^varify that all leads deleted$")
	public void varify_that_all_leads_deleted() {
		setSleepTime(2000);
		Assert.assertEquals(getVtigerLeadsPage.getLeadsList("class"), "emptyRecordsDiv", "Leads are not deleted");
	}

	@And("^click on delete logo$")
	public void click_on_delete_logo() {
		getVtigerLeadsPage.clickOnDeleteLogo();
	}

	@And("^user will get a popup to comfirm deletion, select Yes$")
	public void user_will_get_a_popup_to_comfirm_deletion_select_yes() {
		getVtigerLeadsPage.confirmLeadDeletion();
	}

	@And("close the browser")
	public void closeBrowserInstance() {
		driver.quit();
	}

	@And("^varify that newly created lead (.+) is deleted$")
	public void validateNewlyCreatedLeadDeletion(String firstName) {
		getVtigerLeadsPage.searchNewlyCreatedLead(firstName);
		Assert.assertTrue(getVtigerLeadsPage.leadSearchResultAfterDeletion().contains("No Leads Found"));

	}

	@And("^click on edit$")
	public void clickOnEdit() {
		getVtigerLeadsPage.clickOnEditButton();
	}

	@Then("^click on company checkbox and enter (.+) click on save button$")
	public void updateCompanyName(String companyName) {
		setSleepTime(3000);
		getVtigerLeadsPage.clickOnCompanyCheckBox();
		getVtigerLeadsPage.sendCompanyName(companyName);
		getVtigerLeadsPage.clickOnSaveButton();
	}

	@And("^verify lead is updated with (.+)$")
	public void verifyCompanyName(String companyName) {
		String actual = getVtigerLeadsPage.verifyCompanyName();
		String expected = companyName;
		Assert.assertTrue(actual.contains(expected));
	}
}
