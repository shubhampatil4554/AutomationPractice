package org.practicePrograms;
interface Class1{
	void classBody();
}
abstract class Class2 implements Class1{
	public void classBody() {
		System.out.println("From classBody Method in Class2");
	}
}
class Class3 extends Class2{
	public void classBody() {
		super.classBody();
		System.out.println("from classBody method in Class3");
	}
}
public class Driver1{
	public static void main(String[] args) {
	Class3 ref=new Class3();
	ref.classBody();
	}
}