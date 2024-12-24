package org.methodOverLoading;

public class Example1 {
	public static void main(String[] args){
		primeNumber();
		primeNumber(7);
	}
	public static void primeNumber(){
		int num=5,ct=0;
		for(int i=1;i<=num;i++){
			if(num%i==0){
				ct++;
			}
		}
		if (ct==2){
			System.out.println("Given Number is Prime");
		}else{
			System.out.println("Given Number is not prime");
		}
	}
	public static void primeNumber(int num){
		int ct=0;
		for(int i=1;i<=num;i++){
			if(num%i==0){
				ct++;
			}
		}
		if (ct==2){
			System.out.println("Given Number is Prime");
		}else{
			System.out.println("Given Number is not prime");
		}
	}
}
/*Prime : a number is divisible by 1 or itself known as prime*/