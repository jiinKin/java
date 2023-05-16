package com.min.edu;

import java.util.Scanner;

/**
 * 추가옵션메뉴 메소드 - 메뉴를 선택한 후 추가옵션을 선택하는 메소드 
 * @author SAMSUNG
 *
 */
public class AddMenu {

	public static String[] m = {"샷추가 (+500원)","연하게","필요없음"};
	public static int n=0;
	public static void addmenu() {

		Scanner scan = new Scanner(System.in);
		System.out.println("추가 옵션의 번호를 선택해주세요");

		for (int i = 0; i < m.length; i++) {
			System.out.println("♥"+(i+1)+"♥ "+ m[i]);
			}
		System.out.println("===============================");
		
	
		while(true) {

			n = scan.nextInt();

			if(n>0&&n<4) {
				
				System.out.println("선택하신 추가옵션은 ["+ m[n-1] + "]입니다");
				System.out.println("===============================");
				System.out.println("주문하실 커피의 수량을 입력해주세요");
				break;
				} else {
				System.out.println("잘못 입력하셨습니다! 메뉴를 다시 선택해주세요");
				}
			}
		}
	public static String selectAddOption() {
		return AddMenu.m[n-1];
	}
}
