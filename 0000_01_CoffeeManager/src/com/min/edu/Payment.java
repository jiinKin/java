package com.min.edu;


/*
 * 1) 지불할 금액이 30,000원이 넘으면 할인하는 기능
 * 2) 받은 돈이 부족하면 돈을 더 지불해달라는 메세지를 출력하는 기능
 * 3) 올바른 지불을 받으면 잔돈을 반환하는 기능
 * ㄴ>>> 을 하는 메소드들을 담은 클래스 
 */
public class Payment {

	public int totalPrice(int[] orderlist) {
		int totalP = 0;

		for (int i = 0; i < orderlist.length; i++) {
			totalP += Menu.price[i] * orderlist[i];
		}

		return totalP;
	}

	public int billing_Method(int[] orderlist) {
		int result = 0;
		int totalP = totalPrice(orderlist);

		for (int i = 0; i < orderlist.length; i++) {
			if (orderlist[i] > 0) {
				System.out.println(Menu.menu[i] + "\t" + orderlist[i] + "잔");
			}
		}
		System.out.println("주문하셨습니다\n");

		if (totalP >= 30000) {
			result = totalP / 10 * 9;
			System.out.println("총 금액은 할인되어 " + result + "원 입니다\n");
		} else {
			result = totalP;
			System.out.println("총 금액은 " + result + "원 입니다\n");

		}
		return result;
	}

	public void calculate(int totalP) {
		System.out.println("필요한 금액을 투입해주세요\n");
		int mAmount = InputKeyBoard.inputInteger();

		if (mAmount < totalP) {
			while (mAmount < totalP) {
				System.out.println("금액이" + (totalP - mAmount) + "원 모자랍니다\n 필요한 금액을 투입해주세요\n");
				mAmount += InputKeyBoard.inputInteger();
			}

		}

		System.out.println("주문이 완료되었습니다! 거스름돈은 " + (mAmount - totalP) + "원 입니다");
		System.out.println("Coffee Manager를 이용해주셔서 감사합니다. 좋은 하루 되세요~!");
	}

}
