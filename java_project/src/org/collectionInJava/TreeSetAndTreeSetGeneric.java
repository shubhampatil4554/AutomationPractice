package org.collectionInJava;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetAndTreeSetGeneric {
	public static void main(String[] args) {
		//Creating and Adding element
		TreeSet<String> set=new TreeSet<String>();
		/*
		 * add() method overrided here,before adding any new element 
		 * it will compare with existing elements and
		 * store them in sorted order
		 */
		set.add("Ravi");
		set.add("Vijay");
		set.add("Ravi");
		set.add("Ajay");
		System.out.println("TreeSet Elements="+set);
		//Traversing Elements
		Iterator itr=set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("Traversing element through Iterator in Descinding Order");
		Iterator itr1=set.descendingIterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		TreeSet<Integer> i=new TreeSet<Integer>();
		i.add(24);
		i.add(66);
		i.add(12);
		i.add(15);
		System.out.println("TreeSet Elements are="+i);
		System.out.println("Remove first element="+i.pollFirst());
		System.out.println("After using pollFirst(),Treeset Elements are="+i);
		System.out.println("Remove Last Element="+i.pollLast());
		System.out.println("After using pollLast(),TreeSet Elements are="+i);
		TreeSet<String> str=new TreeSet<String>();
		str.add("A");
		str.add("B");
		str.add("C");
		str.add("D");
		str.add("E");
		System.out.println("Initial str="+str);
		System.out.println("Reverse TreeSet="+str.descendingSet());//high to low descinding order
		System.out.println("Head set="+str.headSet("c"));//A,B
		System.out.println("Head Set="+str.headSet("c", true));//A,B,C
		System.out.println("Subset="+str.subSet("A", "E"));//A,B,C,D
		System.out.println("Subset="+str.subSet("A",false,"E",true));//B,C,D,E
		System.out.println("Tailset="+str.tailSet("C"));//D,E
		System.out.println("Tailset="+str.tailSet("C", false));//D,E
	}
}