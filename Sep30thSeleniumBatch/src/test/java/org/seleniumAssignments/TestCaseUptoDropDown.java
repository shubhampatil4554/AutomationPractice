 package org.seleniumAssignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestCaseUptoDropDown {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://sampleapp.tricentis.com/101/app.php");

		WebElement dropDown1 = driver.findElement(By.cssSelector("select#make"));
		Select slt1 = new Select(dropDown1);
		System.out.println("does dropDown allowed multiple select option?" + slt1.isMultiple());
		WebElement element1 = slt1.getFirstSelectedOption();
		System.out.println("default selected value is " + element1.getText());
		Thread.sleep(2000);
		slt1.selectByValue("BMW");
		System.out.println("Print selected option " + slt1.getFirstSelectedOption().getText());

		WebElement model = driver.findElement(By.cssSelector("#model"));
		Select slt9 = new Select(model);
		System.out.println("does dropDown allowed multiple select option?" + slt9.isMultiple());
		WebElement element9 = slt9.getFirstSelectedOption();
		System.out.println("Print default value" + slt9.getFirstSelectedOption().getText());
		slt9.selectByValue("Motorcycle");
		System.out.println("print selected value" + slt9.getFirstSelectedOption().getText());

		driver.findElement(By.cssSelector("#cylindercapacity")).sendKeys("1000");

		driver.findElement(By.cssSelector("input#engineperformance")).sendKeys("423");
		driver.findElement(By.cssSelector("input#dateofmanufacture")).sendKeys("11/08/2024");

		WebElement dropDown2 = driver.findElement(By.cssSelector("select#numberofseats"));
		Select slt2 = new Select(dropDown2);
		System.out.println("does dropDown allowed multiple select option?" + slt2.isMultiple());
		WebElement element2 = slt2.getFirstSelectedOption();
		System.out.println("default selected value is " + element2.getText());
		slt2.selectByIndex(2);
		System.out.println("Print selected option " + slt2.getFirstSelectedOption().getText());

		WebElement mseats = driver.findElement(By.cssSelector("#numberofseatsmotorcycle"));
		Select slt10 = new Select(mseats);
		System.out.println("does dropDown allowed multiple select option?" + slt10.isMultiple());
		WebElement element10 = slt10.getFirstSelectedOption();
		System.out.println("Print default value" + slt10.getFirstSelectedOption().getText());
		slt10.selectByIndex(2);
		System.out.println("print selected value" + slt10.getFirstSelectedOption().getText());

		WebElement fuel = driver.findElement(By.cssSelector("#fuel"));
		Select slt11 = new Select(fuel);
		System.out.println("does dropDown allowed multiple select option?" + slt11.isMultiple());
		WebElement element11 = slt11.getFirstSelectedOption();
		System.out.println("Print default value" + slt11.getFirstSelectedOption().getText());
		slt11.selectByIndex(1);
		System.out.println("print selected value" + slt11.getFirstSelectedOption().getText());

		driver.findElement(By.cssSelector("#payload")).sendKeys("123");
		driver.findElement(By.cssSelector("#totalweight")).sendKeys("123");

		driver.findElement(By.cssSelector("input#listprice")).sendKeys("40950");
		driver.findElement(By.cssSelector("input#licenseplatenumber")).sendKeys("MH19BW4554");
		driver.findElement(By.cssSelector("input#annualmileage")).sendKeys("1000");
		driver.findElement(By.cssSelector("button#nextenterinsurantdata")).click();
		driver.findElement(By.cssSelector("#firstname")).sendKeys("QA");
		driver.findElement(By.cssSelector("#lastname")).sendKeys("Tester");
		driver.findElement(By.cssSelector("#birthdate")).sendKeys("04/08/2003");

		driver.findElement(By.cssSelector("section>div:nth-of-type(4)>p.group>label:first-child")).click();

		driver.findElement(By.cssSelector("#streetaddress")).sendKeys("Pune");

		WebElement countryDropDown = driver.findElement(By.cssSelector("#country"));
		Select slt3 = new Select(countryDropDown);
		System.out.println("does dropDown allowed multiple select option?" + slt3.isMultiple());
		WebElement element3 = slt2.getFirstSelectedOption();
		System.out.println("default selected value is " + element3.getText());
		Thread.sleep(2000);
		slt3.selectByValue("India");
		System.out.println("Print selected option " + slt3.getFirstSelectedOption().getText());

		driver.findElement(By.cssSelector("#zipcode")).sendKeys("411014");
		driver.findElement(By.cssSelector("#city")).sendKeys("Pune");

		WebElement occupation = driver.findElement(By.cssSelector("#occupation"));
		Select slt4 = new Select(occupation);
		System.out.println("does dropDown allowed multiple select option?" + slt4.isMultiple());
		WebElement element4 = slt4.getFirstSelectedOption();
		System.out.println("Print default value" + slt4.getFirstSelectedOption().getText());
		slt4.selectByValue("Farmer");
		System.out.println("print selected value " + slt4.getFirstSelectedOption().getText());

		List<WebElement> hobbies = driver.findElements(By.cssSelector("section>div:nth-of-type(10)>p>label"));
		for (int i = 0; i < hobbies.size(); i++) {
			WebElement ele1 = hobbies.get(i);
			if (i == 1) {
				ele1.click();
				break;
			}
		}

		driver.findElement(By.cssSelector("#website")).sendKeys("www.google.com");
		driver.findElement(By.cssSelector("#nextenterproductdata")).click();

		driver.findElement(By.cssSelector("#startdate")).sendKeys("01/25/2025");

		WebElement insuSum = driver.findElement(By.cssSelector("#insurancesum"));
		Select slt5 = new Select(insuSum);
		System.out.println("does dropDown allowed multiple select option?" + slt5.isMultiple());
		WebElement element5 = slt5.getFirstSelectedOption();
		System.out.println("Print default value" + slt5.getFirstSelectedOption().getText());
		slt5.selectByValue("10000000");
		System.out.println("print selected value" + slt5.getFirstSelectedOption().getText());

		WebElement meritRating = driver.findElement(By.cssSelector("#meritrating"));
		Select slt6 = new Select(meritRating);
		System.out.println("does dropDown allowed multiple select option?" + slt6.isMultiple());
		WebElement element6 = slt6.getFirstSelectedOption();
		System.out.println("Print default value" + slt6.getFirstSelectedOption().getText());
		slt6.selectByValue("Bonus 3");
		System.out.println("print selected value" + slt6.getFirstSelectedOption().getText());

		WebElement damageInsu = driver.findElement(By.cssSelector("#damageinsurance"));
		Select slt7 = new Select(damageInsu);
		System.out.println("does dropDown allowed multiple select option?" + slt7.isMultiple());
		WebElement element7 = slt7.getFirstSelectedOption();
		System.out.println("Print default value" + slt7.getFirstSelectedOption().getText());
		slt7.selectByIndex(3);
		System.out.println("print selected value" + slt7.getFirstSelectedOption().getText());

		List<WebElement> optProd = driver.findElements(By.cssSelector("section>div:nth-of-type(5)>p>label"));
		for (int i = 0; i < optProd.size(); i++) {
			WebElement ele2 = optProd.get(i);
			if (i == 1) {
				ele2.click();
				break;
			}
		}

		WebElement courtsycar = driver.findElement(By.cssSelector("#courtesycar"));
		Select slt8 = new Select(courtsycar);
		System.out.println("does dropDown allowed multiple select option?" + slt8.isMultiple());
		WebElement element8 = slt8.getFirstSelectedOption();
		System.out.println("Print default value" + slt8.getFirstSelectedOption().getText());
		slt8.selectByValue("Yes");
		System.out.println("print selected value" + slt8.getFirstSelectedOption().getText());

		driver.findElement(By.cssSelector("#nextselectpriceoption")).click();

		List<WebElement> plan = driver.findElements(By.cssSelector("#priceTable>tfoot>tr>th.group>label"));
		for (int i = 0; i < plan.size(); i++) {
			WebElement planEle = plan.get(i);
			if (i == 3) {
				planEle.click();
			}
		}
		driver.findElement(By.cssSelector("#nextsendquote")).click();

		driver.findElement(By.cssSelector("#email")).sendKeys("tester01@gmail.com");
		driver.findElement(By.cssSelector("#phone")).sendKeys("8080959526");
		driver.findElement(By.cssSelector("#username")).sendKeys("automationtesting");
		driver.findElement(By.cssSelector("#password")).sendKeys("Pass@123");
		driver.findElement(By.cssSelector("#confirmpassword")).sendKeys("Pass@123");

		driver.findElement(By.cssSelector("#sendemail")).click();

		driver.quit();
	}
}
//TC4: https://sampleapp.tricentis.com/101/app.php
//click on motorcycle and complete insurance process