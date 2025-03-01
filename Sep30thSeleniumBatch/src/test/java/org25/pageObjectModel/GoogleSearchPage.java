package org25.pageObjectModel;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org12.seleniumUtilities.SeleniumUtil;

public class GoogleSearchPage extends SeleniumUtil{
	
	public GoogleSearchPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="q")
	private WebElement searchInputField;
	@FindBy(css="ul.G43f7e>li>div>*:nth-child(2)>*:first-child>*:first-child>span")
	private List<WebElement> suggestionList;
	public WebElement getSearchInputField() {
		return searchInputField;
	}
	public List<WebElement> getSuggestionList() {
		return suggestionList;
	}
	public void typeRequiredInputText(String text) {
		typeRequiredText(searchInputField,text);
	}
	public int suggestionListCount() {
		return suggestionList.size();
	}
	public void selectRequiredInputFromSuggestionList(String text) {
		for(int i=0;i<suggestionListCount();i++) {
			WebElement element=getSuggestionList().get(i);
			if(element.getText().equals(text)) {
				clickOnElement(element);
				break;
			}
		}
	}
}
