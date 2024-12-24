package org.abstraction;

interface Bank{
	float rateOfInterest();
}
class SBI1 implements Bank{
	public float rateOfInterest(){
		return 9.15f;
	}
}
class PNB1 implements Bank{
	public float rateOfInterest(){
		return 9.7f;
	}
}
public class Interface2{
	public static void main(String[] args){
		SBI1 s1=new SBI1();
		System.out.println("SBI ROI: "+s1.rateOfInterest());
		PNB1 p1=new PNB1();
		System.out.println("PNB1 ROI: "+p1.rateOfInterest());
		Bank b=new SBI1();
		System.out.println("ROI: "+b.rateOfInterest());
		Bank b1=new PNB1();
		System.out.println("ROI: "+b1.rateOfInterest());
	}
}
