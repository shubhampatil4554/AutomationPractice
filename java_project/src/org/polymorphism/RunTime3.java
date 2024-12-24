package org.polymorphism;

class Car{
	int price=25000;
	void run(){
		System.out.println("Running");
	}
}
class Innova extends Car{
	int price=50000;
}
public class RunTime3{
	Car c=new Innova();
	//c.run();
	//System.out.println(c.price);
}
