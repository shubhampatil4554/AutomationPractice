package org.conditionalStatement;

public class IfElseLadder {
	public static void  main(String[] args){
		int marks=-99;
		if (marks>=0 && marks<=39){
			System.out.println("Fail");
		}else if(marks>=40 && marks<= 59){
			System.out.println("Just Pass");
		}else if (marks>=59 && marks <= 74){
			System.out.println("First Class");
		}else if(marks >=75 && marks<= 100){
			System.out.println("Distinction");
		}
		else{
			System.out.println("Invalid Input");
		}
	}
}
//marks 0 to 39 =fail
//marks 40 to 59 =just pass
//marks 60 to 74 =first class
//marks 75 to 100 = Distinction
//marks >100 & marks <0 = Invalid Input
