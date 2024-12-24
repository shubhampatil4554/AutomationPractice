package org.methodsPractice;

public class ParaEx1 {
	public static void main(String[] args){
		System.out.println("Program Starts");
		ParaEx1 obj=new ParaEx1();
		obj.test1('a',false);
		obj.test2(10,7263912232l,22.24);
		obj.test3('b',23.24,true,20);
		obj.test4(23.5f,24.56f,22.24,true,'d');
		//obj.test4('d',23.54f,24.56f,22.24,true);//error sequence mandatory
		System.out.println("Program Ends");
	}
	public void test1(char ch,boolean flag){
		System.out.println("test 1");
	}
	public void test2(int a,long l,double d){
		System.out.println("test 2");
	}
	public void test3(char ch,double d,boolean b,int a){
		System.out.println("test 3");
		System.out.println("char ch="+ch);
		System.out.println("double d="+d);
		System.out.println("boolean b="+b);
		System.out.println("int a="+a);
	}
	public void test4(float f,float x,double d,boolean b,char ch){
		System.out.println("test 4");
	}
	//multiple methods as per type of parameters.
}
