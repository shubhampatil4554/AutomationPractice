package org.patternsProgram;

public class InertedFullPyramidStar {
	public static void main(String[]args) {
		for(int i=0;i<9;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("  ");
			}
			for(int j=0;j<(9-i*2);j++) {
				System.out.print("* ");
			}
		System.out.println();
		}
	}
}
/*
* * * * * * * * * 
  * * * * * * * 
    * * * * * 
      * * * 
        * 
*/