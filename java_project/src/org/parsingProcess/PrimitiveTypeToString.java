package org.parsingProcess;

public class PrimitiveTypeToString {
	public static void main(String[] args) {
		byte b=10;
		short sh=100;
		int i=1000;
		long l=1000000000l;
		float f=1000;
		double d=1000;
		boolean bl=true;
		String b1=String.valueOf(b);
		String sh1=String.valueOf(sh);
		String i1=String.valueOf(i);
		String l1=String.valueOf(l);
		String f1=String.valueOf(f);
		String d1=String.valueOf(d);
		String bl1=String.valueOf(bl);
		System.out.println(b1);
		System.out.println(sh1);
		System.out.println(i1);
		System.out.println(l1);
		System.out.println(f1);
		System.out.println(d1);
		System.out.println(bl1);
	}
}
