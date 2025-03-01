package org23.extentReports;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import org12.seleniumUtilities.SeleniumUtil;

public class GetScreenshots extends SeleniumUtil {
	@Test
	public void testGoogle() throws IOException {
		WebDriver driver=setUp("edge","https://www.google.com");
		//convert WebDriver instance into TakeScreenshot interface
		TakesScreenshot ref=(TakesScreenshot)driver;
		//get the screenshot in the form of File
		File screenshots=ref.getScreenshotAs(OutputType.FILE);
		//store screenshot into the required location
		FileUtils.copyFile(screenshots, new File(".\\src\\test\\resources\\Screenshots\\GoogleHomePage.jpg"));
	}
	@Test
	public void actiTimeScreenShots() {
		WebDriver driver=setUp("chrome","https://online.actitime.com/ubs/login.do");
		getScreenshot(".\\src\\test\\resources\\Screenshots\\actiTime.jpg");
	}
}
