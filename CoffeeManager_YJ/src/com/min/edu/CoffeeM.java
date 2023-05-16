package com.min.edu;


//TODO 001 커피메뉴판 출력 메소드 만들기
public class CoffeeM {
	
	
	public static String[]menu = new String[] {"아메리카노","라떼","사과주스"};
	public static int[]price = new int[] {1500,2000,3000};
	
	
	
	public void Menu() {
		for (int i = 0; i < menu.length; i++) {
			System.out.println((i+1)+"." +menu[i] +" "+ price[i] + "원");

		}

	}
	
	// 메소드명 Menu

}
