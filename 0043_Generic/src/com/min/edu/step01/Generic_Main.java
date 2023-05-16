package com.min.edu.step01;

public class Generic_Main {

	public static void main(String[] args) {
		//TODO 002 MyBox  사용
		// 기존의 객체는 한개의 타입을 입력받고 담을 수 있다
		// 하지만 Generic으로 생성된 객체는 사용시 타입의 작성을 통해서 선언되기 때문에 제한이 없음
		
		MyBox<String> name = new MyBox<String>();
		MyBox<Integer> age = new MyBox<Integer>();
		name.box = "동그라미";
		age.box=10;
		System.out.printf("%s / %d \n" , name.box, age.box);
		
		// TODO 003 java7부터 비어 있는 타입의 선언이 가능하다
		MyBox<Integer> iBoxc = new MyBox<>();
		iBoxc.box =5;
		Integer i = iBoxc.box;
		System.out.println(i);
		
//		iBoxc.box ="Hello world"; // compile-error
//		String s = iBoxc.box; // // compile-error
	}

}





