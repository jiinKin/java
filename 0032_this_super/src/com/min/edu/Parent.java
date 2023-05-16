package com.min.edu;

// Child의 부모 클래스가 되도록 함
// 생성자를 오버라이드 하게 됨
// 메소드를 생성하게 됨 -> 자식이 오버라이드 할 수 있도록 함
// ?? 오버로딩을 같은 클래스가 아니라  부모가 가지고 있는 메소드명으로 생성
public class Parent {

	// 멤버필드
	public int num;
	
	//default 생성자, 클래스명과 반환 타입이 없으며, 외부에서  instance를 만들기 단 1회 호출 되는 메소드
	public Parent() { // TODO 05
//		print(); // 자신의 멤버를 호출 하기 위해서 부모가 메모리에 생성되어야 함 => super()
		super(); // 최상위 부모인  Object의 생성자 // TODO 06
		this.print();// TODO 07
		System.out.println("부모의 생성자");// TODO 08
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	
	
	//멤버메소드
	public void print() {
		System.out.println("부모의 print 메소드");
	}

	public int getNum() {
		return num;
	}

	
	
	
	
	
	
} // class





