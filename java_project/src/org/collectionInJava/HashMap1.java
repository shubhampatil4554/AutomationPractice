package org.collectionInJava;

import java.util.HashMap;
import java.util.Map;

public class HashMap1 {
	public static void main(String[]args) {
		Map m1=new HashMap();
		m1.put("key1","admin");//upcasting
		m1.put("key2","admin");//upcasting
		m1.put(null,"admin123");//upcasting
		System.out.println("Map elements are="+m1);
		System.out.println("Map element count="+m1.size());
		m1.put("key2","manager");
		m1.put(458,"manager");
		m1.put(null,1234);//boxing then upcasting
		System.out.println("Map elements are="+m1);
		System.out.println("Map element count="+m1.size());
		System.out.println("Get the key value="+m1.get("key2"));
		System.out.println("key set of Map="+m1.keySet());
		System.out.println("Values of map="+m1.values());
	}
}
/*To add any element in map we used put(key,value),key and value both should be object
 *toString() overrided here as well
 *to get only key from map use keySet()
 *to get values from Map use values()
 *if you want to get particular key value then use get(key)
 */

 