package org.methodsPractice;

public class ParaEx2 {
	public static void main(String[] args){
		System.out.println("Program Starts");
		ParaEx2 obj=new ParaEx2();
		obj.test1(10,'a',-20,(byte)10); 		//implicit widening and explicit narrowing
		//or
		obj.test1(10,'a',(long)-20,(byte)10); //Explicit narrowing and explicit widening
		
		obj.test2((short)10,(float)22.22,(long)23,(byte)24);
		//or
		obj.test2((short)10,22.22f,23,(byte)24);
		
		obj.test3(11.11,true,(byte)25,(short)-588);
		//or
		obj.test3(11,true,(byte)11.55,(byte)55);  //explicit narrowing and implicit widening
		System.out.println("Program Ends");
	}
	public void test1(int a,char ch,long l,byte b){
		System.out.println("Test 1");
	}
	public void test2(short s,float f,long l,byte b){
		System.out.println("Test 2");
	}
	public void test3(double d,boolean b,byte c,short s){
		System.out.println("test 4");
	}
}
