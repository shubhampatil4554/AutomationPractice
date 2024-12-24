package org.wrapperClass;

public class BoxingUnboxing {
	public static void main(String[] args){
		int num=101;
		System.out.println("num is: "+num);
		//Boxing
		Integer obj1=num;
		System.out.println("obj1: "+obj1);
		System.out.println(obj1==num);
		
		//Unboxing
		int x=obj1.intValue();
		System.out.println("x: "+x);
		
		//Boxing
		Boolean obj2=true;
		System.out.println("obj2: "+obj2);
		
		//Unboxing
		boolean y=obj2.booleanValue();
		System.out.println("y: "+y);
		
		double num1=25.56;
		//Boxing
		Double obj3=num1; 
		//Unboxing
		double num2=obj3.doubleValue();
		System.out.println("num1: "+num1);
		System.out.println("obj3: "+obj3);
		System.out.println("num2: "+num2);
	}
}
//toString() method is override in all wrapper classes,
// it will give you value stored inside the object