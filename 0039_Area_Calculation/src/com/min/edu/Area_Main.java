package com.min.edu;

import java.io.Reader;
import java.sql.Connection;
import java.util.Scanner;

public class Area_Main {

	public static void main(String[] args) {
		//면적 계산 TEST
//		Triangle t = new Triangle(10, 10);
//		String className =t.getClass().getName();
//		System.out.println(className.substring(className.lastIndexOf(".")+1));
//		t.cal();
//		t.print();
//		
//		Circle c = new Circle(10, 10);
//		String classNameC =c.getClass().getName();
//		System.out.println(classNameC.substring(classNameC.lastIndexOf(".")+1));
//		c.cal();
//		c.print();
//		
//		Square s = new Square(10, 10);
//		String classNameS =s.getClass().getName();
//		System.out.println(classNameS.substring(classNameS.lastIndexOf(".")+1));
//		s.cal();
//		s.print();
		
		// Factory Design Pattern을 사용하지 않을경우
		// cal(), print(), 클래스명 출력등 반복되는 소스가 많아짐
		// 생성되는 클래스가 다르기 때문에 객체의 사용이 어려움, 
//		AreaImpl shape = ChoiceShape.choice();
//		System.out.println(shape);
		String flag =  "";
		do {
			AreaImpl shape = ChoiceShape.choice();
			Area_Deligate deli = new Area_Deligate();
			deli.deligate(shape);
			
			Scanner scan = new Scanner(System.in);
			System.out.println("다른 면적을 계산하시겠습니다? Yes or No");
			flag = scan.nextLine();
		} while (flag.trim().compareToIgnoreCase("YES") == 0);
		
	}

}





