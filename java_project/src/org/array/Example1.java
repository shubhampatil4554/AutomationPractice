package org.array;

public class Example1{
	public static void main(String[] args){
		int a=10,b=20,c=30,d=40,e=50;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		/*
		Syntax to declare an array:-
		     arrayType[] arrayName;  | arrayType []arrayName; |arrayType arrayName[];
		Syntax to initialised an array:-
		     arrayName=new arrayType[size];
		Or
		Syntax to declare and initialised an array:-
		     arrayType[] arrayName=new arrayType[];
			 or
			 arrayType[] arrayname={_,_,_};
		*/
		int[] num;
		num=new int[5];
		System.out.println(num[0]);//0
		System.out.println(num[1]);//0
		System.out.println(num[2]);//0
		System.out.println(num[3]);//0
		System.out.println(num[4]);//0
		num[2]=25;
		System.out.println(num[2]);//25
		
		int[] empID={101,102,103};
		System.out.println(empID[0]);//101
		System.out.println(empID[1]);//102
		System.out.println(empID[2]);//103
	}
}
