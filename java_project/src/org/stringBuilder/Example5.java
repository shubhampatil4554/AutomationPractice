package org.stringBuilder;

public class Example5 {
	public static void main(String[] args){
		//String s1=new String();
		//s1.
		StringBuilder sb=new StringBuilder("Banglore");
		System.out.println("Value: "+sb);//Banglore
		System.out.println("capacity: "+sb.capacity());//24
		sb.append(" is known as IT HUB");
		System.out.println(sb);//Banglore is known as IT HUB
		System.out.println("Updated Capacity: "+sb.capacity());//50
		sb.insert(22,"Educational");
		System.out.println("value: "+sb);//Banglore is known as IEducationalT HUB
		StringBuilder sb1=new StringBuilder("Banglore is known as Educational IT HUB");
		System.out.println("sb1 value: "+sb1);//sb1 value: Banglore is known as Educational IT HUB
		//equals() is not overrided here,it will compare two objects based on address only
		System.out.println(sb.equals(sb1));//false
		System.out.println(sb.toString().equals(sb1.toString()));//false
	}
}
/*
object with 'new'
Mutable
no Thread-safe,its multi-threaded
slow
growable in size
equals() is not overrided here,it will compare two objects based on address only
*/