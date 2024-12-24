package org.operators;

public class RelationalOperators {
	public static void main(String[] args) {
		System.out.println(true==true);//true
		System.out.println('a'>'A');//true
		System.out.println('d'!=100);//false
		System.out.println(0<0.0);//false
		System.out.println(59.99999<=60);//true
		//System.out.println(true>false);   CTE
		System.out.println(true!=false);//true
		System.out.println(100>=100.0000001);//false
		System.out.println(3.14==(22.0/7));//false
		System.out.println(3==(21/7));//true
	}
}
