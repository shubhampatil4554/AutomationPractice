package org.package1;

public class Sample1{
	private int num1=10;
	int num2=20;
	protected int num3=35;
	public int num4=50;
	public static void main(String[] args){
		System.out.println("Hi,I am Sample1 class Main");
		Sample1 ref=new Sample1();
		System.out.println("private num1:-"+ref.num1);
		System.out.println("default num2:-"+ref.num2);
		System.out.println("protected num3:-"+ref.num3);
		System.out.println("public num4:-"+ref.num4);
	}
	
}
