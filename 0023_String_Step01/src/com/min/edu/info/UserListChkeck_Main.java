package com.min.edu.info;

import java.util.Arrays;

public class UserListChkeck_Main {

	//TODO 003 hashcode 를 오버라이드 하여 String과 같은 역할의 객체를 우리도 만들어 봅시다 
	// 1) 기본 User_VO 객체를 출력해보자 => 패키지.클래스명@hashcode 16진수
	public static void main(String[] args) {
		User_VO user01 = new User_VO("KOKOA", 13, "아프리카");
		System.out.println(user01);
		User_VO user02 = new User_VO("BANANA", 13, "아프리카");
		User_VO user03 = new User_VO("TOMATO", 13, "아프리카");
		
		UserList lists = new UserList();
		lists.addUser(user01);
		lists.addUser(user02);
		lists.addUser(user03);
		lists.addUser(user03);
		User_VO[] user_List = lists.getLists();
		System.out.println(Arrays.toString(user_List));
		
		User_VO user04 = new User_VO("BANANA", 13, "아프리카");
		boolean chk = lists.listCheck(user04);
		System.out.println(chk?"같은값 있음":"입력가능");
				
	}

}


