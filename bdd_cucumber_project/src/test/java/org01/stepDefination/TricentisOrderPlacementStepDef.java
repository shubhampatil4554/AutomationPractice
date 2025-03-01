package org01.stepDefination;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org04.tricentisWebPages.Tricentis1LoginPage;
import org04.tricentisWebPages.Tricentis2ViewAndProdDetailsPage;
import org04.tricentisWebPages.Tricentis3ShippingCartPage;
import org04.tricentisWebPages.Tricentis4PaymentPage;
import org04.tricentisWebPages.Tricentis5OrderDetailsPage;
import utilities.SeleniumUtility;

public class TricentisOrderPlacementStepDef extends SeleniumUtility {
	Tricentis1LoginPage getTricentis1LoginPage;
	Tricentis2ViewAndProdDetailsPage getTricentis2ViewAndProdDetailsPage;
	Tricentis3ShippingCartPage getTricentis3ShippingCartPage;
	Tricentis4PaymentPage getTricentis4PaymentPage;
	Tricentis5OrderDetailsPage getTricentis5OrderDetailsPage;

	@Given("user is on tricentis main page")
	public void user_is_on_tricentis_main_page() {
		driver = setUp("edge", "https://demowebshop.tricentis.com/");
		getTricentis1LoginPage = new Tricentis1LoginPage(driver);
		getTricentis2ViewAndProdDetailsPage = new Tricentis2ViewAndProdDetailsPage(driver);
		getTricentis3ShippingCartPage = new Tricentis3ShippingCartPage(driver);
		getTricentis4PaymentPage = new Tricentis4PaymentPage(driver);
		getTricentis5OrderDetailsPage = new Tricentis5OrderDetailsPage(driver);

	}

	@Given("click on login link")
	public void click_on_login_link() {
		getTricentis1LoginPage.clickOnLoginLink();

	}

	@Given("enter email and password")
	public void enter_email_and_password() {
		getTricentis1LoginPage.enterEmailPassword();
	}

	@Given("click on login button")
	public void click_on_login_button() {
		getTricentis1LoginPage.clickOnLoginButton();
	}

	@Then("verify login successful with email profile")
	public void verify_login_successful_with_email_profile() {
		Assert.assertTrue(getTricentis1LoginPage.verifyEmail());
	}

	@Given("user is on product page select the product")
	public void user_is_on_product_page_select_the_product() {
		getTricentis1LoginPage = new Tricentis1LoginPage(driver);
		getTricentis2ViewAndProdDetailsPage = new Tricentis2ViewAndProdDetailsPage(driver);
		getTricentis3ShippingCartPage = new Tricentis3ShippingCartPage(driver);
		getTricentis4PaymentPage = new Tricentis4PaymentPage(driver);
		getTricentis5OrderDetailsPage = new Tricentis5OrderDetailsPage(driver);
		getTricentis2ViewAndProdDetailsPage.getProductDetails();
	}

	@Given("click on add to cart")
	public void click_on_add_to_cart() {
		getTricentis2ViewAndProdDetailsPage.clickOnAddToCart();
	}

	@Given("click on shipping cart")
	public void click_on_shipping_cart() {
		getTricentis2ViewAndProdDetailsPage.clickOnShippingCartLink();
	}

	@Then("^verify with product name as (.+)$")
	public void verify_with_product_name_as_inch_laptop(String prodName) {
		Assert.assertTrue(getTricentis3ShippingCartPage.verifyProductName(prodName));
	}

	@Then("click on check boxes")
	public void click_on_check_boxes() {
		getTricentis3ShippingCartPage.clickOnCheckBoxes();
	}

	@Then("click on checkout and continue")
	public void click_on_checkout_and_continue() {
		getTricentis3ShippingCartPage.productCheckOut();
	}

	@Given("check payment option")
	public void check_payment_option() {
		getTricentis1LoginPage = new Tricentis1LoginPage(driver);
		getTricentis2ViewAndProdDetailsPage = new Tricentis2ViewAndProdDetailsPage(driver);
		getTricentis3ShippingCartPage = new Tricentis3ShippingCartPage(driver);
		getTricentis4PaymentPage = new Tricentis4PaymentPage(driver);
		getTricentis5OrderDetailsPage = new Tricentis5OrderDetailsPage(driver);
		getTricentis4PaymentPage.listOfPaymentOptionsCheck();
	}

	@Given("select cod option")
	public void select_cod_option() {
		getTricentis4PaymentPage.clickOnCod();
	}

	@Then("click on continues")
	public void click_on_continues() {
		getTricentis4PaymentPage.clickOnContinuePaymentMethod();
	}


	@Given("click on confirm")
	public void click_on_confirm() {
		getTricentis1LoginPage = new Tricentis1LoginPage(driver);
		getTricentis2ViewAndProdDetailsPage = new Tricentis2ViewAndProdDetailsPage(driver);
		getTricentis3ShippingCartPage = new Tricentis3ShippingCartPage(driver);
		getTricentis4PaymentPage = new Tricentis4PaymentPage(driver);
		getTricentis5OrderDetailsPage = new Tricentis5OrderDetailsPage(driver);
		getTricentis5OrderDetailsPage.clickOnConfirm();
	}

	@Then("^verify successMsg with (.+) and place order$")
	public void verify_order_SuccessMsg(String successMsg) {
		Assert.assertTrue(getTricentis5OrderDetailsPage.verifyOrderSuccessMsg(successMsg));
		getTricentis5OrderDetailsPage.clickOnContinue();
	}
}
