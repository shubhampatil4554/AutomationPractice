package org.methodsType;

public class ThisInMethod {
	int num=20;
	static ThisInMethod obj=new ThisInMethod();
	public  ThisInMethod test(ThisInMethod obj) {
		return this;
	}
	ThisInMethod(){
		
	}
	public static void main(String[]args) {
		ThisInMethod Obj=new ThisInMethod();
		obj.test(new ThisInMethod());
	}
}
class Ex1{
	final int num;
	{
		num=10;
	}
}