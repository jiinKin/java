package com.min.edu;

//선택된 메뉴와 갯수를 출력하고 가격을 계산하는 클래스
public class Select {

	public int select(int m, int b) {

		int total=0;
		int a =0; 
		switch (m) {
		case 1:
			System.out.println("아이스 아메리카노 "+b+"잔");
			a =2000;
			break;
		case 2:
			System.out.println("초코 라떼 "+b+"잔");
			a=3000;
			break;
		case 3:
			System.out.println("레몬에이드 "+b+"잔");
			a=2500;
			break;

		case 4:
			System.out.println("아이스티 "+b+"잔");
			a=3000;
			break;
		}
		total = a*b;
		return total;
	}

}