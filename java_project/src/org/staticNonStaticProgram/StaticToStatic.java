package org.staticNonStaticProgram;

public class StaticToStatic {
	public static int x=50,y=60;   //Static global variables
	public static void test3(){    //Static Method
		System.out.println("Test 3");
	}
	public static void test4(){    //Ststic method
		System.out.println("Test 4");
		//We can call
		/*System.out.println("*********");
		System.out.println("x= "+x);
		System.out.println("y= "+y);
		test3();*/
	}
	public static void main(String[] args){   //Static Method
		System.out.println("**Program Starts**");
		// 1st way : Work Fine For Only Same Class   (direct calling by their name)
		System.out.println("x= "+x);
		System.out.println("y= "+y);
		test3();
		test4();
		System.out.println("****************");
		//2nd way:     Recommended      ( ClassName.methodname/variableName )
		System.out.println("x= "+StaticToStatic.x);
		System.out.println("y= "+StaticToStatic.y);
		StaticToStatic.test3();
		StaticToStatic.test4();
		System.out.println("******************");
		System.out.println("p= "+OtherClass.p);  //Other class data by using ClassName.varormethod
		System.out.println("******************");
		//3rd Way: Highly Not Recommended  using class Object
		StaticToStatic obj=new StaticToStatic();
		System.out.println("x= "+obj.x);
		System.out.println("y= "+obj.y);
		obj.test3();
		obj.test4();
		System.out.println("**Program Ends");
	}
}
class OtherClass{
	public static int p=20;
}

