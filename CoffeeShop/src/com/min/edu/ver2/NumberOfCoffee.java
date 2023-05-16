package com.min.edu.ver2;

import com.min.edu.AddMenu;
import com.min.edu.Menu;

public class NumberOfCoffee {

	private int cup;
	private String coffeeMenu;
	private int price;
	private String option;
	private int totalPrice;
	private int pay;
	private int change;
	private int GOODIECOFFEE = 10;
	
	
	
	public void setCup(int cup) {
		this.cup = cup;
	}
	
	public void setCoffeeMenuPrice(String coffeeMenu, int price) {
		this.coffeeMenu = coffeeMenu;
		this.price = price;
	}
	
	public void setOption(String option) {
		this.option = option;
	}
	
	public void setPrice(int pay) {
		this.pay = pay;
	}
	
	public int getCup() {
		return cup;
	}
	
	public String getCoffeeMenu() {
		return coffeeMenu;
	}
	
	public int getPrice() {
		return price;
	}
	
	public String getOption() {
		return option;
	}
	
	
	public int getTotalPrice() {
		double result=0;
		result += price * cup;
		if(option == "샷추가 (+500원)") {
			result += cup*500;
		}
		if(result >= 10000) {
			result *= 0.9;
		}
		totalPrice = (int)result;
		return (int)result; 
	}
	
	public void Calculation(int pay) {
		change = pay - totalPrice;
		System.out.println("잔돈 : [" + change + "]원 입니다.");
	}
	
	public void Receipt() {
		System.out.println("주문하신 ["+ coffeeMenu + "] 나왔습니다.\n");
		System.out.println("============[영 수 증]============");
		System.out.println("  상품명      수량    금액");
		System.out.println("["+ coffeeMenu +"]     [" + cup + "]  ["+ totalPrice +"]\n");
		System.out.println("추가 옵션 \t\t[" + option + "]\n");
		System.out.println("결제 금액 \t\t"+ totalPrice + "원");
		System.out.println("받은 금액 \t\t"+ pay +"원");
		System.out.println("잔    돈 \t\t"+ change +"원");
		System.out.println("============[종   료]============\n\n\n");
	}
	
}
