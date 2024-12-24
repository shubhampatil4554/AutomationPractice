package org.methodsType;

public class NoFormalArguments {
	int num;
	static double num1;
	public static void test() {
		
	}
	public void test1() {
		
	}
	public static int test2() {
		NoFormalArguments obj=new NoFormalArguments();
		return obj.num;
	}
	public double test3() {
		return num1;
	}
	public static void main(String[] args) {
		System.out.println(NoFormalArguments.num1);
		NoFormalArguments.test();
		NoFormalArguments.test2();
		NoFormalArguments obj1=new NoFormalArguments();
		System.out.println(obj1.num);
		obj1.test1();
		obj1.test3();
	}
}
