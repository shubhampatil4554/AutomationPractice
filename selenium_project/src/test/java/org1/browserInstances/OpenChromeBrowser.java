package org1.browserInstances;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeBrowser {

	public static void main(String[] args) {
		//Create an instance of ChromeBrowser class to launch Chrome Browse
		ChromeDriver sdriver=new ChromeDriver();
		
	}
}
/*
 * 1.WebDriver everyTime opens new browser , it won't work on already opened browser
 * 2.Browser opened by webdriver won't have history cookies and plugins
*/