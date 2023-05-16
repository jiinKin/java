package com.min.edu;

import java.awt.Menu;
import java.util.Scanner;

//TODO 002 사용자에게 메뉴와 잔수를 입력받는 메소드 만들기
//TODO 003 결제금액 입력 받기
public class Order {
	
	public static int[] orderSum = new int[3];
	
	
	public int orderCoffee(){
	
	int userCoffee = 0;
	System.out.print("주문하실 커피를 골라주세요.");
	Scanner scanCoffee = new Scanner(System.in);
	userCoffee = scanCoffee.nextInt();
	

	return userCoffee;
	}
	
	public int orderCups(int menuName){
		CoffeeM coff = new CoffeeM();
		int userCups = 0;
		System.out.print("몇 잔 주문하시겠습니까?");
		Scanner scanCups = new Scanner(System.in);
		userCups = scanCups.nextInt();
		
		if(menuName == 1) {
			orderSum[menuName-1] += userCups;
			
		} else if (menuName == 2) {
			orderSum[menuName-1] += userCups;
			
			
		} else if(menuName == 3) {
			orderSum[menuName-1] += userCups;
			
			
		}else {
		System.out.println(" 없는 메뉴 입니다.");
		}
		return userCups;
	}

	public void totalMenu() {
		for(int i=0; i<CoffeeM.menu.length; i++){
			System.out.println("주문하신 총 메뉴는 " + CoffeeM.menu[i] + " " + orderSum[i] + "잔");
				}
	}
	public int orderCal() {
		int totalmoney = 0;
			for(int i = 0; i<CoffeeM.menu.length; i++) {
				totalmoney += (CoffeeM.price[i]*orderSum[i]);

			}
		
		return totalmoney;
	}
		

}
		


