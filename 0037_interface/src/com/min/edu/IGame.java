package com.min.edu;

// 게임의 구현해야할 주 기능을 선언하는  interface
//TODO 001 같은 타입의 interface  extends 를 통해서 여러개 확장이 가능하다
public interface IGame extends IGame_Conf, IGame_Bin{

	int AGE = 100;
	// implements는 강제로 다른 자식클래스의 구현체, private, protected는 접근제한자는 사용하지 못한다
//	private int num = 200; 
//	protected String addr ="";
	
	// interface는 추상메소드의 집합체이다
	public String makeA(); //메소드의 선언 , { code block 구현 }
	String makeB();
	
	// java8 에서
   // 인터페이스에서 기본 메소드를 정의하는 기능이 추가되었다(공통메소드)
   // 이러한 메소드는 기본 키워드(default)를 사용하여 지정되어 인터페이스 내부에 구현을 포함할 수 있다
   // 구현 클래스에 의해서 재정의되지 않는 한 기본메소드가 사용됩니다.
   // Why? 이것은(default  method)는 인터페이스를 사용할때 기존의 클래스를 손상시키지 않고 인터페이스에 메소드를 추가 하기 위해서
	default void print(String a) {
		System.out.println("interface 메소드");
	}
	
	// java 8
	// static 메소드
	// 일반 클래스의 static 메소드와 유사하게 작동하고
	// 인터페이스에 속하여 인터페이스 컨텍스트(context-인터페이스의 이름)를 통해서면 호출 할 수 있다
	static int sum(int n) {
		return n +10;
	}
	
	// 연산의 기능은 복잡도가 높은 경우  메소드를 분리하여 코드를 작성
	//java9   에서
	// static 메소드를 위한 연산을 비공개로 처리해주는 분리코드를 작성 할 수 있다
	// 코드의 중복 제거 할 수 있습니다
	
	private static String getString() {
		return "string";
	}
	
	default void printString() {
		System.out.println(getString());
	}
	
	// 숨기를 Class를 작성 할 수 있다
	// innerClass를 생성할 수 있다
	class HelperClass {
		public void helperMethod() {
			System.out.println("interface에 선언한 inner 클래스");
		}
	}
	
	
}





