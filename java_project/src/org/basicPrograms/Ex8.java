package org.basicPrograms;

import java.util.Scanner;

public class Ex8 {
	public static void main(String[] args) {
		Scanner ref=new Scanner(System.in);
		System.out.println("Enter the array size");
        int size=ref.nextInt();
		double [] arr=new double[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter the elements of array");
			arr[i]=ref.nextDouble();
		}
		System.out.println("**************");
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
