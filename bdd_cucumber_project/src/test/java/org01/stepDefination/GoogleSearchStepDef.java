package org01.stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.SeleniumUtility;

public class GoogleSearchStepDef extends SeleniumUtility{
	WebDriver driver;
	@Given("User is on google search page")
	public void user_is_on_google_search_page() {
		driver=setUp("edge","https://www.google.com");
	}

	@When("User types {string} in the search input field")
	public void user_types_in_the_search_input_field(String text) {
		typeInput(driver.findElement(By.name("q")),text);
	}

	@And("user pressed enter button")
	public void user_pressed_enter_button() {
		getActiveElement().sendKeys(Keys.ENTER);
	}

	@Then("User should to navigate search page with title {string}")
	public void user_should_to_navigate_search_page_with_title(String title) {
		String actualTitle=getCurrentTitleOfApplication(title);
		Assert.assertTrue(actualTitle.contains(title));
	}

	@Then("Close the browser")
	public void close_the_browser() {
		driver.quit();
	}
	@When("^User types (.+) in the search input field in google$")
	public void searchRequiredText(String text) {
		typeInput(driver.findElement(By.name("q")),text);
	}
	@Then("^User should to navigate search page with title (.+) on google$")
	public void validateResultPageTitle(String title) {
		String actualTitle=getCurrentTitleOfApplication(title);
		Assert.assertTrue(actualTitle.contains(title));
	}
}
