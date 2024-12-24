package org.systemClass;

class Training{
		Training(){
			System.out.println("Training class constructor");
		}
		void manualTesting(){
			System.out.println("I am from Manual Testing");
		}
		void automationTesting(){
			System.out.println("I am from automation testing");
		}
	}
public final class SystemDemo2{
		static Training t1=new Training();     //Static reference
		public static void main(String[] args){
			System.out.println("Program starts");
			SystemDemo2.t1.manualTesting();
			SystemDemo2.t1.automationTesting();
			//classname.staticRefVar.method
			Training t2=new Training();
			t2.manualTesting();
			t2.automationTesting();
			System.out.println("Program Ends");
			//classname.staticRefVar.method
			System.err.println("I am error from SystemDemo2 class");
		}
	}

