package org.array;

import java.util.Arrays;
public class MArray5{
	public static void main(String[] args){
		//declaring source array
		char[] orgArray={'a','b','e','c','d'};
		//dublicate array
		char[] cloneArray=orgArray.clone();
		//Sorting orgArray in ascending array
		Arrays.sort(orgArray);  //a,b,c,d,e
		System.out.println("After sorting original array: ");
		for(int i:orgArray){
			System.out.print(i+" ");//a b c d e
		}
		System.out.println();
		System.out.println("Clone array");
		for(char c:cloneArray){
			System.out.print(c+" ");//a b e c d
		}
		System.out.println();
		System.out.println("**************");
		boolean result=Arrays.equals(cloneArray,orgArray);
		System.out.println(result);//false
		System.out.println("Clone Array Reverse");
		for (int i=cloneArray.length-1;i>=0;i--){
			System.out.print(cloneArray[i]+" ");//d c e b d
		}
		System.out.println();
		System.out.println("original Array reverse");
		for(int i=orgArray.length-1;i>=0;i--){
			System.out.print(orgArray[i]+" ");//e d c b a
		}
	}
}
