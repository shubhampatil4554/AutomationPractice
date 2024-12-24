package org.loopsPractice;

public class ContinueForEx {
	public static void main(String[] args){
		for (int i=1;i<11;i++){
			if(i==3||i==5||i==7){
				continue;
				//System.out.println("Hello");  //Error
			}
			System.out.println(i);
		}
	}
}
//Continue is used to skip the execution of current iteration of loop