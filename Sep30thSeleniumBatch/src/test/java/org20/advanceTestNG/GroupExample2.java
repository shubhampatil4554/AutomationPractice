package org20.advanceTestNG;

import org.testng.annotations.Test;

public class GroupExample2 {
	@Test(groups="Regression")
	public void testLogIn() {
		System.out.println("I am login method - And in Regression Group");
	}
	@Test(groups="Sanity Test")
	public void testSignIn() {
		System.out.println("I am SignIn method - And in Regression Group");
	}
	@Test(groups="Smoke Test")
	public void testPIM() {
		System.out.println("I am PIM method - And in Regression Group");
	}
	@Test(groups="Regression")
	public void testLeads() {
		System.out.println("I am Leads method - And in Regression Group");
	}
	@Test(groups="Smoke Test")
	public void testTask() {
		System.out.println("I am Task method - And in Regression Group");
	}
}
