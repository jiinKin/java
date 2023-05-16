package com.min.edu;

public class ThisSuperMain {

	public static void main(String[] args) {
		// 자식의 타입을 자식을 생성하기
		Child c = new Child(); // TODO 01
		
		// 부모.자식 멤버필드 이름이 같다 
		// 그렇게 c.num을 하면 누가 실행 될까?
		System.out.println(c.num);
		Parent p =c;
		System.out.println(p.num);
		p.print();
		c.callParentPrint();
		
		
		System.out.println(c.getNum());
		System.out.println(p.getNum());
		
	}

}
