package org.abstraction;

interface Drawable2{
	void draw();   //by default public abstract
	//Below default keyword can be used only inside interface	
	default void msg(){
		System.out.println("Default method");
	}
	static int cube(int x){
		return x*x*x;
	}
/*  default static int print(){
	    System.out.println("Default static method of interface ");
    }
	private methods are allow in jdk9
	private void test(){
		System.out.println("private method");
	}
*/
}
class Rectangle2 implements Drawable2{
	public void draw(){
		System.out.println("drawing rectangle");
	}
}
public class InterfaceDefaultStatic{
	public static void main(String[] args){
		Drawable2 obj=new Rectangle2();
		obj.draw();
		obj.msg();
		System.out.println(Drawable2.cube(3));
	}
}
/*
   From jdk8:in interface we have complete /non abstract method also but those
   methods should be declare with default or static 
*/
