package org.basicPrograms2;

public class VariableEx2 {
	public static void main(String[] args){
		System.out.println("**Program Starts**");
		
		short k=55;
		byte x=-9;
		int a=10;
		long q=-45;
		//long mobNum=9876543210;  //Error
		long mobNum= 9876543210l;  // Small 'L' is mandatory
		
		//float f=99.77;           // Error
		float f=99.77f;           // small 'f' is mandatory
		double d1=55.44;          // small 'D' is not mandatory,hidden
		double d2=44.78d;
		
		char ch='h';
		boolean flag=true;
		
		System.out.println("short k= "+k);
		System.out.println("byte x= "+x);
		System.out.println("int a= "+a);
		System.out.println("long q= "+q);
		System.out.println("long mobNum= "+mobNum);
		System.out.println("float f= "+f);
		System.out.println("double d1= "+d1);
		System.out.println("double d2= "+d2);
		System.out.println("char ch= "+ch);
		System.out.println("boolean flag= "+flag);
		
		System.out.println("**programs Ends**");
		
	}
}
