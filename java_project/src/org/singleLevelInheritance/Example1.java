package org.singleLevelInheritance;

class Sample1{
	int age=10;
	static int empId=101;
}
class Sample2{
	double salary=45000.45;
	static boolean status=true;
}
public class Example1{
	char grade='A';
	static int pin=3245;
	public static void main(String[] args){
		System.out.println("Program Starts");                                     
		System.out.println("Example1 class static variable pin:"+Example1.pin);     //3245
		Example1 ref=new Example1();
		System.out.println("Example1 class non-static variable:"+ref.grade);        //'A'
		
		System.out.println("Sample1 class static variable empId:"+Sample1.empId);   //101
		System.out.println("Sample2 class static variable empId:"+Sample2.status);  //45000.45
		
		Sample1 ref2=new Sample1();                                                 
		System.out.println("Sample1 age:"+ref2.age);                                 //10
		
		Sample2 ref3=new Sample2();
		System.out.println("Sample2 salary:"+ref3.salary);                           //45000.45
		System.out.println("Program Ends");
	}
}
