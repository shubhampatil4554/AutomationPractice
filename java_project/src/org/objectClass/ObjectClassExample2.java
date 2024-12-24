package org.objectClass;

class Demo1{
	void calling(){
		System.out.println("I am calling method of Demo class");
	}
}
public class ObjectClassExample2{
	int age=25;
	//@override
	public String toString(){
		return "Pune";
	}
	//@override
	public int hashCode(){
		return 101;
	}
	//@override
	public boolean equals(Object obj){
		return true;
	}
	public static void main(String[] args){
		System.out.println("Program Starts");
		Demo1 d1=new Demo1();
		System.out.println("Demo obj d1 :"+d1.toString());
		System.out.println("Demo obj d1 adress d1:"+d1.hashCode());
		Demo1 d2=new Demo1();
		System.out.println("Demo obj d2 :"+d2);//toString() method called internally by java compiler 
		System.out.println("Demo obj d2 adress in number:"+d2.hashCode());
		System.out.println("Comparing d1 and d2 object of demo class based on adress:"+d1.equals(d2));//false
        Demo1 d3=d2;
        System.out.println("Demo obj d3:"+d3);//toString() method called internally by java compiler 
		System.out.println("Demo obj d3 adress in number:"+d3.hashCode());
		System.out.println("Comparing d2 and d3 object of demo class based on adress:"+d2.equals(d3));//true
		ObjectClassExample2 obj1=new ObjectClassExample2();
		System.out.println("ObjectClassExample2 obj1 :"+obj1.toString());//Pune
		System.out.println("ObjectClassExample2 obj1 adress in number: "+obj1.hashCode());//101
		ObjectClassExample2 obj2=new ObjectClassExample2();
		System.out.println("ObjectClassExample2 obj1 :"+obj2.toString());//Pune
		System.out.println("ObjectClassExample2 obj1 adress in number: "+obj2.hashCode());//101
		System.out.println("comparing obj1 and obj2 using equals():"+obj1.equals(obj2));//true
		System.out.println("Program Ends");
	}
}
