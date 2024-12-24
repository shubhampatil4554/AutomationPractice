package org.systemClass;

class Testing1{
	void manualTesting(){
		System.out.println("You are learning manual testing");
	}
}
public class Sample2{
	static void calling(){
		System.out.println("I am calling from Sample2 Class");
	}
	static Testing1 ref=new Testing1();
	public static void main(String[] args){
		System.out.println("Program starts");
		Sample2.calling();
		
		Sample2.ref.manualTesting();
//Classname.nonstaticReferanceVariableOfTesting1Class.nonStaticMethodOfTesting1Class
        System.out.println("Hi");
//Classname.staticReferanceVaraibleOfPrintStreamClass.nonStaticMethodPrintStreamClass
		System.out.println("Program ends");
	}
}
