package com.min.uuid;

import java.util.UUID;

public class UUID_Make_Main {

	public static void main(String[] args) {
		//렌덤 숫자 코드를 만들어 내는 객체
		// 중복되지 않는 이름을 만들어 낼때
		 UUID id = UUID.randomUUID();
		 System.out.println(id.toString());
		
		
	}

}



