package com.min.edu;

import java.util.Scanner;
/**
 * 메인 실행 메소드
 * 각 메소드들을 호출해 기능을 실행시킴
 * while문을 사용해 주문이 종료된 후에 재주문 할수있도록 설계
 * @author SAMSUNG
 *
 */
public class Test_Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			
		Menu.menu();
		AddMenu.addmenu();	
		
		CoffeePay cp = new CoffeePay();
		int cup = scan.nextInt();
		cp.coffeeMoney(cup);
		
		int money = scan.nextInt();
		cp.coffeePrint(money);
		
		}
	
		
	}
}
