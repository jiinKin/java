package com.min.edu;

import java.util.Scanner;

public class OrderAcc {

	public void orderAcc() {
		
		boolean whileContinue = true;

		//do while 사용법체크
		
		while(whileContinue) {
			Order userorder = new Order();
			int menuNum =userorder.orderCoffee();
			System.out.println("주문하신 메뉴는 " +CoffeeM.menu[menuNum-1] + " 입니다. \n");

			int menuCups = userorder.orderCups(menuNum);
			System.out.println("잔수는 " + menuCups + "잔 입니다.");


			while(whileContinue) {
				System.out.println("계속 주문하시겠습니까?");
				System.out.println("1. 계속  2. 종료");
				Scanner scanInPut = new Scanner(System.in);
				int inPutNum = scanInPut.nextInt();
				if(inPutNum != 1 && inPutNum !=2) {
					System.out.println("1 또는 2를 입력해주세요.");
				}
				else if(inPutNum == 2) {
					whileContinue = false;
					break;
				}
				else{
					System.out.println("추가 주문을 진행해주세요.");
					break;
				}
			}


		}
	}

}
