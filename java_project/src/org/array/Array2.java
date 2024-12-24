package org.array;

public class Array2{
	public static void main(String[] args){
		//create an array
		int[] age={12,4,25,2,5};
		//access each array elements
		System.out.println(age[0]);//12
		System.out.println(age[1]);//4
		System.out.println(age[2]);//25
		System.out.println(age[3]);//2
		System.out.println(age[4]);//5
		System.out.println("array size: "+age.length);
		System.out.println("********Using for loop********");
		for(int i=0 ; i<age.length ; i++){
			if(age[i]==25){
				System.out.println(age[i]+" is present at index "+i);
				break;
			}
		}
		System.out.println("*****Using for each loop******");
		for(int a:age){
			if(a==25){
				System.out.println(a);
				break;
			}
		}
		for(int a: age){
			System.out.print(a+" ");
		}
	}
}
