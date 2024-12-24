package org.staticNonStaticProgram;

public class NonStaticDirectObjectEx {
	public int a= 10;
	public void printData(){
		System.out.println("Print Data");
		//Way 1:direct by their name
		System.out.println("***");
		System.out.println("a="+a);  //50-object memory from Main method
		System.out.println("***");
		//Way 2:By using Object class
		NonStaticDirectObjectEx obj =new NonStaticDirectObjectEx();
		System.out.println("obj.a ="+obj.a);   //10-New Obj Memory
		System.out.println("***");
	}
	public static void main(String[] args){
		System.out.println("Program Starts");
		NonStaticDirectObjectEx obj =new NonStaticDirectObjectEx();
		System.out.println("obj.a ="+obj.a);    //10
		obj.a=50;
		System.out.println("obj.a ="+obj.a);    //50
		obj.printData();
		System.out.println("Program Ends");
	}
}
