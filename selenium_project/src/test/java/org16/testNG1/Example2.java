package org16.testNG1;

import org.testng.annotations.Test;

public class Example2 {
	@Test
	public void testCase1() {
		System.out.println("Hi, TC1");
	}

	@Test
	public void testCase4() {
		System.out.println("Hi, TC4");
	}

	@Test
	public void testCase3() {
		System.out.println("Hi, TC3");
	}

	@Test
	public void testCase2() {
		System.out.println("Hi, TC2");
	}

}
/*
 * In testng - no main() - execution is controlled by @Test method - we can
 * declare more than one @Test method, in this case all @Test method will be
 * executed in alphabetical order - in Java console Tests run: count comes based
 * on number @Test method executed Total tests run: count comes based on how
 * many time @Test method executed
 */
