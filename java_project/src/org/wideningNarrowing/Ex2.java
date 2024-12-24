package org.wideningNarrowing;

public class Ex2 {
	public static void main(String[] args){
		long a=130;
		byte b=(byte)a;        //explicit narrowing
		System.out.println("long l ="+a);     //130
		System.out.println("byte b= "+b);     //-126
		System.out.println("*********");
		double x=-255.77;
		byte y=(byte)x;
		System.out.println("double x="+x);    //255.77
		System.out.println("byte y="+y);      //1
		System.out.println("*********");
		long l=7263912232l;                   //Small 'L' is mandatory 
		int mobNum=(int)l;
		System.out.println("long l="+l);      //7263912232
		System.out.println("int mobNum="+mobNum); //
		System.out.println("*********");
	}
}
