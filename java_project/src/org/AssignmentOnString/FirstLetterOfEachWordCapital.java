package org.AssignmentOnString;

public class FirstLetterOfEachWordCapital {
	public static void main(String[] args) {
		String str="shubham patil";
		char [] arr=str.toCharArray();
		for(int i=0;i<arr.length;i++) {
			arr[0]=Character.toUpperCase(arr[0]);
			if(arr[i]==' ') {
				arr[i+1]=Character.toUpperCase(arr[i+1]);
			}
		}
		str=String.valueOf(arr);
		System.out.println(str);
	}
}
