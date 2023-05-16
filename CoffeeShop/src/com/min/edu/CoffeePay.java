package com.min.edu;

import java.util.Scanner;

/**
 * 커피의 수량을 입력받아 결제금액과 잔돈을 출력하는 클래스 / 
 * 10000원 이상 주문시 10%할인 적용 및 추가메뉴 샷추가 옵션 선택 시 500원 추가
 * @author SAMSUNG
 *
 */
public class CoffeePay {

	static int cup;

	public void coffeeMoney(int m) {

		Scanner scan = new Scanner(System.in);

		while(m<=0) {
			System.out.println("잘못 입력하셨습니다! 수량을 다시 입력해주세요");
			m=scan.nextInt();
		}

		System.out.println("===============================");
		System.out.println("주문하신 커피의 수량은 : ["+ m +"]잔 입니다");
		
		cup = m;
		double totalMoney =0;

		if(AddMenu.selectAddOption() == AddMenu.m[0]) {
			if(cup>=4) {
				totalMoney = cup*2500*0.9;
				System.out.println("10000원 이상 주문시 총 금액의 10%가 할인됩니다\n");
			} else {
				totalMoney = cup*2500;
			}
		} else {
			if(cup>=5) {
				totalMoney = cup*2000*0.9;
				System.out.println("10000원 이상 주문시 총 금액의 10%가 할인됩니다\n");
			} else {
				totalMoney = cup*2000;
			}
		}
		System.out.println("총 결제금액 : ["+ (int)totalMoney +"]원 입니다");
		System.out.println("===============================");
		System.out.println("금액을 입력해주세요");
	} 

	public void coffeePrint(int money) {
		double totalMoney;
		int change;

		if(AddMenu.selectAddOption() == AddMenu.m[0]) {
			
			if(cup>=4) {
				totalMoney = 2500*cup*0.9;
			} else {
				totalMoney = 2500*cup;
			}
			change = money - (int)totalMoney;
			
		} else {
			
			if(cup>=5) {
				totalMoney = 2000*cup*0.9;
			} else {
				totalMoney = 2000*cup;
			}
			change = money - (int)totalMoney;
			
		}
		
		if(totalMoney > money) {
			System.out.println("금액이 부족합니다. 결제가 취소되었습니다.");
			System.out.println("===============================");
			return;
		}

		System.out.println("잔돈 : ["+ change +"]원 입니다\n");
		System.out.println("주문하신 ["+ Menu.selectMenu()+"] 나왔습니다.\n");
		System.out.println("============[영 수 증]============");
		System.out.println("  상품명      수량    금액");
		System.out.println("["+Menu.selectMenu()+"]   ["+cup+"]   ["+(int)totalMoney+"]\n");
		System.out.println("추가 옵션 \t\t["+AddMenu.selectAddOption()+"]\n");
		System.out.println("받을 금액 \t\t"+(int)totalMoney+"원");
		System.out.println("받은 금액 \t\t"+money+"원");
		System.out.println("잔    돈 \t\t"+change+"원");
		System.out.println("============[종   료]============\n\n\n");
	}
}
