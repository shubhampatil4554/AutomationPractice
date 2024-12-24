package org.operators;

public class IncrementDecrementOperator {

	public static void main(String[] args) {
		int a=5;
		System.out.println(a++);//5
		System.out.println(a);//6
		int b=10;
		System.out.println(++b);//11
		System.out.println(b);//11
		
		int c=23;
		System.out.println(c--);//23
		System.out.println(c);//22
		int d=25;
		System.out.println(--d);//24
		System.out.println(d);//24
	}

}
