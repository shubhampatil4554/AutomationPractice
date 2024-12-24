package org19.annotaionsBasics;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationTesting2 {
	@Test
	public void testCase1() {
		System.out.println("Hello,I am Tc!");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Hello,I am beforeMethod");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("Hello,I am afterMethod");
	}
	@Test
	public void testcase2() {
		System.out.println("Hello,I am TC2");
	}
	
}
