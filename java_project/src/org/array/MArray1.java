package org.array;

public class MArray1{
	public static void main(String[] args){
		//Declaring and initialising 2D array
		int[][] arr=new int[3][3];    //3 row 3 column;
		System.out.println("total row in array:-"+arr.length);//row count
		System.out.println("col in row 0: "+arr[0].length);   //row-0 cell count
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){//cell count on current row
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("***************");
		arr[0][0]=1;
		arr[0][1]=2;
		arr[0][2]=3;
		arr[1][0]=4;
		arr[1][1]=5;
		arr[1][2]=6;
		arr[2][0]=7;
		arr[2][1]=8;
		arr[2][2]=9;
		//printing 2d array
		for (int i=0;i<arr.length;i++){
			for (int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}