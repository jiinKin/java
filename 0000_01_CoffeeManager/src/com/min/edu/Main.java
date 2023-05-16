package com.min.edu;

import java.util.Scanner;

/**
 * CoffeeManager의 각 메소드를 불러오는 메인 클래스
 * 
 * @author HA,KH
 */
public class Main {

	public static void main(String[] args) {
		Menu m = new Menu();
		m.printMenu();

		Order_Menu n = new Order_Menu();

		Payment p = new Payment();
		p.calculate(p.billing_Method(n.scanMenu()));
	}

}
