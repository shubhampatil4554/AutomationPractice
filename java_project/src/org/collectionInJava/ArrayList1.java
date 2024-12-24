package org.collectionInJava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList1 {
	public static void main(String[]args) {
		System.out.println("Program Starts");
		//ArrayList ref=new ArrayList();
		//or
		List ref=new ArrayList();//RunTime Polymorphism-->Inheritance+Upcasting+Overriding
		ref.add("Pune");//Auto Upcasting:-conversion from String to Object class object
		ref.add(120);//Auto Boxingto get Integer class object, then Auto up casting to convert into Object class object
		ref.add(true);//Auto Boxing -->upcasting
		ref.add("Pune");
		ref.add(null);
		System.out.println("List elements are="+ref);
		System.out.println("List elements count="+ref.size());
		ref.add(3,"Banglore");
		System.out.println("Updated,List elements are="+ref);
		System.out.println("Updated,List elements count="+ref.size());
		System.out.println("Element At 2nd Index="+ref.get(2));
		ref.set(4,"Grapes");
		System.out.println("Updated,List elements are="+ref);
		System.out.println("Updated,List elements count="+ref.size());
		System.out.println("*******by using for loop*******");
		for(int i=0;i<ref.size();i++) {
			System.out.println("Element Present at index"+i+"is="+ref.get(i));
		}
		System.out.println("********by using for each loop*******");
		for(Object obj:ref) {
			System.out.println(obj);
		}
		System.out.println("**********By using iterator interface each******");
		Iterator itr=ref.iterator();
	//	System.out.println(itr.next());
	//	System.out.println(itr.next());
	//	System.out.println(itr.next());
	//	System.out.println(itr.next());
	//	System.out.println(itr.next());
	//	System.out.println(itr.next());
	//	System.out.println(itr.next());//NoSuchElementException
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("**Already used Iterator****");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("After 1st iteration ,it will not give any element="+itr.hasNext());
		System.out.println("**********By using new iterator interface each******");
		Iterator itr2=ref.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
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