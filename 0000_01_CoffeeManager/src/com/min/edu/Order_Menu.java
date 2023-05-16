package com.min.edu;

import java.util.Scanner;

public class Order_Menu {
	Menu menu = new Menu();
	Scanner scan = new Scanner(System.in);

	/**
	 * 사용자의 메뉴 선택을 돕는 문구를 출력하면서 입력 받은 커피 종류별 잔 수를 Array에 담아 반환하는 메소드
	 * 
	 * @author HA,KH
	 * @return (orderArray) 커피 종류별 잔 수 Array
	 */
	public int[] scanMenu() {

		int[] orderArray = new int[menu.menu.length];

		boolean addChk = false;
		while (addChk == false) {

			System.out.println("메뉴에서 음료를 선택해주세요");
			int m = InputKeyBoard.inputInteger();
			
			if (m < 1 || m > Menu.menu.length) {
	            System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
	            continue;
	        }
			String printOrder = menu.menu[m-1];
	        int printPrice = menu.price[m-1];
					
			System.out.println("선택하신 음료는 " + printOrder + "입니다");
			System.out.println("금액은 " + printPrice + "원 입니다\n");

			System.out.println("몇 잔 구매하시겠습니까? 숫자를 입력해주세요");
			int c = InputKeyBoard.inputInteger();
			orderArray[m - 1] += c;

			System.out.printf("다른 메뉴를 추가하시겠습니까? \n [1] 예\t[2] 아니오\n");
			if (InputKeyBoard.inputInteger() == 2) {
				addChk = true;
			}

		}
		return orderArray;

	}

}
