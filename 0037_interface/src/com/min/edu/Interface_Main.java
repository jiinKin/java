package com.min.edu;

import com.min.edu.IGame.HelperClass;

public class Interface_Main {

	public static void main(String[] args) {
		System.out.println(IGame.AGE);
		System.out.println(IGame.VAL);
		System.out.println(IGame_Conf.VAL);
		
		GameImpl g = new GameImpl();
		// D로 표기되는 메소드는 interface에 있는 공통 메소드 이다
		g.print("11");
		
		IGame ig = g;
		IGame_Conf ic = g;
		IGame_Bin ib = g;
		
		System.out.println(ig.makeA());
//		System.out.println(ic.VAL);
		ib.print_Conf();
		
		//  기존에는 new를 통한 객체를 생성하여 객체명.메소드() 로 호출도 가능고
		//     static 호출 방법인 클래스명.메소드()도 가능했다
		//  이 방식은 혼란을 가져오기 때문에
		// interface의 static 메소드는 Interface명.메소드()로만 호출이 가능하도록 된다
		System.out.println(IGame.sum(11));
		
		// 외부의 연산을 처리해주는 것이 아닌 
		// interface  내부의 연산이 처리된 결과를 반환한다
		g.printString();
		
		HelperClass hc = new HelperClass();
		hc.helperMethod();
				
		
	}

}





