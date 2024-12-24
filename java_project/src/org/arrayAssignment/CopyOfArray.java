package org.arrayAssignment;

public class CopyOfArray {
	public static void main(String[] args) {
		int [] arr= {1,2,3,4,5};
		int [] arrCopy=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j==i;j++) {
				arrCopy[j]=arr[i];
				System.out.println(arrCopy[j]);
			}
		}
		copyOfArray();
	}
	public static void copyOfArray() {
		int [] arr= {1,2,3,4,5};
		int [] arrCopy=arr.clone();
		for(int i=0;i<arrCopy.length;i++) {
			System.out.println(arrCopy[i]);
		}
	}
}
