package org.encapsulation;

class Demo{
	private int num1=10;
	public static void main(String[] args){
		System.out.println("I am main of Demo");
		Demo ref=new Demo();
		System.out.println("private num1:"+ref.num1);
	}
	//return num1
	public int getNum1(){
		return num1;
	}
	//parameter num1 the num1 to set
	public void setNum1(int num1){
		this.num1=num1;
	}
}
public class EncapExample1{
	public static void main(String[] args){
		Demo ref=new Demo();
		//System.out.println("private num1:"+ref.num1);//can't access as its declared private
		System.out.println("private num1 using ref and getter: "+ref.getNum1());
		ref.setNum1(25);
		System.out.println("Updated,private num1 using ref and getter :"+ref.getNum1());
	}
}
/*
getter:-
     its a method will help you to access private data from outside class
	           access modifier:- public
			   returntype :- depends on required private variable datatype
			   parameter:- NA
			   return value:- required private variable
setter:-
    its a method that will help you to modify private data from outside the class
	          access modifier :- public 
			  returntype:-void
			  parametere:-depends on required private variable datatype
			  return value:-NA
*Any class having only getter method will be known as read only class
*Any class having only setter method will be known as write only class

*Any class having both getter and setter method will be known as read-write class
*/
