package org01.browserInstances;

import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefoxBrowser {
	public static void main(String[] args) {
		//Create an instance of FirefoxBrowser class to launch Firefox Browse
		FirefoxDriver fdriver=new FirefoxDriver();
	}
}
/*
 * 1.WebDriver everyTime opens new browser , it won't work on already opened browser
 * 2.Browser opened by webdriver won't have history cookies and plugins
*/