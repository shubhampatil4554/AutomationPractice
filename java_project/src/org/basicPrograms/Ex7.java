package org.basicPrograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Vector;

public class Ex7{
	public static void main(String[]args) {
	    Set ref=new HashSet();
		ref.add("Shubham");
		ref.add("Rushikesh");
		ref.add("Hrushi");
		ref.add("Rutik");
		ref.add("Jatin");
		Set ref1=new HashSet();
		ref1.add("Abhishek");
		ref1.add("Harshal");
		ref1.add("Kedar");
		ref1.add("Shubham");
		ref1.add("Vedant");
		ref1.addAll(ref);
		System.out.println(ref);
		//ref1.addAll(3, ref);
		System.out.println(ref);
		//System.out.println(ref.indexOf("Hrushi"));
		System.out.println(ref.contains("Jatin"));
		System.out.println(ref1.containsAll(ref));
		Iterator itr=ref.iterator();
		System.out.println("Using iterator");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("Using For each");
		for(Object o:ref1) {
			System.out.println(o+" ");
		}
		System.out.println(ref.size());
		System.out.println(ref1.isEmpty());
		System.out.println("Using Array for");
		Object o[]=ref1.toArray();
		for(int i=0 ; i<o.length;i++) {
			System.out.println(o[i]+" ");
		}
	}
}
