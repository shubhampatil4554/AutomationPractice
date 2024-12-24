package org.AssignmentOnString;

public class VowelsCount {
	public static void main(String[] args) {
		String str = "There Is Garden And It Is Beautiful";
		int count=0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'A' || ch == 'a' || ch == 'E' || ch == 'e' || ch == 'I' || ch == 'i' || ch == 'o' || ch == 'O'
					|| ch == 'U' || ch == 'u') {
				count++;
			}
		}
		System.out.println("Count of vowels="+count);
	}
}
