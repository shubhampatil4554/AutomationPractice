package org.array;

public class MArray2{
	public static void main(String[] args){
		//declaring and initialising 2d array
		int[][] arr={{1,2,3},{4,5},{7,8,9,4}};//each entry is one row
		//printing 2d array
		for(int i=0;i<arr.length;i++){  //row=1 |row=2 |row=3
			for(int j=0;j<arr[i].length;j++){  //row=0 col=3|row=1 col=2 |row=2 col=4
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		char[][] charArr={{'a','b'},{'e','c','d'},{'x','y','z'}};
		for(int i=0;i<charArr.length;i++){
			for (int j=0;j<charArr[i].length;j++){
				System.out.print(charArr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
