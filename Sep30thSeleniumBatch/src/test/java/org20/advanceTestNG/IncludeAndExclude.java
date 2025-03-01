package org20.advanceTestNG;

import org.testng.annotations.Test;

public class IncludeAndExclude {
	@Test(groups="Location")
	public void addLocationTestCase() {
		System.out.println("Im in add location test case");
	}
	@Test(groups="Department")
	public void addDepartmentTestCase() {
		System.out.println("Im in add Department test case");
	}
	@Test(groups="Employee")
	public void addEmployeeTestCase() {
		System.out.println("Im in add Employee test case");
	}
}
