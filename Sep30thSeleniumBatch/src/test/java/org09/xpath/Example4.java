package org09.xpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Example4 {
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(
				"https://www.flipkart.com/mobiles/pr?sid=tyy%2C4io&p%5B%5D=facets.brand%255B%255D%3DOPPO&p%5B%5D=facets.availability%255B%255D%3DExclude%2BOut%2Bof%2BStock&ctx=eyJjYXJkQ29udGV4dCI6eyJhdHRyaWJ1dGVzIjp7InRpdGxlIjp7Im11bHRpVmFsdWVkQXR0cmlidXRlIjp7ImtleSI6InRpdGxlIiwiaW5mZXJlbmNlVHlwZSI6IlRJVExFIiwidmFsdWVzIjpbIlNob3AgTm93Il0sInZhbHVlVHlwZSI6Ik1VTFRJX1ZBTFVFRCJ9fX19fQ%3D%3D&otracker=clp_metro_expandable_5_3.metroExpandable.METRO_EXPANDABLE_Shop%2BNow_mobile-phones-store_YN2R24UWDDQ8_wp2&fm=neo%2Fmerchandising&iid=M_60e83462-0666-4925-90b2-30263a4f2801_3.YN2R24UWDDQ8&ppt=clp&ppn=mobile-phones-store&ssid=ta0afvfops0000001662609558190");
		WebElement element = driver.findElement(By.xpath(
				"//div[div[div[text()='MOTOROLA g35 5G (Leaf Green, 128 GB)']]]/div[2]/div[1]/div/div[@class='Nx9bqj _4b5DiR']"));
		System.out.println(element.getText());
		driver.quit();
	}
}
//print price of MOTOROLA g35 5G