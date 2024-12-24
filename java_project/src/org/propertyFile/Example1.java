package org.propertyFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Example1 {
	public static void main(String[]args) throws IOException {
		/*
		 * FilePath:-
		 *        Absolute Path:-from root to till target element
		 *            Example:-C:\Acceleration\Automation\Workspace\java_project\TestData\AppData.properties
		 *        Relative Path:-start from anywhere
		 *            Example:-.\java_project\TestData\AppData.properties
		 *        Where '.' indicates current working directory
		 */
		//1. First find the location where you have stored property file
		//String filePath=System.getProperty("user.dir")+".\\TestData\\AppData.properties";
		//or
		//String filePath1="C:\\Acceleration\\Automation\\Workspace\\java_project\\TestData//AppData.properties";
		String filePath="C:/Acceleration/Automation/Workspace/java_project/TestData/AppData.properties";
		//2. Create an instance of FileInputStream class and pass the property file location to its constructor.
		FileInputStream fis=new FileInputStream(filePath);
		//3. Create an instance of Properties class
		Properties prop=new Properties();
		//4. With the help of properties reference variable call load() properties class and pass
	    //  FileInputStream class reference to this method
		prop.load(fis);
		//5. Call getProperty(key) of Properties class to read data from property file
		String appUrl=prop.getProperty("applicationUrl");
		System.out.println(appUrl);
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));
		System.out.println(prop.getProperty("mobile"));
		System.out.println(prop.getProperty("emailId"));
	}
}
/*
Steps to read data from property file:
1. First find the location where you have stored property file
2. Create an instance of FileInputStream class and pass the property file location to its constructor.
3. Create an instance of Properties class
4. With the help of properties reference variable call load() properties class and pass
     FileInputStream class reference to this method
5. Call getProperty(key) of Properties class to read data from property file
*/