package org.operators;

public class CompoundAssignmentOperator {

	public static void main(String[] args) {
		int a=5;
		a*=1.1;
		System.out.println(a);//5
		a+=1.1;
		System.out.println(a);//6
		a-=1.1;
		System.out.println(a);//4
		a/=1.1;
		System.out.println(a);//3
		a%=1.1;
		System.out.println(a);//0
		//Compound Assignment operator can do narrowing implicitly
	}

}
