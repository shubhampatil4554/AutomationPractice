package org05.orangeHRM_Webpages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class OrangeHRM3PIMUpdate extends SeleniumUtility {
	public OrangeHRM3PIMUpdate(WebDriver Driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href='/web/index.php/pim/viewPimModule']")
	private WebElement pim;

	public void clickOnPim() {
		clickOnElement(pim);
	}

	@FindBy(xpath = "//div/div[2]/input[@class='oxd-input oxd-input--active']")
	private WebElement idInputField;
	@FindBy(xpath = "//button[text()=' Search ']")
	private WebElement searchButton;

	public void searchEmpId(String empId) {
		typeInput(idInputField, empId);
		clickOnElement(searchButton);
		for (int i = 0; i < 4; i++) {
			driver.findElement(By.xpath("//body")).sendKeys(Keys.ARROW_DOWN);
		}
	}

	@FindBy(xpath = "//div[@role='columnheader']/div[@class='oxd-checkbox-wrapper']/label/span")
	private WebElement checkBox;

	public void clickOnCheckBox() {
		clickOnElement(checkBox);
	}

	@FindBy(xpath = "//div[@class='oxd-table orangehrm-employee-list']/div[2]/div/div/div[9]/div/button[1]")
	private WebElement editPen;

	public void clickOnEditPen() {
		clickOnElement(editPen);
	}

	@FindBy(xpath = "//a[text()='Job']")
	private WebElement jobLink;

	public void clickOnJobLink() {
		clickOnElement(jobLink);
	}

	@FindBy(xpath = "//div[@class='oxd-select-text oxd-select-text--active']")
	private List<WebElement> dropDown;

	public void selectJobDropDown() {
		WebElement dropdown = dropDown.get(0);
		setSleepTime(2000);
		clickOnElement(dropdown);
	}

	@FindBy(xpath = "//div[@role='listbox']/div")
	private List<WebElement> options;

	public void selectJobTitle(String jobTitle) {
		setSleepTime(2000);
		for (int i = 0; i < options.size(); i++) {
			WebElement element = options.get(i);
			if (jobTitle.equals(element.getText())) {
				element.click();
				break;
			}
		}
		for (int i = 0; i < 4; i++) {
			driver.findElement(By.xpath("//body")).sendKeys(Keys.ARROW_DOWN);
		}
	}

	@FindBy(xpath = "//button[text()=' Save ']")
	private WebElement save;

	public void clickOnSave() {
		clickOnElement(save);
	}

	@FindBy(xpath = "//div[@class='oxd-table-card']/div/div[5]/div[text()='Automaton Tester']")
	private WebElement jobTitleVerify;

	public boolean verifyJobTitle(String jobTitle) {
		String expected = jobTitle;
		String actual = jobTitleVerify.getText();
		return expected.equals(actual);
	}

}
