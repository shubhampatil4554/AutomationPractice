package org.decisionStatements;

import java.util.Scanner;

public class SwitchCaseStatement {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number1");
		double num1 = scn.nextDouble();
		System.out.println("Enter the number2");
		double num2 = scn.nextDouble();
		System.out.println("Enter the arithmatic operation");
		double res;
		char ch = scn.next().charAt(0);
		switch (ch) {
		case '+': {
			res = num1 + num2;
			System.out.println(res);
			break;
		}
		case '-': {
			res = num1 - num2;
			System.out.println(res);
			break;
		}
		case '*': {
			res = num1 * num2;
			System.out.println(res);
			break;
		}
		case '/': {
			res = num1 / num2;
			System.out.println(res);
			break;
		}
		case '%': {
			res = num1 % num2;
			System.out.println(res);
			break;
		}
		default: {
			System.out.println("Invalid Operation");
		}
		}
	}
}
