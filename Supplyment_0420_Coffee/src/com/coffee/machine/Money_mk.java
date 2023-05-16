package com.coffee.machine;
/**
 * <b>mk</b>가 만든 커피 주문 클래스
 * @author GDJ
 * @since 2023.04.21
 */
public class Money_mk {

	/**
	 * 외부에서 입력받은 입력금액으로 1000원짜리 커피의 잔수와 잔돈을 계산하는 메소드
	 * @param money 입력받는 금액 int
	 * @return VO객체로 반환되며 VO객체는 잔돈과 잔수를 가지고 있음
	 */
	public CoffeeVo coffeOrder(int money) {
		int cup = money /1000;
		int m = money%1000;
		CoffeeVo vo = new CoffeeVo(m, cup);
		return vo;
	}
	
}
