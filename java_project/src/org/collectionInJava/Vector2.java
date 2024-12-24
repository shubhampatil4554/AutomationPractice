package org.collectionInJava;

import java.util.Vector;

public class Vector2 {
	public static void main(String[]args) {
		Vector v1=new Vector();
		System.out.println("Default capacity of vector="+v1);//[]
		System.out.println("Vectoe element count="+v1.size());//0
		v1.setSize(3);
		System.out.println("Vector Element are="+v1);//[null,null,null]
		System.out.println("Default capacity of vector="+v1.capacity());//10
		System.out.println("Vector Element count="+v1.size());//3
		v1.add("Mumbai");
		System.out.println("Vector Element are="+v1);//[null,null,null,Mumbai]
		System.out.println("Default capacity of vector="+v1.capacity());//10
		System.out.println("Vector Element count="+v1.size());//4
	}
}
