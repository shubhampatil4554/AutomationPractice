package org.abstraction;

interface A11{
	void a();    //by default public abstract
	void b();
	void c();
	void d();
}
//creating abstract class that provides the implementation of 'c' method of A11 interface
abstract class B11 implements A11{
	public abstract void a();
	public abstract void b();
	public void c(){
		System.out.println("I am C");
	}
	public void e(){
		System.out.println("I am E");
	}
	public abstract void d();
}
class M11 extends B11{
	public void a(){
		System.out.println("I am A");
	}
	public void b(){
		System.out.println("I am B");
	}
	public void d(){
		System.out.println("I am D");
	}
}
public class AbstractAndInterface{
	public static void main(String[] args){
		A11 a =new M11();
		a.a();
		a.b();
		a.c();
		a.d();
	}
}