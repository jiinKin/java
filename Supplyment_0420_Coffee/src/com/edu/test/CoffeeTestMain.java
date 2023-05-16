package com.edu.test;


import com.coffee.machine.CoffeeVo;
import com.coffee.machine.Menu;
import com.coffee.machine.Money_mk;
import com.coffee.machine.Select;
import com.kokoa.util.InputKeyBoard;
/**
 * 추가 수업에 커피자판기 테스트를 위한 클래스
 * @author GDJ
 * @since 2023.04.21
 * @version 1.b
 */
public class CoffeeTestMain {

	/**
	 * 커피자판기의 메인소드
	 * @param args JVM에서 처음 입력 하는 initial value
	 */
	public static void main(String[] args) {
		Menu m= new Menu();
		m.printMenu();
		
		System.out.println();
		System.out.println();
		
//		Scanner scan = new Scanner(System.in);
		System.out.println("메뉴에서 음료를 선택해 주세요");
		int n = InputKeyBoard.intputInteger();
		
		Select s = new Select();
		String chioceMenu = s.selectMenu(n);
		System.out.println("선택하신 음료는:" + chioceMenu);
		
		System.out.println("금액을 입력해주세요");
		int money = InputKeyBoard.intputInteger();
//		Money cal = new Money();
//		cal.coffee_Cal(money);
//		System.out.println("커피 "+cal.getCup()+"잔이 나왔습니다");
//		System.out.println("잔돈은 "+ cal.getMoney()+"입니다");
		Money_mk mm = new Money_mk();
		CoffeeVo result = mm.coffeOrder(money);
		result.coffeePrint();
	}

}





