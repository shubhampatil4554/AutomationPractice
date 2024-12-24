package org.basicPrograms2;

public class LocalGlobalEx2 {
	//Global variables
		short k=55;
		byte x= -9;
		int a = 10;
		 long q=-45;
		float f= 99.77f;
		double d1= 55.44;
		char ch = 'h';
		boolean flag = true;
		
		public static void main(String[] args){
			System.out.println("Program starts");
			//  Local variables
			//  short k=55;
			//  byte x=-9;
			//  int a = 10;
			//  long q= -45;
			//  float f= 99.77f;
			//  double d1= 55.44;
			//  char ch = 'h';
			//  boolean flag = true;
			
		LocalGlobalEx2 obj=new LocalGlobalEx2();
		System.out.println("short = "+obj.k);                         							      		
		System.out.println("byte x="+obj.x);
		System.out.println("int a ="+obj.a);
		System.out.println("long q="+obj.q);
		System.out.println("float f= "+obj.f);
		System.out.println("double d1="+obj.d1);
		System.out.println("char ch = "+obj.ch);
		System.out.println("boolean flag ="+obj.flag);
		System.out.println("Program Ends");
		}
}
