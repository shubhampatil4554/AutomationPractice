package org.collectionInJava;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class ArrayListHashSetGeneric {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("Ravi");
		list.add("Vijay");
		list.add("Ajay");
		list.add("Ravi");
		System.out.println("List Elements="+list);
		//HashSet<String> set=new HashSet<String>();
		//set.setAll(list);
		//or
		HashSet<String> set=new HashSet<String>(list);
		System.out.println("Element in set"+set);
		set.add("Gaurav");
		System.out.println("Set Elements="+set);
		System.out.println("********");
		Iterator itr=set.iterator();
		for(Object str:set) {
			System.out.println(str);
		}
		System.out.println("********");
		Iterator itr1=set.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		System.out.println("********");
		set.removeIf(str->str.contains("Ravi"));
		System.out.println("Set Elements after removeIf()="+set);
	}
}
