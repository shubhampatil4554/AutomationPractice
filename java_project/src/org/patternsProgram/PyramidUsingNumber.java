package org.patternsProgram;

public class PyramidUsingNumber {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=(5-1*i);j++) {
				System.out.print("  ");
			}
			for(int j=1,num=1;j<(i+1*i);j++) {
				System.out.print(num+" ");
				num++;
			}	
		System.out.println();
		}
	}
}
/*      1 
      1 2 3 
    1 2 3 4 5 
  1 2 3 4 5 6 7 
1 2 3 4 5 6 7 8 9 
        * 
      * * * 
    * * * * * 
  * * * * * * * 
* * * * * * * * * 

*/