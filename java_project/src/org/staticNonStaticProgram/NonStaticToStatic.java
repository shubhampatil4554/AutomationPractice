package org.staticNonStaticProgram;

public class NonStaticToStatic {
	public static int x=50,y=60;      //static global variable
	public void test1() {             //non Static method
		System.out.println("Test 1");
		//1st Way:By Direct name only for same class
		System.out.println("x= "+x);         //50
		System.out.println("y= "+y);         //60
		test3();
		test4();
		System.out.println("************");
		//2nd way:By using classname Recoomended every time
		System.out.println("x= "+NonStaticToStatic.x);    //50
		System.out.println("x= "+NonStaticToStatic.y);     //60
		NonStaticToStatic.test3();
		NonStaticToStatic.test4();
		System.out.println("************");
		//3rd way:By using Class Object Not Recommended
		NonStaticToStatic obj=new NonStaticToStatic();
		System.out.println("x= "+obj.x);          //50
		System.out.println("y= "+obj.y);          //60
		obj.test3();
		obj.test4();
		System.out.println("************");
	}
	public static void test3() {        //static method
		System.out.println("Test 3");
	}
	public static void test4() {         //static method
		System.out.println("Test 4");
	}
	public static void main(String[] args) {
		System.out.println("Program Starts");
		NonStaticToStatic obj=new NonStaticToStatic();
		obj.test1();
		System.out.println("Program Ends");
	}
}
