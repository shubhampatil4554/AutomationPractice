package org.array;

import java.util.Arrays;
public class MArray4{
	public static void main(String[] args){
		int [] array={33,3,4,5};
		System.out.println("Printing original array");
		for(int i: array){
			System.out.print(i+" ");//33 3 4 5
		}
		System.out.println();
		System.out.println("Printing clone array");
		int[] cloneArray=array.clone();
		for(int i: cloneArray){
			System.out.print(i+" ");//33 3 4 5
		}
		System.out.println();
		System.out.println("Are both equals array and cloneArray");
		System.out.println("Array & cloneArray content validation : "+Arrays.equals(array,cloneArray));
		int[] newCopiedArray=Arrays.copyOf(array,array.length);
		for(int i: newCopiedArray){
			System.out.print(i+" ");//33 3 4 5
		}
		System.out.println();
		System.out.println("********");
		int[] newCopiedrangeArray=Arrays.copyOfRange(array,1,2);//3
		for(int i:newCopiedrangeArray){
			System.out.print(i+" ");//3
		}
		System.out.println();
		System.out.println("Comparing newCopiedArray & newCopiedrangeArray:"+Arrays.equals(newCopiedArray,newCopiedrangeArray));
		System.out.println("********");
		System.out.println("Sorting of array");
		//sort the array elements in ascending order and stores the sorted element in the same array
		Arrays.sort(array);//3 4 5 33
		System.out.println("Sorting original array");
		for(int i:array){
			System.out.print(i+" ");//3 4 5 33
		}
	}
}