package org.objectClass;

class Demo{
	void calling(){
		System.out.println("I am calling method of Demo class");
	}
}
public class ObjectClassExample1{
	int age=25;
	public static void main(String[] args){
		System.out.println("Program Starts");
		Demo d1=new Demo();
		System.out.println("Demo Object d1:"+d1.toString());
		System.out.println("Object d1 adress in number: "+d1.hashCode());
		Demo d2=new Demo();
		System.out.println("Object d1 adress in number:"+d2);//toString() method called internally by java compiler 
		System.out.println("Object d2 address in number:"+d2.hashCode());
		System.out.println("Comparing d1 and d2 Object of Demo class based on address "+d1.equals(d2));//false
		Demo d3=d2;
		System.out.println("Demo Object d3: "+d3);////toString() method called internally by java compiler 
		System.out.println("Object d3 adress in number:"+d3.hashCode());
		System.out.println("comparing d1 and d3 Object of Demo class based on Adress :"+d3.equals(d1));//false
		ObjectClassExample1 obj1=new ObjectClassExample1();
        System.out.println("ObjectclassExample1 obj1: "+obj1.toString());
        System.out.println("Object Obj1 address in number: "+obj1.hashCode());		
		System.out.println("Program Ends");
	}
}
