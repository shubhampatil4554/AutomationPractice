package org.collectionInJava;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AssignmentExample5 {
	public static void  main(String[]args) {
		List<String> l=new ArrayList<String>();
		l.add("Shubz");
		l.add("Rushi");
		l.add("Hrishi");
		l.add("Niks");
		l.add("Shubz");
		System.out.println(l);
		Set<String> str=new HashSet<String>(l);
		str.add("Apple");
		str.add("Mango");
		str.add("Grapes");
		System.out.println(str);
	}
}
