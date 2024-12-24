package org.collectionInJava;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class AssignmentExample4 {
	public static void main(String[] args) {
		List<String> l=new ArrayList<String>();
		l.add("Shubz");
		l.add("Rushi");
		l.add("Hrishi");
		l.add("Niks");
		l.add("Shubz");
		System.out.println(l);
		Queue<String> str=new PriorityQueue<String>();
		str.add("Apple");
		str.add("Mango");
		str.add("Grapes");
		System.out.println(str);
		str.addAll(l);
		//Queue<String> str=new PriorityQueue<String>();
		System.out.println(str);
		//System.out.println(l);//[Shubz, Rushi, Hrishi, Niks, Shubz]
	}
}
