package org.patternsProgram;

public class FloydTriangle {
	public static void main(String[] args) {
		int a=0;
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				a++;
				System.out.print(a+" ");
			}
			System.out.println();
		}
	}
}
/*
1 
2 3 
4 5 6 
7 8 9 10 
*/