package org.multiLevelInheritance;

class A1{
	//default constructor
	static int a=10;
	int b=20;
	double c=13.45;
}
/* 
B1: child clas/sub class/derived class
A1: parent class/super class/Inherited class
All the non ststic member of A1 class will inherited into B1 class
(A1 non-static mwmbers will be present virtually in class B)
*/
class B1 extends A1{
	//default constructor with default super() statement
	/*
	These non-static member of A1 class are virtually present in B1 class
	int b=20;
	double c=13.45;
	*/
	static int x=30;
	int y=40;
	double z=53.45;
}
class C1 extends B1{
	//default constructor with default super() statement
	/*
	These non-static member of A1 class are virtually present in B1 class
	int b=20;
	double c=13.45;
	int y=40;
	double z=53.45;
	*/
	static int p=50;
	int q=60;
	double r=66.45;
}
public class Inheritance1{
	public static void main(String[] args){
		/***Access static members of class A1,B1,C1***/
		System.out.println("Class A1 static variable: "+A1.a);
		System.out.println("Class B1 static variable: "+B1.a);
		System.out.println("Class C1 static variable: "+C1.a);
		/***Access non-static members of class A1,B1,C1***/
		C1 c1=new C1();
		System.out.println("Class A1 static variable b: "+c1.b);
		System.out.println("Class A1 static variable c: "+c1.c);
		System.out.println("Class B1 static variable y: "+c1.y);
		System.out.println("Class B1 static variable z: "+c1.z);
		System.out.println("Class C1 static variable q: "+c1.q);
		System.out.println("Class C1 static variable r: "+c1.r);
		B1 b1=new B1();
		System.out.println("Class B1 static variable y: "+b1.y);
		System.out.println("Class B1 static variable z: "+b1.z);
		System.out.println("Class A1 static variable b: "+b1.b);
		System.out.println("Class A1 static variable c: "+b1.c);
	}
}
