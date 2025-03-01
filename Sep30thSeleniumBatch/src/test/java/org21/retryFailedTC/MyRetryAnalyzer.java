package org21.retryFailedTC;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class MyRetryAnalyzer implements IRetryAnalyzer {
	int counter=0;
	int retryLimit=2;
	/*
	 * (non-Javadoc)
	 * @see org.testng.IRetryAnalyzer#retry(org.testng.ITestResult)
	 * this method decides how many times a test needs to be rerun.
	 * TestNg will call this method every time a test fails. So we 
	 * can put some code in here to decide when to rerun the test.
	 * Note: This method will return true if a tests needs to be retried
	 * and false it not.
	 */
	public boolean retry(ITestResult result) {
		if(counter<retryLimit) {
			counter++;
			return true;
		}
		return false;
	}
}
/*
 * first execution - normal---->		Pass
 * first execution - normal---->		failed ---> skip
 * 				1st retry ---> pass ----> script will be pass
 * first execution - normal---->		failed
 * 				1st retry ---> failed
 * 								2nd retry ---> Pass ----> script will be pass
 * first execution - normal---->		failed
 * 				1st retry ---> failed
 * 								2nd retry ---> failed ----> script will be failed
 */ 