package com.min.edu;

import java.util.Scanner;

public class CoffeeMain {



	public static void main(String[] args) {

		CoffeeM printMenu = new CoffeeM();
		printMenu.Menu();
		System.out.println();

		OrderAcc oa = new OrderAcc();
		oa.orderAcc();

		Order to = new Order();
		to.totalMenu();

		System.out.println("-----------------------------------------");
		System.out.println("주문하신 음료의 총 금액은 " + to.orderCal() + "원 입니다.");

		PayOrder po = new PayOrder();
		po.howMuch();

	}
}


