package org04.navigateScreenSize;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class ScreenSizeNavigate {
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		//to open on full screen use
		driver.manage().window().maximize();
		//to open browser with required window sixe
		driver.manage().window().setSize(new Dimension(500,700));
		//to open browser on full screen use
		driver.manage().window().maximize();
		//to defining NoSuchElementException defining implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//implicit wait driver will have 0-30 sec to wait before throwing NoSuchElementException
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//forgot password page
		driver.findElement(By.className("orangehrm-login-forgot-header")).click();
		//if you want to comeback login page
		driver.navigate().back();
		//if you want to go forward page
		//reload Browser Window
		driver.navigate().refresh();
		//to navigate different url
		driver.navigate().to("https://www.google.com");
		driver.quit();
		
	}
}
