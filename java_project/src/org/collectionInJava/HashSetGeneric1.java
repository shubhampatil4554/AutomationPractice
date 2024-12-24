package org.collectionInJava;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetGeneric1 {
	public static void main(String []args) {
		//create hashset and adding element
		Set<String> set=new HashSet<String>();
		//in hashset if you try to add duplicate element then it will neglect that element
		//instead of throwing error
		set.add("Ravi");
		set.add("Vijay");
		set.add("Ravi");
		set.add("Ajay");
		System.out.println("Elements in set="+set);
		System.out.println("Set Size="+set.size());
		//traversing Elements
		Iterator itr=set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("Removing Ravi from set="+set.remove("Ravi"));
		System.out.println("After invoking remove(object) method="+set);
		HashSet<String> set1=new HashSet<String>();
		set1.add("Ajay");
		set1.add("Gaurav");
		System.out.println("Set1 Elements="+set1);
		set.addAll(set1);
		System.out.println("updated list of set"+set);
		//removeing all the new elements from HashSet
		set.removeAll(set1);
		System.out.println("After invoking removeAll() method="+set);
		//Removing elements on the basis of specified condition
		set.removeIf(str->str.contains("Vijay"));
		System.out.println("After invoking removeIf() method="+set);
		//Removing all the elements available in set
		set.clear();
		System.out.println("After invoking clear() method="+set);
	}
}
