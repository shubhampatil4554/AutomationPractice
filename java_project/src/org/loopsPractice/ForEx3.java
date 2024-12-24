package org.loopsPractice;

public class ForEx3 {
	public static void main(String[] args){
		System.out.println("program starts");
		ForEx3 obj= new ForEx3();
		obj.intVarBeforeFor();
		System.out.println("Program ends");
	}
	public void intVarBeforeFor(){
		int i=1;
		for (   ;i<11;i++){
			System.out.println(i);
		}
		System.out.println("i ="+i);   //11
	}
}
/* Execution      output
int i=1 
i< 11               1
i=2  i<11           2
i=3  i<11           3
i=4  i<11           4
i=5  i<11           5
i=6  i<11           6
i=7  i<11           7
i=8  i<11           8
i=9  i<11           9
i=10 i<11           10
i=11 i<11
*/

