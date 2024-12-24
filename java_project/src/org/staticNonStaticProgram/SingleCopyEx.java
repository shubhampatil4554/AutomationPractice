package org.staticNonStaticProgram;

public class SingleCopyEx {
	public static int x=50;
    public static void main(String[] args) {
    	System.out.println("Program Starts");
    	System.out.println("x= "+SingleCopyEx.x);     //50
    	SingleCopyEx.x=99;
    	System.out.println("x= "+SingleCopyEx.x);     //99
    	System.out.println("*********");
    	SingleCopyEx obj=new SingleCopyEx();
    	System.out.println("x= "+obj.x);              //99
    	obj.x=100;
    	System.out.println("x= "+obj.x);              //100
    	System.out.println("*********");
    	SingleCopyEx obj2 = new SingleCopyEx();
    	System.out.println("x+"+obj2.x);              //100
    	System.out.println("*********");
    	System.out.println("x= "+x);                  //100
    	x=200;
    	System.out.println("x= "+x);                  //200
    	System.out.println("program Ends");
    }
}
