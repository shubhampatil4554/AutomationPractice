package org.multiLevelInheritance;

//Parent class
class FourWheeler{
	//default constructor with default super()
	public void wheels(){
		System.out.println("I have 4 wheels");
	}
}
//child class of fourwheeler and parent of maruti
class Car extends FourWheeler{
	//default constructor with default super()
	public void type(){
		System.out.println("I am a car");
	}
}
class Maruti extends Car{
	//default constructor with default super()
	public void company(){
		System.out.println("I am maruti");
	}
}
public class Inheritance3{
	public static void main(String[] args){
		Maruti fr=new Maruti();
		fr.wheels();
		fr.type();
		fr.company();
	}
}
/*
add debug poin in the required line
f6-nextline or you want to execute current line
f5-if yoy want to go inside the called method
f8-continue
*/
