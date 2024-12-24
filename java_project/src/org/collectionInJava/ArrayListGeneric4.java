package org.collectionInJava;

import java.util.ArrayList;
import java.util.List;

public class ArrayListGeneric4 {
	public static void main(String[]args) {
		System.out.println("Program starts");
		//Generic concept in collection
		List<String> ref1=new ArrayList<String>();
		ref1.add("Grapes");
		ref1.add("123");
		System.out.println("List1 element="+ref1);
		System.out.println("List element count="+ref1.size());
		
		List<Boolean> ref2=new ArrayList<Boolean>();
		ref2.add(true);
		ref2.add(false);
		System.out.println("List1 element="+ref2);
		System.out.println("List element count="+ref2.size());
		System.out.println("Program Ends");
	}
}
