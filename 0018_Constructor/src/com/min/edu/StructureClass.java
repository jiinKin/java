package com.min.edu;

//TODO 003 클래스의 구조와 실행 순서
public class StructureClass {

	//클래스의 구조
	
	//!) 멤버필드 : 접근제한자가 있고 메소드 밖에작성되어 있는 변수, 선언만 한다면 자동으로 default 값으로 초기화 
		private int age; // instance/class variable 
		public static String name; //  static variable
		
	//@) 생성자(Constructor) : 클래스명과 같고 반환타입이 없고, 객체를 생성한 단 1회 호출 된다
		public StructureClass() {
			System.out.println("Constructor");
		}
	//$) 멤버메소드 : 클래스의 기능을 정의 하는 곳
		public void make(int a) { // int: argument, a:parameter
			for (int i = 0; i < a; i++) { // i : local variable 
				
			}
		}
	//%)연산블럭 
		{
			System.out.println("Initialization Block");
		}
	//&) static 생성자 : static 초기화 하거나 값을 입력 할때 사용
		static {
			System.out.println("Static Block");
		}
	
	
}







