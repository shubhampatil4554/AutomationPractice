package org01.browserInstances;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class GenericBrowserLaunch {
	public static void main(String[] args) {
		// Create an instance of ChromeBrowser class to launch Chrome Browse
		WebDriver driver = new ChromeDriver();
		// Enter application url in Browser
		driver.get("https://www.google.com");
		// get application title
		String appTitle = driver.getTitle();
		System.out.println("Application Title=" + appTitle);
		// get application url
		String appURL = driver.getCurrentUrl();
		System.out.println("Application URL=" + appURL);
		System.out.println("Application URL=" + appURL.length());
		// application SourceCode
		String pageSourceCode = driver.getPageSource();
		System.out.println("Page Source Code char Count="+pageSourceCode.length());
		//Close Current Browser Instance
		//driver.close();
		driver.quit();
	}
}
/*
 * 1.WebDriver everyTime opens new browser , it won't work on already opened
 * browser 2.Browser opened by webdriver won't have history cookies and plugins
 */