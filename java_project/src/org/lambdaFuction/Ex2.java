package org.lambdaFuction;

interface Interf2{
	public int addition(int a,int b);
}
public class Ex2 {
	public static void main(String[] args) {
		Interf2 obj1= (x,b)-> { return x+b; };
		System.out.println("Sum ="+obj1.addition(26, 27));
		System.out.println("********");
		Interf3 obj2=(a,b)->{
			System.out.println("char ch="+a);
			System.out.println("boolean flag="+b);
		};
		obj2.printData('A', true);
	}
}
interface Interf3{
	public void printData(char ch,boolean flag);
}
