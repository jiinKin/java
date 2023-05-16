package com.min;

import com.min.edu.CreateObject;

public class StaticMain {

	public static void main(String[] args) {
		//TODO TEST003 객체를 생성하면(생성자를 호출하면) 계속해서 새로운 객체가 생성된다
		CreateObject obj1 = new CreateObject();
		CreateObject obj2 = new CreateObject();
		System.out.println(obj1.pNum);
		System.out.println(obj2.pNum);
		
		//TODO TEST004 static은 미리 메모리에 할당
		// static을 포함하고 있는 클래스는 new 하면 static도 새로 생성될까?
		// static application 실행(Run AS) 단 1회만 고정된 주소를 할당 받음 
		// static은 메모리에 미리 할당되기 때문에 주소가 고정 = 호출시 클래스명.멤버 호출하면 된다
		// 클래스명.멤버
		System.out.println(CreateObject.cnt);
		System.out.println(obj1.cnt);
		System.out.println(obj2.cnt);
	}
}










