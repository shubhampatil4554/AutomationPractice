package org.loopsPractice;

public class ForEx5 {
	public static void main(String[] args){
		System.out.println("Program starts");
		for(int a=1,b=11,c=50;(a<11 && b<15 && c>47) ;a++,b++,c--){
			System.out.println(a +","+ b +","+ c);
		}
		System.out.println("Program Ends");
	}
}
/*
execution          Condition                  output
a=1  b=11 c=50    1<11 && 11<15 && 50<47       1,11,50
a=2  b=12 c=49    2<11 && 12<15 && 49<47       2,12,49
a=3  b=13 c=48    3<11 && 13<15 && 48<47       3,13,48
a=4  b=14 c=47    4<11 && 14<15 && 47<47-->false    */