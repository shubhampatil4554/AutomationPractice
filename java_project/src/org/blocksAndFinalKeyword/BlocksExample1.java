package org.blocksAndFinalKeyword;

public class BlocksExample1 {
	BlocksExample1(){
		System.out.println("I am with zero param constructor");
	}
	public static void main(String[] args){
		System.out.println("Program Starts");
		BlocksExample1 e1=new BlocksExample1();
		System.out.println("++++++++++++++++++");
		BlocksExample1 e2=new BlocksExample1();
		System.out.println("Program Ends");
	}
	static{
		System.out.println("***I am SIB1***");
	}
	{
		System.out.println("***I am NSB1***");
	}
}
/*
Blocks-->These blocks won't having any name
         We have 2 types of block in java
	*1.Static/Static Initialization Block(SIB):-
		 -Will be used when we want to execute or provide any information before getting inside main
		 -We can declare more than 1 SIB in class,int that case all SIB will be executed in sequential order before main
         -this block can be use initialize a variable or to call a method also
	Syntax:-
   static{
			 //Statements
		 }
    *2.Non-Static/Non-Static Initialization Block(NSIB/IIB):-
	     -will be used when we want to execute or provide any information before constructor
		 -we can declare more than 1 NSIB in class ,in that case all NSIB will be executed sequential order before constructor
		 -this block can be use to initialize a variable or to call a method also 
	Syntax:-
	    {
			//Statements
	    }
*/