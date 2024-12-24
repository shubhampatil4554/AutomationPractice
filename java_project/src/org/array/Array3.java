package org.array;

public class Array3{
	public static void main(String[] args){
		int[] numbers={2,-9,0,5,12,-25,22,9,8,12};
		int sum=0;
		double average;
		for(int number: numbers){
			//sum=sum+number;
			//or
			sum+=number;
		}
		//get total no. elements
		int arrayLength=numbers.length;
		//calculate average from int to double
		average=sum/arrayLength;
	    System.out.println("Sum="+sum);
		System.out.println("average="+average);
	}
}
