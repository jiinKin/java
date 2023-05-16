package com.min.edu;

public class Exception_Step07 {

	public int calculation(int num) throws UserDefindException {
		int n = 0;
		if(num == 10) {
			throw new UserDefindException("10을 입력했습니다");
			
		}
		return n;
	}
	
}
