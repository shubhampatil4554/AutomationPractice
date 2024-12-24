package org.conditionalStatement;

public class IfElseLadderResultEx {
	//Way 3:
		public static void main(String[] args){
			System.out.println("Program Stands");
			int marks=190;
			if (marks >=0 && marks <=39 ){
				System.out.println("Fail");
			}else if(marks >=40 && marks <=49){
				System.out.println("Just Pass");
			}else if(marks >=60 && marks <=65){
				System.out.println("First Class");
			}else if (marks >=66 && marks<= 100){
				System.out.println("Distinction");
			}else {
				System.out.println("Invalid marks");
			}
			System.out.println("Program Starts");
		}
		//way 2:
		/*public static void main(String[] args){
			System.out.println("Program Stands");
			int marks=190;
			if (marks >=0 && marks <=39 ){
				System.out.println("Fail");
			}else if(marks >=40 && marks <=49){
				System.out.println("Just Pass");
			}else if(marks >=60 && marks <=65){
				System.out.println("First Class");
			}else if (marks >=66 && marks<= 100){
				System.out.println("Distinction");
			}else if (marks < 0 || marks > 100){
				System.out.println("Invalid marks");
			}
			System.out.println("Program Starts");
		}*/
		//Way 1:
		/*public static void main(String[] args){
			System.out.println("Program Stands");
			int marks=190;
			if (marks >=0 && marks <=39 ){
				System.out.println("Fail");
			}else if(marks >=40 && marks <=49){
				System.out.println("Just Pass");
			}else if(marks >=60 && marks <=65){
				System.out.println("First Class");
			}else if (marks >=66 && marks<= 100){
				System.out.println("Distinction");
			}else if (marks < 0){
				System.out.println("Invalid marks");
			}else if (marks >100){
				System.out.println("Invalid marks");
			}
			System.out.println("Program Starts");
		}*/
	}
	//marks 0 to 39 = fail
	//marks 40 to 49 = pass class
	//marks 50 to 59 = second class
	//marks 60 to 65 = first class
	//marks 66 onwards = Distinction
	//marks < 0 = invalid marks
	//marks > 100 = invalid marks

