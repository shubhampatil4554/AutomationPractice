package org.array;

class TestArray {
	// creating method which returns array
	static int[] getArray() {
		/*
		 * int[] num=new int[3]; 
		 * num[0]=10; 
		 * num[1]=13; 
		 * num[2]=15; return num; //or
		 */
		return new int[] { 10, 30, 50, 90, 60 };
	}
}

public class Array5 {
	public static void main(String[] args) {
		// calling method which returns an array
		int[] arr = TestArray.getArray();
		// Printing the values of an array
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
