package org.AssignmentOnString;

public class ReverseString {
	public static void main(String[] args) {
		String str="Pune";
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
		Reverse.ReverseString();
	}
}
class Reverse{
	public static void ReverseString() {
		String str="Pune";
		char [] ch=str.toCharArray();
		String rev="";
		for(int i=ch.length-1;i>=0;i--) {
			rev=rev+ch[i];
		}
		System.out.println(rev);
	}
}