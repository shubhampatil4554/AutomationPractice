package org.polymorphism;

class Bank{
	float getRateOfInterest(){
		return 0;
	}
}
class SBI extends Bank{
	float getRateOfInterest(){
		return 8.4f;
	}
}
class ICICI extends Bank{
	float getRateOfInterest(){
		return 7.3f;
	}
}
class Axis extends Bank{
	float getRateOfInterest(){
		return 9.7f;
	}
}
public class RunTime4{
	public static void main(String[] args){
		Bank b=new SBI();
		System.out.println("SBI rate of Interest : "+b.getRateOfInterest());//8.4
		b=new ICICI();
		System.out.println("ICICI rate of interest:"+b.getRateOfInterest());//7.3
		b=new Axis();
		System.out.println("Axis rate of interest:"+b.getRateOfInterest());//9.7
	}
}
