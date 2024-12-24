package org.immutableClass;
//Immutable Class
final class Testing{
	//data member declared as final
	final String name;
	final int empId;
	//use constructor should be parameterized to initialize data members/variables
	Testing(String name,int empId){
		this.empId=empId;
		this.name=name;
	}
	//use getter method access them
	public String getName(){
		return name;
	}
	public int empId(){
		return empId;
	}
}
public class Example6{
public static void main(String[] args){
	Testing ref1=new Testing("sourabh",101);
	System.out.println(ref1.getName());
	System.out.println(ref1.empId());
	//ref1.name="Kaushal";
	//ref1.empId=105;
	Testing ref2=new Testing("kaushal",105);
	System.out.println(ref2.name);
	System.out.println(ref2.empId);
}
}
/*
immutable class:
      a class for which object value can't be modified example: String,Wrapper Classes
	  Immutable class:-
	          1.class & data member should be declared as final
			  2.these variables should be initialized by constructor
			  3.these variables should access by using getter method
*/
