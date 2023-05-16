package com.min.edu;

public class If_Fn {

	// 3 4 5 6 7 8 9를 3묶음으로 출력
	// 3579
	// 48
	// 6
	String aG = "";
	String bG = "";
	String cG = "";
	
	public void groupNum() {
		
		for (int i = 3; i <= 9; i++) {
			if(i%2==1) {
				aG += i;
			}else if(i%4==0) {
//				System.out.println(i);
				bG += i;
			}else {
//				System.out.println(i);
				cG +=i;
			}
		}
		
		System.out.println(aG);
		System.out.println(bG);
		System.out.println(cG);
	} // groupNum
	
}





