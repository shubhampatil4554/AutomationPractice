package org.finalKeyword;

public class Example1 {
	public static void main(String[] args){
		//area of circle =pi*r*r
		int r=10;
		//final double pi=3.14;
		final double pi;
		pi=3.14;
		//pi=25.36;  //as its declared as final,hence its value can't be modified
		double area = pi*r*r;
		System.out.println("Area of circle is :"+area);
	}
}
/*
final local variable-
                we can declare a variable as final and can be initialize later before use
final global variable-
                we can declare global variable with final keyword,but it should be initialize at same time
				but:
				    -static final global variable ,can be initialized later if you are using static block
					-non-static final global variable ,can be initialized later only using either non-static
*/
