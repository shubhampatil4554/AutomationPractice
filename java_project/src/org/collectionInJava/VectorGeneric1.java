package org.collectionInJava;

import java.util.Vector;

public class VectorGeneric1 {
	public static void main(String[]args) {
		//create a vector
		Vector<String> vec=new Vector<String>();//default capacity is 10,its capacity increase by 100% of its size
		//adding element using add() method of list
		vec.add("Tiger");
		vec.add("Lion");
		vec.add("Dog");
		vec.add("Elephant");
		//adding element using addElement() method of vector
		vec.addElement("Rat");
		vec.addElement("Cat");
		vec.addElement("Deer");
		System.out.println("Elements are="+vec);
		for(String str:vec) {
			System.out.println(str);
		}
	}
}
/*Synchronized-Thread safe--->slow
 * default capacity-->10--->increase capacity by 100%
 * vector comes from jdk 1.0-->also known as legacy class
*/
