package com.coffee.machine;

/**
 * 커피자판기에서 사용하는 메뉴들이 있는 클래스 <br>
 * 메뉴를 출력해주는 기능을 가짐
 * @author GDJ
 * @since 2023.04.21
 */
public class Menu {

	/**
	 * 첫번째 메뉴인 black coffee의 값을 고정을 가지고 있는 static 상수
	 */
	public static final String m1 = "black coffee";
	/**
	 * 두번째 메뉴인 americano의 값을 고정을 가지고 있는 static 상수
	 */
	public static final String m2 = "americano";
	
	/**
	 * Menu 클래스가 가지고 있는 멤버필들의 값을 출력해 주는 메소드
	 */
	public void printMenu() {
		System.out.println("(ˉ﹃ˉ) 주문 가능한 메뉴");
		System.out.println("[1번 메뉴]" + m1);
		System.out.println("[2번 메뉴]" + m2);
		System.out.println("-------끝--------"); 
	}
			
	
	
}
