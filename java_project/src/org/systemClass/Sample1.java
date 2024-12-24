package org.systemClass;


class Testing{
	void manualTesting(){
		System.out.println("you are learning manual testing");
	}
}
public class Sample1{
	static void calling(){
		System.out.println("I am calling from Sample1 class");
	}
	public static void main(String[] args){
		System.out.println("Program starts");
		Testing ref=new Testing();
		ref.manualTesting();
		
		Sample1.calling();
		System.out.println("Program Ends");
	}
}