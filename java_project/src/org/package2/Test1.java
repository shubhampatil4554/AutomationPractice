package org.package2;
import org.package1.*;

public class Test1 extends Sample1{
	public static void main(String[] args){
		System.out.println("Hi, I am Test1 class Main");
		Test1 ref = new Test1();
		System.out.println("protected number3:-"+ref.num3);
		System.out.println("public number4:-"+ref.num4);
	}
}
