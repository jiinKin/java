package com.min.edu.instance;

public class InstacneOf_Operation_Main {

	/*
	 * 안전 예방책 instanceof 연산자를 사용하여 객체의 특정 클래스로 캐스팅 할 수 있는 지 
	 *     여부를 런타임 중에 테스트
	 * 이 연산자는 예외를 일으키지 않고 
	 *     왼쪽 객체를 오른쪽 유형(타입)으로 캐스팅 할 수 있는 경우 true를 반환      
	 */
	public static void main(String[] args) {
		Apple a = new Apple(); // 자식의 이름으로 생성
		Fruit f =a; // 자식을 타입을 부모의 타입으로 변경
		
		// a는 extends된 부모 Fruit에 속할 수 있다
		// f는 원래 생성된 타입인 Apple로만 타입 변경이 가능하다 => ClassCastException이 발생
		
		// *******  객체의 형변환은 타입의 Arguments가 부모 타입으로 넘어 오기 때문에
		//            ClassCastException이 발생할 확률이 높다
		//            확인방법은 instanceof 예약
		//            처리 try~ catch의 Exception으로 처리하는 방법 2가지가 있다
		
		if(f instanceof Apple) { // f 의 객체가 Apple 타입으로 변경이 가능한가요?
			Apple myApple = (Apple)f;
			System.out.println("f 객체는 사과가 될 수 있다" + myApple);
		}
		
		try {
			Apple myApple = (Apple)f;
			System.out.println("f 객체는 사과가 될 수 있다" + myApple);
		} catch (ClassCastException e) {
//			e.printStackTrace();
			System.out.println("f는 사과가 될 수 없다. " + e.getMessage());
		}
		
		if(f instanceof Apple myApple) { // 일반적으로 casting과 같이 연결하여 사용
			System.out.println("f 객체는 사과가 될 수 있다" + myApple);
		}
		
		if(!(f instanceof Vegetable)) {
			System.out.println("f는 채소는 될 수 없습니다");
		}
		
		
	}

}





