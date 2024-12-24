package org.superStatement;

class Sports{
	Sports(){
		System.out.println("From Sports Class");
	}
}
class Cricket extends Sports{
	Cricket(int a){
		this();  //transfer to From Cricket Class-2
		System.out.println("From Cricket Class-1");
	}
	Cricket(){
		//super();    //by compiler
		System.out.println("From Cricket Class-2");
	}
}
public class Player extends Cricket{
	Player(){
		super(2);
		System.out.println("Rohit Sharma");
	}
	public static void main(String[] args){
		Player ref=new Player();
	}
}
