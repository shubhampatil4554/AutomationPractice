package org15.windowHandling;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import org12.seleniumUtilities.SeleniumUtil;

public class TestCase1 extends SeleniumUtil {
	public static void main(String[] args) throws InterruptedException {
		TestCase1 ref = new TestCase1();
		ref.testTrainApp();
	}

	public void testTrainApp() throws InterruptedException {
		WebDriver driver = setUp("edge", "https://erail.in/");
		clickOnElement(driver.findElement(By.xpath("//a[text()='eCatering']")));
		String parentWindowId = driver.getWindowHandle();
		Set<String> getAllWindowId = driver.getWindowHandles();
		getAllWindowId.remove(parentWindowId);
		Iterator<String> itr = getAllWindowId.iterator();
		String childWindowId = itr.next();
		driver.switchTo().window(childWindowId);
		getUrlMatch("https://www.ecatering.irctc.co.in/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@placeholder='Search food, brand, station, etc.']")).click();
		driver.findElement(By.xpath("//input[@class='form-input pl-12  text-sm']")).sendKeys("12627");
		Thread.sleep(5000);
		List<WebElement> suggList = driver
				.findElements(By.xpath("//div[@class='w-full mb-48 grid grid-cols-1 gap-4 px-4']/div/div/div/div/p"));
		String expTrainName = "KARNATAKA EXP";
		for (int i = 0; i < suggList.size(); i++) {
			suggList = driver.findElements(
					By.xpath("//div[@class='w-full mb-48 grid grid-cols-1 gap-4 px-4']/div/div/div/div/p"));
			WebElement trainName = suggList.get(i);
			if (trainName.getText().equals(expTrainName)) {
				System.out.println(trainName.getText());
				trainName.click();
				break;
			}
		}
		WebElement date = driver
				.findElement(By.xpath("//input[@class='form-input custom-date-picker h-11.5 pl-12 text-sm']"));
		date.click();
		for (int i = 0; i < 5; i++) {
			Thread.sleep(1000);
			date.sendKeys(Keys.ARROW_DOWN);
		}
		date.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement cityName = driver.findElement(By.xpath("//select[@placeholder='Boarding Station']"));
	    Select slt=new Select(cityName);
	    slt.selectByIndex(27);
		driver.findElement(By.xpath("//button[text()='FIND FOOD']")).click();
		List<WebElement> restN = driver.findElements(By.xpath("//h5[@class='tracking-normal ']"));
		for (int i = 0; i < restN.size(); i++) {
			restN = driver.findElements(By.xpath("//h5[@class='tracking-normal ']"));
			WebElement names = restN.get(i);
			System.out.println(names.getText());
		}
		driver.close();
		driver.switchTo().window(parentWindowId);
		getUrlMatch("https://erail.in/");
		Thread.sleep(2000);
		WebElement fromStation=driver.findElement(By.xpath("//input[@id='txtStationFrom']"));
		fromStation.click();
		fromStation.clear();
		fromStation.sendKeys("Pune", Keys.ENTER);
		WebElement toStation=driver.findElement(By.xpath("//input[@id='txtStationTo']"));
		toStation.click();
		toStation.clear();
		toStation.sendKeys("Mumbai", Keys.ENTER);
		clickOnElement(driver.findElement(By.xpath("//input[@title='Select Departure date for availability']")));
		clickOnElement(driver.findElement(By.xpath("//tr/td[2]/table/tbody/tr[7]/td[3]")));
		driver.findElement(By.xpath("//input[@value='Get Trains']")).click();
		List<WebElement> trainNo=driver.findElements(By.xpath("//a[@title='Click on train number to View fare and schedule']"));
		List<WebElement> trainNameList=driver.findElements(By.xpath("//td[@style=';']/a"));
		List<WebElement> deptTime=driver.findElements(By.xpath("//td[@class='Sorted']"));
		List<WebElement> travelTime=driver.findElements(By.xpath("//tr/td[9]/a[@href='#']"));
		for(int i=0;i<trainNo.size();i++) {
			WebElement trainNum=trainNo.get(i);
			WebElement trainNameList1=trainNameList.get(i);
			WebElement deptTiming=deptTime.get(i);
			WebElement travelTiming=travelTime.get(i);
			System.out.println(trainNum.getText()+" "+trainNameList1.getText()+" "+deptTiming.getText()+" "+travelTiming.getText());
		}
		//driver.close();
		driver.quit();
	}
}
/**
 * open browser https://erail.in/ 
 * click on eCatering 
 * enter train number as 12627
 * and select it from suggestion 
 * select future date for boarding 
 * select boarding station as itarsi 
 * click on find food 
 * get all restaurant names come back to
 * main page From Pune to Mumbai date in future 
 * print train number train name
 * Dept time Travel time
 */