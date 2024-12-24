package org1.browserInstances;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.youtube.com/");
		
		driver.findElement(By.cssSelector("yt-searchbox>div>form>input")).sendKeys("Shiv Tandav Stotram");
		driver.findElement(By.xpath("html/body//h3/a/yt-formatted-string[text()='Shiv Tandav Stotram | Shankar Mahadevan | रावण रचित शिव तांडव स्तोत्र']")).click();
		//driver.quit();
	}
}
