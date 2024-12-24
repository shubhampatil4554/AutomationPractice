package org.staticNonStaticProgram;

public class NonStaticToNonStatic {
	public int a=10,b=20;
	public void test1() {
		System.out.println("Test 1");
	}
	public void test2() {
		System.out.println("Test 2");
	}
	public void printData() {
		//1st Way: By direct name( Works Fine in same class)
		System.out.println("a= "+a);         //50
		System.out.println("b= "+b);         //60
		test1();
		test2();
		System.out.println("***************");
		//2nd Way: By using Class Object (Works only when multiple classes involved)
		NonStaticToNonStatic obj =new NonStaticToNonStatic();
		System.out.println("a= "+obj.a);      //10
		System.out.println("b= "+obj.b);      //20
		obj.test1();
		obj.test2();
		System.out.println("**************");
		//3rd Way: By using This keyWord(Recommended Only When Local and Global names are same in same class)
		System.out.println("a= "+this.a);    //50
		System.out.println("b= "+this.b);    //60
		this.test1();
		this.test2();
        System.out.println("************");
	}
	public static void main(String[] args) {
		System.out.println("Program Starts");
		NonStaticToNonStatic obj=new NonStaticToNonStatic();
		obj.a=50;
		obj.b=60;
		obj.printData();
		System.out.println("Program Ends");
	}
}
