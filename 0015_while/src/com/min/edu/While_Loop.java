package com.min.edu;

public class While_Loop {

	public static void main(String[] args) {
		int x = 0;
//		while(x <5) { // 0  1 2 3 4 
//			System.out.println(x++);
//		}
		
		while(true) {
			System.out.println(x++);
			if(x == 5) {
				break;
			}
		} // while
		
		int y = 0;
		do {
			System.out.println("실행" + (y++));
		} while (y==1);
	}

}



