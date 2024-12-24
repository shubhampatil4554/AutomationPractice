package org.basicPrograms2;

public class LocalGlobalEx1 {
	int x=50,y=60; //Global Variables
	public static void main(String[] args){
		System.out.println("Program Starts");
		
		int a=10;  //Local  Variables
		System.out.println("a= "+a);
		
		LocalGlobalEx1 obj = new LocalGlobalEx1();
		System.out.println("x= "+obj.x);
		System.out.println("x= "+obj.y);
		
		System.out.println("Program Ends");
	}
}
