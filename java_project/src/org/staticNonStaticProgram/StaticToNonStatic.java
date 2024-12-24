package org.staticNonStaticProgram;

public class StaticToNonStatic {
		public int a=10,b=20;      //non static global variables
		public void test1(){       //non static method
			System.out.println("test 1");
		}
		public void test2(){       //Non static method
			System.out.println("Test 2");
		}
		public static void test3(){   //static method
			//We can not call local object/variable here
			StaticToNonStatic  obj = new StaticToNonStatic();  //local object/variable
			System.out.println("x= "+obj.a);
			System.out.println("b= "+obj.b);
			int sum=obj.a+obj.b;
			System.out.println("Sum= "+sum);
			obj.test1();
			obj.test2();
		}
		public static void main(String[] args){  //Static method
			System.out.println("**Program Starts**");
			StaticToNonStatic  obj = new StaticToNonStatic();   // local object/variable
			System.out.println("x= "+obj.a);
			System.out.println("b= "+obj.b);
			int sum=obj.a+obj.b;
			System.out.println("Sum= "+sum);
			obj.test1();
			obj.test2();
			System.out.println("**********");
			//Other class Non Static data calling
			Ex obj2=new Ex();
			System.out.println("c= "+obj2.c);
			obj2.outerClass();
			System.out.println("************");
			StaticToNonStatic.test3();   //static method calling
			System.out.println("**Program Ends**");
		}
	}
	class Ex{
		public int c=40;            //non static variables
		public void outerClass(){  //non static method
			System.out.println("outer class");
		}
	}
