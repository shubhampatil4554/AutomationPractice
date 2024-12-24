package org.collectionInJava;

import java.util.Vector;

public class VectorGeneric3 {
	public static void main(String[] args) {
		Vector<String> vec=new Vector<String>();
		System.out.println("Elenents are ="+vec.capacity());
		vec.add("Tiger");
		vec.add("Lion");
		vec.add("Dog");
		vec.add("Elephant");
		vec.add("cat");
		vec.add("Tiger");
		vec.add("Lion");
		vec.add("Dog");
		vec.add("Elephant");
		vec.add("Lion");
		System.out.println("Elements are="+vec);
		System.out.println("After adding 10 element capacity is="+vec.capacity());
		vec.addElement("Mat");
		System.out.println("After adding 11th element capacity is="+vec.capacity());
		System.out.println("Elements are="+vec);
		for(String str:vec) {
			System.out.println(str);
		}
		//additional method of vector
		System.out.println("Returns first element of vector="+vec.firstElement());
		System.out.println("Returns last element of vector="+vec.lastElement());
		System.out.println("Last index of Lion object:"+vec.lastIndexOf("Lion"));
	}
}
