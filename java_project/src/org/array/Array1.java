package org.array;

public class Array1{
	public static void main(String[] args){
		          //0  1  2  3  4
		int[] num={10,20,30,40,50};
		int sum=0;//0  10  30  60  100 150
		double average=0;
		for(int number: num){  
			sum=sum+number;//0+10, 10+20,30+30,60+40,100+50
		}
		System.out.println("Sum="+sum);
		average=sum/num.length;
		System.out.println(average);//30
	}
}
//sum of number/number of count=average
