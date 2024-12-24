package org.array;

import java.util.Arrays;
public class MArray3{
	public static void main(String[] args){
		//declaring source array
		char[] copyFrom={'d','e','c','a','f','f','e','i','n','a','t','e','d'};
		System.out.println("Elements count in copyFrom array: "+copyFrom.length);
		
		//declaring a destination array
		char [] copyTo=Arrays.copyOf(copyFrom,5);//d e c a f copied elements
		System.out.println("Elements count in copyTo array: "+copyTo.length);//length of copied elements
		for(int i=0;i<copyTo.length;i++){
			System.out.print(copyTo[i]+ " ");//'d','e','c','a','f'
		}
		System.out.println();
		System.out.println("******copy using range*******");
		char[] copyWithRange=Arrays.copyOfRange(copyFrom,2,7);  //'c','a','f','f','e'
		for(int i=0;i<copyWithRange.length;i++){
			System.out.print(copyWithRange[i]+" ");
		}
		System.out.println();
		System.out.println("******After Sorting******");
		Arrays.sort(copyWithRange);  //it will sort array elements in ascending order and stored sorted element in th same array
		for(char c:copyWithRange){
			System.out.print(c+" ");  //'a','c','e',f,'f'
		}
	}
}
