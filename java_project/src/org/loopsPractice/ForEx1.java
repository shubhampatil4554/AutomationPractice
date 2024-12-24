package org.loopsPractice;

public class ForEx1 {
	public static void main(String[] args){
		System.out.println("Program Starts");
		for(int i=1;i<11;i++){
			System.out.println("i ="+i);
		}
		//System.out.println("i ="+i);        //Error Scope of the i variable is only limited to for loop
		System.out.println("Program Ends");
	}
}
/* 
for (int i=50;i<10;i++){
	System.out.println("i ="+i);    
}
Control goes outside loop
*/
