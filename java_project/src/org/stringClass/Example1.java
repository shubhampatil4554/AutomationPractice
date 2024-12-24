package org.stringClass;

public class Example1 {
	public static void main(String[] args){
		System.out.println("Program starts");
		String s1="Pune";//new object will be created inside string constant pool area
		String s2="Pune";//no new object created,it will point to the existing object from string constant pool area
		String s3="Banglore";//new object will be created inside string constant pool area
		System.out.println("String Object s1: "+s1);//Pune
		System.out.println("String Object s2: "+s2);//Pune
		System.out.println("String Object s3: "+s3);//Banglore
		System.out.println("comparison string object s1 and s2 based on value: "+s1.equals(s2));//true
		System.out.println("comparison string object s1 and s3 based on value: "+s1.equals(s3));//false
		System.out.println("comparison string object s1 and s2 based on Address: "+s1==s2);//false
		System.out.println("comparison string object s1 and s3 based on Address: "+s1==s3);//false
		//String class object using new keyword
		String s4=new String("Chennai");//two object will be created 1.inside string constant pool 
		                                                           //2.outside string constant pool
		String s5=new String("Pune");//Only single object in outside string constant pool,as "Pune" is already present in string constant pool
		String s6=new String("pune");//two object will be created 1.inside string constant pool 
		                                                        //2.outside string constant pool
		String s7=new String("pune");//Only single object in outside string constant pool,as "Pune" is already present in string constant pool
		System.out.println("String Object s4: "+s4);//Chennai
		System.out.println("String Object s5: "+s5);//Pune
		System.out.println("String Object s6: "+s6);//pune
		System.out.println("String Object s7: "+s7);//pune
		System.out.println("comparison string object s4 and s5 based on value: "+s4.equals(s5));//false
		System.out.println("comparison string object s4 and s5 based on Address: "+s4==s5);//false
		System.out.println("comparison string object s1 and s5 based on value: "+s1.equals(s5));//true
		System.out.println("comparison string object s1 and s5 based on Address: "+s1==s5);//false
		System.out.println("comparison string object s6 and s7 based on value: "+s6.equals(s7));//true
		System.out.println("comparison string object s6 and s7 based on Address: "+s6==s7);//false
		System.out.println("Program Ends");
	}
}
