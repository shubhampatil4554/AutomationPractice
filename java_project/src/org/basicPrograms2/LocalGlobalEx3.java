package org.basicPrograms2;

public class LocalGlobalEx3 {
	//Globa; Variables
    //If user won't initialize the global variables
		    //then java will initialize with 'Default values'
		short k;
		byte x;
		int a;
		long q;
		float f;
		double d1;
		char ch;
		boolean flag;
		public static void main(String[] args){
			System.out.println("Program starts");
			
			LocalGlobalEx3 obj=new LocalGlobalEx3();
			
		    System.out.println("short = "+obj.k);                         							      		
		    System.out.println("byte x="+obj.x);
		    System.out.println("int a ="+obj.a);
		    System.out.println("long q="+obj.q);
		    System.out.println("float f= "+obj.f);
		    System.out.println("double d1="+obj.d1);
		    System.out.println("char ch = "+ obj.ch);
		    System.out.println("boolean flag ="+obj.flag);
		    System.out.println("Program Ends");
		}
}
