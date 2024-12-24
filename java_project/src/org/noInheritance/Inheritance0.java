package org.noInheritance;

class A{
	static int a=10;
	int b=20;
	double c=13.45;
}
class B{
	static int x=30;
	int y=40;
	double z=53.45;
}
class C{
	static int p=50;
	int q=60;
	double r=66.45;
}
public class Inheritance0{
	public static void main(String[] args){
		/***Access Static member of class A***/
		System.out.println("Static members of class A,B,C");
		System.out.println("class A Static variable:"+A.a);
		/***Access Static member of class B***/
		System.out.println("class B static variable:"+B.x);
		/***Access Static member of class C***/
		System.out.println("class C static variable:"+C.p);
		/***Access Non-Static member of class ***/
		System.out.println("Non-Static members of class A,B,C");
		A a1=new A();
		System.out.println("class A non-static variable b:"+a1.b);
		System.out.println("class A non-static variable c:"+a1.c);
		B b1=new B();
		System.out.println("class B non static variable y:"+b1.y);
		System.out.println("class B non static variable z:"+b1.z);
		C c1=new C();
		System.out.println("class C non static variable q:"+c1.q);
		System.out.println("class C non static variable r:"+c1.r);
	}
}
