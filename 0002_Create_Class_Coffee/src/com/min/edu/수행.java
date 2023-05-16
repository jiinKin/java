package com.min.edu;

//TODO 003 커피숍에 커피를 주문하는 메인 클래스
public class 수행 {

	/**
	 * 커피 Application의 시작과 끝 메인메소드
	 * @param args
	 */
	public static void main(String[] args) {
		커피주문서 client = new 커피주문서();
		client.커피종류 = "아아";
		client.컵수 = 23;
		System.out.println(client);
		
		금천구커피숍 coffee = new 금천구커피숍();
		String result = coffee.주문받는사장님(client);
		System.out.println(result);
		
	}

}
