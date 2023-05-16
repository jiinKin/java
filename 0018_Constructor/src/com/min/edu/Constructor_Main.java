package com.min.edu;

public class Constructor_Main {

	public static void main(String[] args) {
		
		//TODO 00101 인스턴스 생성된 갯수를 확인해 보자
		new GeneralClass(); // 인스턴스화
		new GeneralClass(); // 인스턴스화
		GeneralClass g =
				new GeneralClass(); // 인스턴스화
		System.out.println("최종적으로 생성된 객체 갯수 : "+g.getCnt());
		
		//TODO 00301 클래스의 실행 및 메모리의 할당
		new StructureClass();
	}

}
