package org.operators;

public class LogicalOperator {

	public static void main(String[] args) {
		System.out.println(true && true);// true
		System.out.println(false && true);// false
		System.out.println(true || false);// true
		System.out.println(!true);// false
		System.out.println(10 > 10.0 || 0 < 1);// true
		System.out.println('a' >= 'a' && 5 == 5.0);// true
		System.out.println(true == false || false == false);// true
		System.out.println((((1 + 1) == 2.0) && 3 % 2 == 1) || (4 / 2) * 5 == 50 / 5);// true
		System.out.println(!((((1 + 1) == 2.0) && 3 % 2 == 1) || ((4 / 2) * 5 == 50 / 5)));// false
	}
	
}
