package org.collectionInJava;

import java.util.ArrayList;
import java.util.List;

public class ArrayList3 {
	public static void main(String[]args) {
		System.out.println("Program Starts");
		List ref1=new ArrayList();//RunTime Polymorphism-->Inheritance+Upcasting+Overriding
		ref1.add("Pune");//Auto Upcasting:-conversion from String to Object class object
		ref1.add(120);//Auto Boxingto get Integer class object, then Auto up casting to convert into Object class object
		ref1.add(true);//Auto Boxing -->upcasting
		ref1.add("Grapes");
		ref1.add(null);
		System.out.println("List elements are="+ref1);
		System.out.println("List elements count="+ref1.size());
		List ref2=new ArrayList();
		ref2.add("Apple");
		ref2.add("Grapes");
		ref2.add("Mango");
		System.out.println("List elements are="+ref2);
		System.out.println("List elements count="+ref2.size());
		ref1.retainAll(ref2);
		System.out.println("Common Element between in ref1 and ref2="+ref1);//Grapes
		ref1.clear();
		System.out.println("After clearing all elements of ref1="+ref1);
		System.out.println("Program Ends");
	}
}
/*
Iterator:-Its an interface that will help you to iterator collection elements one by one without indexing
    * hasNext():-boolean,true-it has next element | false-no next element
	* next():-object,get you the element from the collection ,if collection is empty or no next element then it will throw an exception
	         "NoSuchElementException"
	* remove():-boolean,to remove element from collection 
Note:-Iterator object can be used only once,if you want to iterator again then create new object
*/