package org01.browserInstances;

import org.openqa.selenium.edge.EdgeDriver;

public class OpenEdgeBrowser {
	public static void main(String[]args) {
		//Create an instance of EdgeBrowser class to launch microsoft edge Browser
		EdgeDriver edriver=new EdgeDriver();
		
	}
}
/*
 * 1.WebDriver everyTime opens new browser , it won't work on already opened browser
 * 2.Browser opened by webdriver won't have history cookies and plugins
*/