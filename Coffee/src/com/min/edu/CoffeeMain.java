package com.min.edu;



//메인 클래스
public class CoffeeMain {



	public static void main(String[] args) {

		Order a = new Order();
		int t = a.od();

		Money c = new Money();
		c.change(t);
	}

}   
