package org.collectionInJava;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMap3 {
	public static void main(String[]args) {
		Map<String,String> m1=new HashMap<String,String>();
		m1.put("key1","admin");//upcasting
		m1.put("key2","admin");//upcasting
		m1.put("key3","admin123");//upcasting
		System.out.println("Map elements are="+m1);
		System.out.println("Map element count="+m1.size());
		System.out.println("*****************");
		for(Entry pair : m1.entrySet() ) {
			System.out.println(pair);
			System.out.println(pair.getKey()+" : "+pair.getValue());
		}
	}
}
