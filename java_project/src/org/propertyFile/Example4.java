package org.propertyFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Example4 {
	public static void main(String[]args) {
		/*
		 * FilePath:-
		 *        Absolute Path:-from root to till target element
		 *        Example:-C:\Acceleration\Automation\Workspace\java_project\TestData\AppData.properties
		 *        Relative Path:-start from anywhere
		 *        Example:-.\java_project\TestData\AppData.properties
		 *        Where '.' indicates current working directory
		 */  
		//1. First find the location where you have stored property file
		String filePath=System.getProperty("user.dir")+".\\TestData\\AppData.properties";
		//or
		//String filePath=".//TestData//AppData.properties";
		//2. Create an instance of FileInputStream class and pass the property file location to its constructor.
		FileInputStream fis=null;
		try {
			fis = new FileInputStream(filePath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		//3. Create an instance of Properties class
		Properties prop=new Properties();
		//4. With the help of properties reference variable call load() properties class and pass
	    //  FileInputStream class reference to this method
		try {
			prop.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
		//5. Call getProperty(key) of Properties class to read data from property file
		String appUrl=prop.getProperty("applicationUrl");
		System.out.println(appUrl);
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));
		System.out.println(prop.getProperty("mobile"));
		System.out.println(prop.getProperty("emailId"));
		//updating/adding property file
		//1. Use setProperty() method
		prop.setProperty("AutomationTool2", "Selenium");
		prop.setProperty("emailId", "shubhamsp2499@gmail.com");
		//2. object of FileOutputStream class
		FileOutputStream fos=null;
		try {
			fos = new FileOutputStream(filePath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		//3. use store method for modified date and time and save the data
		try {
			prop.store(fos, "modified property file date...");
		} catch (IOException e) {
			e.printStackTrace();
		}
		//4. for close use flush() and close() the file
		finally {
		try {
			fos.flush();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(prop.getProperty("AutomationTool2"));
		}
	}
}
