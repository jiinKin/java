package com.min.edu;

import java.util.Scanner;


/**
 * 메뉴 출력 메소드 - 판매중인 메뉴들을 출력하고 주문을 입력받는 메소드 / 
 * 메뉴판에 없는 번호를 선택하게 되면 잘못 입력했다는 문구가 출력됨  
 * @author SAMSUNG
 *
 */
public class Menu {

	public static String[] m = {"아메리카노","카페라떼","카푸치노","바닐라라떼","아이스티"};
	public static int n = 0;
	public static void menu() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("♡♡♡메뉴판♡♡♡");
		for (int i = 0; i < m.length; i++) {
			System.out.println("♥"+(i+1)+"♥ " + m[i] + " 2000원");
		}
		System.out.println();
		System.out.println("주문하실 메뉴의 번호를 선택해주세요");
		System.out.println("*정수값을 입력해주세요*");
		System.out.println("===============================");
		
		while(true) {
			
			n = sc.nextInt();
			
			if(n>0&&n<6) {
				Menu.selectMenu();
				System.out.println("선택하신 음료는 [" + selectMenu() + "]입니다");
				System.out.println("===============================");
				break;
			} else {
				System.out.println("잘못입력하셨습니다! 메뉴를 다시 선택해주세요");
			}
		}
	}
	
	
	public static String selectMenu() {
		
		return Menu.m[n-1];
	}
}
