package org.parsingProcess;

public class StringToPrimitveTypeParse {
	public static void main(String[] args) {
		String str="100";
		byte b=Byte.parseByte(str);
		short s=Short.parseShort(str);
		int i=Integer.parseInt(str);
		long l=Long.parseLong(str);
		float f=Float.parseFloat(str);
		double d=Double.parseDouble(str);
		boolean bl=Boolean.parseBoolean(str);
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(bl);
	}
}
