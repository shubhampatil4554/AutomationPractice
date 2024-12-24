package org.collectionInJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class AssignmentExample3 {
	public static void main(String[] args) {
		List<String> l=new ArrayList<String>();
		l.add("Shubz");
		l.add("Rushi");
		l.add("Hrishi");
		l.add("Niks");
		l.add("Shubz");
		System.out.println(l);
		Set<String> l1=new TreeSet<String>(l);
		if(l.equals(l1)) {
			System.out.println("Above List is in sorted order");
		}else {
			System.out.println("Above List is not in sorted order");
		}
	}
}
