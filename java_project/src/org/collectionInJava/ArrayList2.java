package org.collectionInJava;

import java.util.ArrayList;
import java.util.List;

public class ArrayList2 {
	public static void main(String[]args) {
		System.out.println("Program Starts");
		List ref1=new ArrayList();//RunTime Polymorphism-->Inheritance+Upcasting+Overriding
		ref1.add("Pune");//Auto Upcasting:-conversion from String to Object class object
		ref1.add(120);//Auto Boxingto get Integer class object, then Auto up casting to convert into Object class object
		ref1.add(true);//Auto Boxing -->upcasting
		ref1.add("Pune");
		ref1.add(null);
		System.out.println("List elements are="+ref1);
		System.out.println("List elements count="+ref1.size());
		List ref2=new ArrayList();
		ref2.add("Green");
		ref2.add("Blue");
		ref2.add("Yellow");
		System.out.println("List elements are="+ref2);
		System.out.println("List elements count="+ref2.size());
		
		ref2.addAll(ref1);
		System.out.println("After adding ref1 into ref2,elements of ref2 are:-"+ref2);
		ref2.removeAll(ref1);
		System.out.println("After removing ref1 from ref2,elements of ref2 are:-"+ref2);
		ref2.addAll(2,ref1);
		System.out.println("After adding ref1 into ref2,elements of ref2 are:-"+ref2);
		ref2.removeAll(ref1);
		System.out.println("After removing ref1 from ref2,elements of ref2 are:-"+ref2);
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