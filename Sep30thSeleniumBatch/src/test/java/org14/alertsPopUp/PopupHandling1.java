package org14.alertsPopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org12.seleniumUtilities.SeleniumUtil;

public class PopupHandling1 extends SeleniumUtil {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PopupHandling1 ref=new PopupHandling1();
		ref.handleAlertPopup();
		//ref.handleConfirmationPopup();
		//ref.handlePromptPopup();
	}
	public void handlePromptPopup() {
		WebDriver driver = setUp("edge", "https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.switchTo().frame("iframeResult");
		clickOnElement(driver.findElement(By.xpath("//button[text()='Try it']")));
		System.out.println("Alert Msg: " + driver.switchTo().alert().getText());
		driver.switchTo().alert().sendKeys("Pune");
		// driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		System.out.println("Button operation: " + driver.findElement(By.id("demo")).getText());
	}

	public void handleConfirmationPopup() {
		WebDriver driver = setUp("edge", "https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.switchTo().frame("iframeResult");
		clickOnElement(driver.findElement(By.xpath("//button[text()='Try it']")));
		// driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		System.out.println("Button operation: " + driver.findElement(By.id("demo")).getText());
	}

	public void handleAlertPopup() {
		WebDriver driver = setUp("edge", "https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		driver.switchTo().frame("iframeResult");
		clickOnElement(driver.findElement(By.xpath("//button[text()='Try it']")));
		System.out.println("Alert Msg: " + driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
	}
}
