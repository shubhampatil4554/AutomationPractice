package org.abstraction;

interface Printable1{
	void print();
}
interface Showable1{
	void print();
}
public class Interface4 implements Printable1,Showable1{
	public void print(){
		System.out.println("Hello");
	}
	public static void main(String[] args){
		Interface4 obj=new Interface4();
		obj.print();
		Printable1 p=new Interface4();
		p.print();
		Showable1 s=new Interface4();
		s.print();
	}
}
