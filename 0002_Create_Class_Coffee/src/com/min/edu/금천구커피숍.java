package com.min.edu;

//TODO 002 커피 주문을 받고 출력을 해주는 클래스
/**
 * @author KOKOA
 * @since 2023-04-19
 * 커피주문서를 입력받아 커피를 출력해 주는 클래스
 */
public class 금천구커피숍 {

	public 금천구커피숍() {
		System.out.println("생성자 호출");
		
	}
	
	/**
	 * 사용자가 외부에서 객체를 생서하여 커피주문서를 입력하는 메소드
	 * @param order 사용자가 커피종류, 잔수를 가지고 있는 객체
	 * @return 같은 클래스의 private 메소드를 실행하여 받은 결과 물
	 */
	public String 주문받는사장님(커피주문서 order) {
		String result = 바리스타(order);
		return result;
	}
	/**
	 * private 외부에서 보이지 않는 Class에 속해 있는 메소드
	 * @param re 커피주문서 객체
	 * @return 연산된 결과
	 */
	private String 바리스타(커피주문서 re) {
		String n = re.커피종류;
		int m = re.컵수;
		return "주문하신 커피는 "+n +"잔수 "+m+" 주문하신 커피 나왔습니다";
	}
	
	
}
