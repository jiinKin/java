package com.min.edu.ver2;

import java.util.Scanner;

public class Test_Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		NumberOfCoffee noc = new NumberOfCoffee();
		NumberOfCoffee noc2 = new NumberOfCoffee();
		String[] menu = {"아메리카노","카페라떼","카푸치노","바닐라라떼","아이스티", "구디커피(10잔 한정판매)"};
		String[] addOption = {"샷추가 (+500원)","연하게","필요없음"};
		int[] price = {1000,2000,3000,4000,5000, 6000};
		
		
		// 메뉴판 출력
		int menuNum = 0;
		System.out.println("♡♡♡메뉴판♡♡♡");
		for (int i = 0; i < menu.length; i++) {
			System.out.println("♥"+(i+1)+"♥ "+menu[i] +"\t"+ price[i]+"원");
		}
		System.out.println("\n주문하실 메뉴의 번호를 선택해주세요");
		System.out.println("남은 구디커피 [" + GoodeeCoffee.getGC() + "]잔");
		System.out.println("*정수값을 입력해주세요*");
		System.out.println("===============================");
		
		// 입력 내용 전달
		while(true) {
			menuNum = scan.nextInt();
			if(menuNum>0 && menuNum <= menu.length) {
				noc.setCoffeeMenuPrice(menu[menuNum-1], price[menuNum-1]);
				break;
			}
			System.out.println("잘못입력하셨습니다! 메뉴를 다시 선택해주세요");
		}
		System.out.println("선택하신 메뉴는 ["+ noc.getCoffeeMenu() + "] 입니다.\n");
		// 추가옵션 메뉴 출력
		System.out.println("추가 옵션의 번호를 선택해주세요");
		for (int i = 0; i < addOption.length; i++) {
			System.out.println("♥"+(i+1)+"♥ "+ addOption[i]);
		}
		System.out.println("===============================");
		
		// 입력 내용 전달
		int optionNum = 0;
		while(true) {
			optionNum = scan.nextInt();
			if(optionNum>0 && optionNum <= addOption.length) {
				noc.setOption(addOption[optionNum-1]);
				break;
			}
			System.out.println("잘못입력하셨습니다! 추가옵션을 다시 선택해주세요");
		}
		System.out.println("선택하신 추가옵션은 "+ noc.getOption() + " 입니다.");
		System.out.println("===============================");
		
		// 커피 수 입력
		System.out.println("주문하실 커피의 수량을 입력해주세요");
		int cupNum = 0;
		while(true) {
			cupNum = scan.nextInt();
			if(menu[menuNum-1]=="구디커피(10잔 한정판매)") {
				if(GoodeeCoffee.getGC() < cupNum) {
					System.out.println("구디커피는 [" + GoodeeCoffee.getGC() + "]잔 남았습니다.\n다시 입력해주세요");
					continue;
				}
				noc.setCup(cupNum);
				GoodeeCoffee.setGC(cupNum);
				break;
			}
			if(cupNum>0) {
				noc.setCup(cupNum);
				break;
			}
			System.out.println("잘못입력하셨습니다! 커피의 수량을 다시 입력해주세요");
		}
		System.out.println("주문하신 커피의 수량은 : [" + noc.getCup() + "]잔입니다.");
		
		// 결제시작
		if (noc.getTotalPrice() >= 10000) {
			System.out.println("10000원 이상 주문시 총 금액의 10% 할인된 가격을 결제됩니다.");
		}
		System.out.println("총 결제금액 : [" + noc.getTotalPrice() + "] 입니다.");
		System.out.println("===============================");
		
		System.out.println("금액을 입력해주세요.");
		int pay=0;
		while(true) {
			pay = scan.nextInt();
			if(pay >= noc.getTotalPrice()) {
				noc.setPrice(pay);
				break;
			}
			System.out.println("금액이 부족합니다. 다시 입력해주세요");
		}
		noc.Calculation(pay);
		noc.Receipt();
		//-----------------------------------------------------------------------
		int menuNum1 = 0;
		System.out.println("♡♡♡메뉴판♡♡♡");
		for (int i = 0; i < menu.length; i++) {
			System.out.println("♥"+(i+1)+"♥ "+menu[i] +"\t"+ price[i]+"원");
		}
		System.out.println("\n주문하실 메뉴의 번호를 선택해주세요");
		System.out.println("남은 구디커피 [" + GoodeeCoffee.getGC() + "]잔");
		System.out.println("*정수값을 입력해주세요*");
		System.out.println("===============================");
		
		// 입력 내용 전달
		while(true) {
			menuNum1 = scan.nextInt();
			if(menuNum1>0 && menuNum1 <= menu.length) {
				noc2.setCoffeeMenuPrice(menu[menuNum1-1], price[menuNum1-1]);
				break;
			}
			System.out.println("잘못입력하셨습니다! 메뉴를 다시 선택해주세요");
		}
		
		// 추가옵션 메뉴 출력
		System.out.println("추가 옵션의 번호를 선택해주세요");
		for (int i = 0; i < addOption.length; i++) {
			System.out.println("♥"+(i+1)+"♥ "+ addOption[i]);
		}
		System.out.println("===============================");
		
		// 입력 내용 전달
		int optionNum1 = 0;
		while(true) {
			optionNum1 = scan.nextInt();
			if(optionNum1>0 && optionNum1 <= addOption.length) {
				noc2.setOption(addOption[optionNum1-1]);
				break;
			}
			System.out.println("잘못입력하셨습니다! 추가옵션을 다시 선택해주세요");
		}
		System.out.println("선택하신 추가옵션은 "+ noc2.getOption() + " 입니다.");
		System.out.println("===============================");
		
		// 커피 수 입력
		System.out.println("주문하실 커피의 수량을 입력해주세요");
		int cupNum1 = 0;
		while(true) {
			cupNum1 = scan.nextInt();
			if(menu[menuNum1-1]=="구디커피(10잔 한정판매)") {
				if(GoodeeCoffee.getGC() < cupNum1) {
					System.out.println("구디커피는 [" + GoodeeCoffee.getGC() + "]잔 남았습니다.\n다시 입력해주세요");
					continue;
				}
				noc2.setCup(cupNum1);
				GoodeeCoffee.setGC(cupNum1);
				break;
			}
			if(cupNum1>0) {
				noc2.setCup(cupNum1);
				break;
			}
			System.out.println("잘못입력하셨습니다! 커피의 수량을 다시 입력해주세요");
		}
		System.out.println("주문하신 커피의 수량은 : [" + noc2.getCup() + "]잔입니다.");
		
		// 결제시작
		if (noc2.getTotalPrice() >= 10000) {
			System.out.println("10000원 이상 주문시 총 금액의 10% 할인된 가격을 결제됩니다.");
		}
		System.out.println("총 결제금액 : [" + noc2.getTotalPrice() + "] 입니다.");
		System.out.println("===============================");
		
		System.out.println("금액을 입력해주세요.");
		int pay1=0;
		while(true) {
			pay1 = scan.nextInt();
			if(pay1 >= noc2.getTotalPrice()) {
				noc2.setPrice(pay1);
				break;
			}
			System.out.println("금액이 부족합니다. 다시 입력해주세요");
		}
		noc2.Calculation(pay1);
		noc2.Receipt();
	}
}
