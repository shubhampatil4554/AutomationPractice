package org.conditionalStatement;

public class EvenOddEx {
	public static void main(String[] args){
		System.out.println("Program Starts");
		int a=-20;
		if (a%2==0){
			System.out.println("Even");
		}else{
			System.out.println("odd");
		}
		//or
		/*if(a%2!=0){
			System.out.println("Odd");
		}else{
			System.out.println("Even");
		}*/
		System.out.println("Program Ends");
	}
}
/*====for Even====
if(a%2==0){                            ->not correct soln
	System.out.println(a+"is Even");
}
====for odd====
if(a%2 > 0){                            ->not correct soln
	System.out.println(a+"is Odd");
}
if(a%2==1){
	System.out.println(a+"is odd");
}
======For Even Or Odd======Not optimised
if (a%2==1){
	System.out.println("Odd");
}else if (a%2==-1){
	System.out.println("Odd");
}else{
	System.out.println("Even");
}*/

