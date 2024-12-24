package org.collectionInJava;

import java.util.ArrayList;
import java.util.List;

public class AssignmentExample2 {
	public static void main(String[] args) {
		List<String> l=new ArrayList<String>();
		l.add("Shubz");
		l.add("Rushi");
		l.add("Hrishi");
		l.add("Niks");
		l.add("Shubz");
		for(int i=0;i<l.size();i++) {
			int count=0;
			for(int j=0;j<l.size();j++) {
				if(l.get(i).equals(l.get(j))) {
					count++;
				}
			}
			if(count==2) {
				System.out.println(l.get(i));
			}
		}
	}
}
