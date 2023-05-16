package com.min.edu;
/**
 * 메뉴판을 출력하는 클래스
 * @author HA, KH
 *
 */
public class Menu {

	static String[] menu = { "에스프레소", "아메리카노", "카페라떼", "카페모카", "카푸치노" };
	static int[] price = { 1500, 1500, 2500, 2500, 3000 };

	public void printMenu() {
		System.out.println("안녕하세요, CoffeeManager 입니다 :D\n");

		for (int i = 0; i < menu.length; i++) {
			int index = i + 1;
			System.out.println("[" + index + "번메뉴] " + menu[i] + "   [금액]  " + price[i] + "원");
		}
		System.out.println();
		System.out.println("*30,000원 이상 단체 주문시 10% 할인행사 중입니다!*");
	}

}
