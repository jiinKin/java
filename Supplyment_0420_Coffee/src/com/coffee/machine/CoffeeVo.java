package com.coffee.machine;

/**
 * 주문의 결과를 담는 객체
 * @author GDJ
 * @since 2023.04.21
 */
public class CoffeeVo {

	/**
	 * 잔돈을 저장하는 멤버필드
	 */
	private int money;
	/**
	 * 계산된 커피의 잔수를 저장하는 멤버필드
	 */
	private int cup;
	
	/**
	 * 멤버필드를 입력 받는 오버로딩된 생성자 
	 * @param money 외부에서 입력받는 잔돈 int
	 * @param cup 외부에서 입력 받는 잔수 int
	 */
	public CoffeeVo(int money, int cup) {
		this.money = money;
		this.cup = cup;
	}
	/**
	 * 입력된 잔돈과 잔수를 출력해주는 메소드
	 */
	public void coffeePrint() {
		System.out.println("주문하신 커피 "+cup+"잔과 잔돈 "+money +"입니다");
	}
	
	
	
}
