package com.min.edu;

public class Exception_Step08 {

	// throw와 throws를 통해서 예외처리 메시지를 전달하여 원하는 메시지를 처리 할 수 있다
	// throws가 된 메소는 사용할때 반드시 호출곳에서 예외처리를 해줘야한다
	
	public void makeException() throws Throwable {
		throw new Exception("예외처리를 글자를 바꿔봅니다");
	}
	
	
}
