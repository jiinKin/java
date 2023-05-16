package com.min.edu;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 기능을 분리하여 부모의 타입으로 자식의 객체를 반환하는 <br>
 * factory design pattern  
 *
 */
public final class ChoiceShape {

	public static AreaImpl choice() {
		AreaImpl obj = null;
		
		while (true) {
			try {
				Scanner scan = new Scanner(System.in);
				System.out.println("선택해 주세요 1.삼각형 / 2. 원형 / 3.사각형");
				int ch = scan.nextInt(); 
				switch (ch) {
					case 1:	obj = new  Triangle(10, 10);	break;
					case 2:	obj = new Circle(10, 10);	break;
					case 3:	obj = new Square(10, 10);	break;
				}
				break;
			} catch (InputMismatchException e) {
				System.out.println("잘못된 타입으로 객체를 생성하셨습니다. " + e.toString());
//				e.printStackTrace();
			}
		}
		
		return obj;
	}
}





