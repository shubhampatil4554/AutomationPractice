package org.methodOverLoading;

public class Example5 {
public static void main(String[] args){
		
	}
	/*
	 * void getNumber(){                      //error
	
		System.out.println("Number is 20");
	}
	int getNumber(){                         //error
		System.out.println("Number is 20");
		return 20;
	} */
	final void testData(){
		System.out.println("I am final method");
	}
	final void testData(int num){
		System.out.println("I am final method");
	}
}
//can we do overloading by change method return type only?
//---> No ,because for overloading method name should be same and its parameter can be differ
