package org.stringBuffer;

public class Example4 {
	public static void main(String[] args){
		//String s1=new string();
		//s1.
		StringBuffer sb=new StringBuffer("Banglore");
		System.out.println("Value: "+sb);//Banglore
		System.out.println("capacity: "+sb.capacity());//24
		sb.append(" is known as IT HUB");
		System.out.println(sb);//Banglore is known as IT HUB
		System.out.println("Updated Capacity: "+sb.capacity());//50
		sb.insert(22,"Educational");
		System.out.println("value: "+sb);//Banglore is known as IEducationalT HUB
		System.out.println(sb.reverse());//BUH TlanoitacudEI sa nwonk si erolgnaB
		StringBuffer sb1=new StringBuffer("BUH TlanoitacudEI sa nwonk si erolgnaB");
		System.out.println(sb.equals(sb1));//false
		System.out.println(sb);
		System.out.println(sb1);
	}
}
/*
Mutable
Thread safe,no multi-threading
slow
growable in size
equals() compares on the basis of address
*/

