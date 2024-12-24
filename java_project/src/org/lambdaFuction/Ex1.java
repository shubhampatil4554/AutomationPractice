package org.lambdaFuction;
interface Interf1{
	public void test();
}
public class Ex1 {
	public static void main(String[] args) {
		/*Interf1 obj3=new Interf1(){   //anonymous class
		 * public void test(){
		 * System.out.println("from test method");
		 * }
		 * }
		 * 
		 */
		Interf1 obj1=() ->System.out.println("Test");
		obj1.test();
		
		Interf1 obj2=()->{
			System.out.println("Hello");
			System.out.println("Good Morning");
		};
		obj2.test();
	}
}
