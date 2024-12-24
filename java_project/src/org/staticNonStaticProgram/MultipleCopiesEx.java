package org.staticNonStaticProgram;

public class MultipleCopiesEx {
	public int a=10;
	public static void main(String[] args) {
		System.out.println("Program Starts");
		MultipleCopiesEx obj1=new MultipleCopiesEx();
		System.out.println("a="+obj1.a);      //10
		obj1.a=50;
		System.out.println("a= "+obj1.a);     //50
		System.out.println("************");
		MultipleCopiesEx obj2=new MultipleCopiesEx();
		System.out.println("a= "+obj2.a);     //10
		obj2.a=60;
		System.out.println("a= "+obj2.a);     //60
		System.out.println("************");
		MultipleCopiesEx obj3=new MultipleCopiesEx();
		System.out.println("a= "+obj3.a);      //10
		obj3.a=70;
		System.out.println("a= "+obj3.a);      //70
		System.out.println("************");
		System.out.println("a= "+obj1.a);      //50
		System.out.println("a= "+obj2.a);      //60
		System.out.println("a= "+obj3.a);      //70
		System.out.println("Program Ends"); 
	}
}
