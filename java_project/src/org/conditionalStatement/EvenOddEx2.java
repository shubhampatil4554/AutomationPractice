package org.conditionalStatement;

public class EvenOddEx2 {
	//Way 4:
	public static void main(String[] args){
		EvenOddEx2 obj=new EvenOddEx2();
		if (obj.checkEvenOdd(10)){
			System.out.println("Even");
		}else{
			System.out.println("Odd");
		}
	}
	public boolean checkEvenOdd(int a){
		if (a%2==0){
			return true;
		}
		else{
			return false;
		}
	}
	//=====================
	//Way 3:
	/*public static void main(String[] args){
		EvenOddEx2 obj=new EvenOddEx2();
		boolean flag=obj.checkEvenOdd(10);
		if (flag==true){
			System.out.println("Even");
		}else{
			System.out.println("Odd");
		}
	}
	public boolean checkEvenOdd(int a){
		boolean flag=false;
		if (a%2==0){
			flag=true;
		}else{
			falg=false;
		}
		return flag;
	}*/
	//=====================
	//way 2:
	/*public static void main(String[] args){
		EvenOddEx2 obj=new EvenOddEx2();
		obj.checkEvenOdd(10);
	}
	public void checkEvenOdd(int a){
		if (a%2==0){
			System.out.println("Even");
		}
		else{
			System.out.println("Odd");
		}
	}*/
	//================
	//Way 1:
	/*public static void main(String[] args){
		int a=10;
		if (a%2==0){
			System.out.println("Even");
		}else{
			System.out.println("Odd");
		}
	}*/
}
