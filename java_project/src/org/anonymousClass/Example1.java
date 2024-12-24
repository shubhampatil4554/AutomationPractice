package org.anonymousClass;

interface Interf1{
	public void test();
	default void test1() {
		System.out.println("from default method of interface");
	}
	public static void test2() {
		System.out.println("from static method of interface");
	}
}
public class Example1 {

	public static void main(String[] args) {
		Interf1 obj1=new Interf1() {  //Anonymous Class
			public void test() {
				System.out.println("test method implementation from interface");
			}
		};
		obj1.test();
		obj1.test1();
		Interf1 obj2=new Interf1() {
			public void test() {
				
			}
		};
		obj2.test();
		obj2.test1();
		Interf1.test2();
	}

}
