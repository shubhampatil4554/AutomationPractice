package org.array;

class TestArray4{
	//creating a method which receives an array as a parameter
	static void min(int[] arr){
		int min=arr[0];
		for(int i=0;i<arr.length;i++){  //0<6|1<6|2<6|3<6|4<6|5<6|6<6-false   
			if(min > arr[i]){           //33>33|33>13|13>4|4>50|4>15|4>1
				min=arr[i];            //13|4|1
			}
		}
		System.out.println("Min number in array is :"+min);
	}
	static void max(int[] arr){
		int max=arr[0]; 
		for (int i=0;i<arr.length;i++){   //0<6 |1<6 |2<6 |3<6 |4<6 |5<6 |6<6-false
			if(max < arr[i]){             //33<33 |33<13 |33<4 |33<50 |50<15 |50<1
				max=arr[i];               //33|50
			}
		}
		System.out.println("Max number in array is :"+max);
	}
}
public class Array4{
	public static void main(String[] args){
		int [] a={33,13,4,50,15,1}; //declaring and initialising array
		TestArray4.min(a); //passing array to method
		TestArray4.max(a); //passing array to method
	}
}