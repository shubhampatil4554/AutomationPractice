package org.singletonClass;

class BankAccount {
	/*
	 * To create singleton class refer below points:- 1.create class constructor as
	 * private 2.create static private instance of current class 3.create static
	 * method which should returns object of current class
	 */
	private BankAccount() {
		System.out.println("I am private const of BankAccount class");
	}

	private static BankAccount obj = new BankAccount();

	public static BankAccount getInstance() {
		return obj;
	}

	int accId;

	void calling() {
		System.out.println("I am calling from BankAccount class");
	}
}

public class Example7 {
	public static void main(String[] args) {
		// BankAccount ref1=new BankAccount();//As constructor is declared as private
		// its object can't be created
		BankAccount ref1 = BankAccount.getInstance();
		System.out.println("AccountId using ref1: " + ref1.accId);
		ref1.calling();
		ref1.accId = 101;
		System.out.println("updated,account id using ref1: " + ref1.accId);
		BankAccount ref2 = BankAccount.getInstance();
		System.out.println("Account id using ref2: " + ref2.accId);
		ref2.calling();
	}
}
