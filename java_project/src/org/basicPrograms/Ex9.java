package org.basicPrograms;

public class Ex9 {
	public static void main(String[] args) {
		int [][] arr= {{2,3,4},{1,4,5,6},{2,1}};
		int row=arr.length;
		for(int i=0;i<row;i++) {
			int col=arr[i].length;
			for(int j=0;j<col;j++) {
				System.out.println(i+""+j+"="+arr[i][j]);
			}
		}
	}
}
