package com.min.edu;

/**
 * TODO 001 Skip Return 문법
 * 1) 반환타입이 있다면 반드시 return 예약어를 사용하여 값을 반환해줘야한다
 * 2) return문은 끝 블록에 도달하기 전에 종료하기 위해서 반환타입은 void로 만들 return을 작성
 */
public class SkipReturn {
	// 입력받은 arguments의 값이 비어있다면("")있다면 출력을 하지 않고 메소드를 종료
	public void flagPrint(String msg) {
		
		if(msg != "") {
			System.out.println("전달받은 message 값 :" + msg);
		}
//		if(msg == "") {
//			
//		}else {
//			System.out.println("전달받은 message 값 :" + msg);
//		}
		
//		if(msg == "") {
//			return;
//		}
//		System.out.println("전달받은 message 값 :" + msg);
	}
	
}
