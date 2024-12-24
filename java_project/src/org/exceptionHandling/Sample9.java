package org.exceptionHandling;

class ShubhamException extends Exception{
	ShubhamException(String msg){
		super(msg);
	}
}
public class Sample9 {
	public static void main(String[] args) {
		System.out.println("Program starts");
		try {
			checkAge(17);
		}catch(ShubhamException e) {
			e.printStackTrace();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Program Ends");
	}
	public static void checkAge(int age)throws ShubhamException,InterruptedException {
		Thread.sleep(2000);//checked exception -to delay the execution on given time(milli sec)
		if(age<18) {
			throw new ArithmeticException("You are Below Required Age");
		}else {
			System.out.println("You are good to proceed");
		}
	}
}
/*Throw:-
*When as a programmer you want to throw some exception use throw keyword
*this can be used inside the method body to throw any required exception
*this can throw maximum one exception at a time

throws:-
       this is used on method declaration label to declare an exception coming from method multiple exception can be declare on method label
*/