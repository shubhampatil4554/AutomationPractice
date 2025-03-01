package org21.retryFailedTC;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test001 {
	static int num=5;
	@Test(retryAnalyzer=org21.retryFailedTC.MyRetryAnalyzer.class)
	public void test1() {
		Assert.assertEquals(true, false);//1 skip,2 skip,3 failed
	}
	@Test
	public void test2() {
		Assert.assertEquals(true, false);//1 failed
	}
	@Test(retryAnalyzer=org21.retryFailedTC.MyRetryAnalyzer.class)
	public void test3() {
		num--;
		Assert.assertTrue(num<4);//4<4 skip, 3<4 pass
	}
}
