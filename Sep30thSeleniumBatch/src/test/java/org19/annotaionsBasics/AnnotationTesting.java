package org19.annotaionsBasics;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationTesting {
	@Test
	public void TestCase1() {
		System.out.println("Hello,I am from TC1");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("Hello I am beforeTest");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("Hello I am afterTest");
	}
	@Test
	public void testCase2() {
		System.out.println("Hello,I am from TC2");
	}
}
/*
when you have common pre-requisite & post-requisite behalf of all test method

Login
	createPIM
	editPIM
	deletePIM
logout

*/