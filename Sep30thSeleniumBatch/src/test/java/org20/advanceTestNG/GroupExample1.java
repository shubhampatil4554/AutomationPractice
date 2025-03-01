package org20.advanceTestNG;

import org.testng.annotations.Test;

public class GroupExample1 {
	@Test(groups="Regression")
	public void testCaseOne() {
		System.out.println("Im in testCaseOne - And in Regression Group");
	}
	@Test(groups="Sanity Test")
	public void testCaseTwo() {
		System.out.println("Im in testCaseTwo - And in Sanity Group");
	}
	@Test(groups="Smoke Test")
	public void testCaseThree() {
		System.out.println("Im in testCaseThree - And in Smoke Group");
	}
	@Test(groups="Regression")
	public void testCaseFour() {
		System.out.println("Im in testCaseFour - And in Regression Group");
	}
	@Test(groups="Smoke Test")
	public void testCaseFive() {
		System.out.println("Im in testCaseFive - And in Smoke Group");
	}
}
/*
Right click on required folder --->others--->XML folder ---> xmlfile ----> FileName.xml--->finish
*/