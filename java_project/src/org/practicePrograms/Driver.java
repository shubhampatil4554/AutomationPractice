package org.practicePrograms;

abstract class Cricket{
	static void virat(){
		System.out.println("from virat method from Class cricket");
	}
	void player(){
		System.out.println("From player method of class Cricket");
	}
	Cricket(int a){
		System.out.println("Cricket Constructor");
	}
}
class Rohit extends Cricket{
	void player(){
		super.virat();
		System.out.println("From player method of class Rohit");
	}
	Rohit(int a){
		super(20);
		System.out.println("Rohit Constructor");
	}
}
public class Driver{
	public static void main(String[] args){
		Rohit r=new Rohit(20);
		r.player();
		Cricket c=new Rohit(20);
		c.player();
	}
}