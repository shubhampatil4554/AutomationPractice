package org.methodsPractice;

public class CatchReturnEx2 {
	public static void main(String[] args){
		System.out.println("Program Starts");
		CatchReturnEx2 obj=new CatchReturnEx2();
		int sum1=obj.addition(10,20);           
		double sum2=obj.addition(10,20);         //implicit widening
		float sum3=obj.addition(10,20);          //implicit widening
		long sum4=obj.addition(10,20);           //implicit widening
		short sum5=(short)obj.addition(10,20);   //explicit narrowing
		byte sum6=(byte)obj.addition(10,20);     //explicit narrowing
		
		//int a=50;
		//short b=(short)a;
		System.out.println("***********");
		int sub1=(int)obj.substraction(55.77f,77.11f);  //Explicit narrowing
		double sub2=obj.substraction(55.77f,77.11f);    //implicit widening
		byte sub3=(byte)obj.substraction(55.77f,77.11f);      //explicit widening
		System.out.println("Program Ends");
	}
	public int addition(int a,int b){
		return a+b;
	}
	public float substraction(float a,float b){
		return a-b;
	}
}
