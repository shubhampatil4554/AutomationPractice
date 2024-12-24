package org.abstraction;

abstract class RBIBank{
	abstract double getRateOfInterestForHomeLoan();
	final void loan(){
		System.out.println("As per RBI loan");
	}
}
class SBI101 extends RBIBank{
	double getRateOfInterestForHomeLoan(){
		return 6.45;
	}
	void openPFAccount(){
		System.out.println("SBI PF Account");
	}
}
class PNB extends RBIBank{
	double getRateOfInterestForHomeLoan(){
		return 7.5;
	}
}
class AbstractClass3{
	public static void main(String[] args){
		PNB p1=new PNB();
		System.out.println("PNB Rate of Interest:"+p1.getRateOfInterestForHomeLoan()+"%");
		p1.loan();
		SBI101 s1=new SBI101();
		System.out.println("SBI101 Rate of Interest:"+s1.getRateOfInterestForHomeLoan()+"%");
		s1.loan();
		RBIBank b1=new SBI101();
		System.out.println("RBI reference but object of SBI,rate of interest is: "+b1.getRateOfInterestForHomeLoan()+"%");
		RBIBank b2=new PNB();
		System.out.println("RBI reference but object of PNB,rate of interest is: "+b2.getRateOfInterestForHomeLoan()+"%");
	}
}
