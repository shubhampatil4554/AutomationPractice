package org.conditionalStatement;

public class NestedIfElseResult {
	public static void main(String[] args){
		int marks = 63;
		if (marks >=0 && marks <=100){
			if (marks>=39){
				if (marks >=50){
					if (marks>=60){
						if(marks>=66){
							System.out.println("Distinction");
						}else{
							System.out.println("First Class");
						}
					}else{
						System.out.println("Second Class");
					}
				}else{
					System.out.println("Just Pass");
				}
			}else{
				System.out.println("Fail");
			}
		}else {
			System.out.println("Invalid Marks");
		}
	}
}
