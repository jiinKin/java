package com.min.edu;

import java.util.Scanner;

public class PayOrder {

	public void howMuch() {

		boolean trueMoney = true;
		Order oo = new Order();

		System.out.println("결제하실 금액을 입력해주세요.");


		while(trueMoney) {
			Scanner moneyInput = new Scanner(System.in);
			int money = moneyInput.nextInt();		
			if(money  < oo.orderCal()) {
				System.out.println("금액을 다시 입력해주세요.");
			}else {
				System.out.println("총 주 문 금 액 : " + oo.orderCal() + "원");
				System.out.println(" 입 력 금 액  : " + money + "원");
				System.out.println(" 잔      돈  : " + (money-oo.orderCal())+ " 원 입니다.");
				System.out.println("이용해주셔서 감사합니다.");
				System.out.println("안녕히가세요.");
				break;
			}
		}

	}
	

}

