package org.AssignmentOnString;

public class AdditionOfSingleDigits {
	public static void main(String[] args) {
		String str = "MH12EL59XC9M1X101";
		int sum = 0;
		String temp = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch)) {
				temp += ch;
				sum = sum + Integer.parseInt(temp);
				temp = "";
			}
		}
		System.out.println(sum);
	}
}
//1+2+5+9+9+1+1+1=29