package org.collectionInJava;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMap1 {
	public static void main(String[] args) {
		TreeMap m1=new TreeMap();
		m1.put("key1","admin");//upcasting
		m1.put("key5","admin");//upcasting
		m1.put("key3","admin123");//upcasting
		m1.put("key0","admin");//upcasting
		System.out.println("Map elements are="+m1);
		System.out.println("Map element count="+m1.size());
		m1.putIfAbsent("key4", "NewKey");
		System.out.println("Map elements are="+m1);
		System.out.println("Map element count="+m1.size());
		SortedMap m2=m1.subMap("key0", "key3");
		System.out.println("M2 elements are:"+m2);
	}
}
