package com.min.edu;

public class Child extends Parent{

	// 멤버필드 
	public int num;
	private int age;
	
	public Child() {// TODO 02
//		super();
		this(2);// TODO 03
		System.out.println("자식의 생성자");// TODO 14
	}
	
	public Child(int num) { // 생성자 오버로딩
		super(); // TODO 04
		this.num = num;// TODO 09
		
		System.out.println(age);// TODO 10
		System.out.println("num출력 우선순위 local variable" +  num);// TODO 11
		System.out.println("자신의 멤버 :"+ this.num);// TODO 12
		System.out.println("부모의 멤버 :" + super.num);// TODO 13
		
	}

	@Override
	public void print() {
		System.out.println("자식의 print 메소드");
	}
	
	public void callParentPrint() {
		super.print();
	}

	// 오버라이드의 표시가 없어도 부모가 
	// 같은 접근제한자, 반환타입,메소드명,아규먼트를 구현했다면
	// 자식이 오버라이드 했다고 판단한다
	// 메소드만 오버라이드 가 됩니다
	public int getNum() {
		return num;
	}
	
	public void print(int n) {
		System.out.println("부모가 가지고 있는 메소드명과 같은 메소드");
	}
	
}//class






