package org.AssignmentOnString;

public class DigitsInStringAddition {
	public static void main(String[] args) {
		String str = "MH12EL59XC9M1X101";
		//variable to store the sum and the current number being fomed
		int sum=0;
		String temp="";
		//loop through each character in the string
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			//check if the character is digit
			if(Character.isDigit(ch)) {
				temp+=ch;//build the number as a string
			}else {
				//if the character is not a digit and temp is not empty,add the number to the sum
				if(!temp.isEmpty()) {
					sum+=Integer.parseInt(temp);
					temp="";//Reset temp
				}
			}
		}
		//Add the last number if the strings ends with digits
		if(!temp.isEmpty()) {
			sum+=Integer.parseInt(temp);
		}
		System.out.println("The sum of numbers in the string is "+sum);
	}
}
/*
 *ch=T,h,5
 *sum=0,0,0,5
 *temp="","","",5,"",
 */