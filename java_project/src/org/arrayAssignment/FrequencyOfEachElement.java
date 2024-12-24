package org.arrayAssignment;

public class FrequencyOfEachElement {
	public static void main(String[] args) {
		int[] num={10,20,30,10,20,50,10};
		int [] frq=new int[num.length];
		int visited=-1;
		for(int i=0;i<num.length;i++) {
			int count=1;
			for(int j=i+1;j<num.length;j++) {
				if(num[i]==num[j]) {
					count++;
					//To avoid counting same element
					frq[j]=visited;
				}
			}
			//count store in frq array
			if(frq[i]!=visited) {
				frq[i]=count;
			}
		}
		//Display freq of each element
		for(int i=0;i<frq.length;i++) {
			if(frq[i]!=visited) {
				System.out.println(num[i]+"="+frq[i]);
			}
		}
	}
}
