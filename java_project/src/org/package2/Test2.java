package org.package2;
import org.package1.*;

public class Test2{
	public static void main(String[] args){
		System.out.println("Hello,I am Test2 class main");
		Sample1 ref1=new Sample1();
		System.out.println("public Number4 from sample1 ref:-"+ref1.num4);
		Sample1 ref2 =new Sample1();
		System.out.println("public number4 from Sample1 using ref2:-"+ref2.num4);
	}
}
