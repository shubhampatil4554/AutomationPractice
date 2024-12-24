package org.methodsType;

public class FormalArguments {
	int num;
	static double num1;
	static int[] arr = new int[4];
	static FormalArguments obj1 = new FormalArguments();

	public static void test(int a) {

	}

	public void test1(int b) {

	}

	public static int test2(int c) {
		return c;
	}

	public double test3(int d) {
		return d;
	}

	public static FormalArguments test4() {
		return obj1;
	}

	public int[] test5() {
		return new int[4];
	}

	public static int[] test6() {
		return new int[] { 1, 2, 3, 4, 5 };
	}

	public static void main(String[] args) {
		System.out.println(FormalArguments.num1);
		FormalArguments.test((int) num1);// method call statement
		FormalArguments.test2((int) num1);
		FormalArguments.test4();
		System.out.println(FormalArguments.test6());
		FormalArguments obj = new FormalArguments();
		System.out.println(obj.num);
		obj.test1(obj.num);
		obj.test3(obj.num);
		System.out.println(obj.test5());
	}
}
