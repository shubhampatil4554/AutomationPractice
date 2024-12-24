package org.wideningNarrowing;

public class Ex1 {
	public static void main(String[] args){
		System.out.println("Program Starts");
	System.out.println("**Widening**");
		short s=19;
		long k1=s;           //implicit widening
		long k2=(long)s;     //explicit widening
		System.out.println("short s+"+s);       //19
		System.out.println("long k1= "+k1);     //19
		System.out.println("long k2="+k2);      //19
		System.out.println("**Narrowing**");
		double d=88.75;
		//byte b=d;                //Error Narrowing implicitly not possible
		byte b=(byte)d;            //explicit narrowing
		System.out.println("double d="+d);      //88.75
		System.out.println("byte b="+b);        //88
		long x=100;
		//int y=x;           //narrowing implictly not possoible
		int y=(int)x;        //explicit narrowing
		System.out.println("long x="+x);    //100
		System.out.println("int y="+y);     //100
		System.out.println("Program Ends");
	}
}
