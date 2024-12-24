package org.package2;

public class Test3 {
	public static void main(String[] args) {
		System.out.println("Hello ,I am Test3 class Main");
		org.package1.Sample1 ref=new org.package1.Sample1();
		System.out.println("public Number4 from sample1:-"+ref.num4);
		org.package1.Sample1 ref2=new org.package1.Sample1();
		System.out.println("public number4 from sample using ref4:-"+ref2.num4);
		
	}
}
