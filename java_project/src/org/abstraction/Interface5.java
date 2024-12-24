package org.abstraction;

interface Printable2{
	void print();
}
interface Showable2 extends Printable2{
	//public abstract void print();--->inherited method/virtual method
	public void show();
}
public class Interface5 implements Showable2{
	public void print(){
		System.out.println("Hello");
	}
	public void show(){
		System.out.println("Welcome");
	}
	public static void main(String[] args){
		Interface5 obj= new Interface5();
		obj.print();
		obj.show();
		Printable2 obj2 = new Interface5();
		obj2.print();
		Showable2 obj3=new Interface5();
		obj3.show();
		obj3.print();
	}
}

