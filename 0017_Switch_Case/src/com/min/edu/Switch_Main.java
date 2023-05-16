package com.min.edu;

public class Switch_Main {

	public static void main(String[] args) {
		//1) switch~case 문은 선택 조건문이라고 한다
		//   if문과 다르게 선택된 한개의 값만을 실행됩니다
		//   비교대상이  정수이다
		// fall-through
		int x = 2;
		switch (x) {
		case 1:
			System.out.println("난 1이다"); /* break; */
		case 2:
			System.out.println("난 2이다"); /* break; */
		default:
				System.out.println("난 어떠한 숫자인지 모르겠다");
				/* break; */
		} // 1) wwitch
		
		
		//2) java7 1.7.0.5 버전부터 문자열 영역에 heap에 포함되면서 
		// switch case문의 비교 값을 사용이 가능
		String str = "맑음";
		switch (str) {
		case "맑음" :
				System.out.println("맑은 하늘이 좋다");
			break;

		default:
			System.out.println("날씨가 추워지네요");
			break;
		} //2)
		
		//3) java14 부터는 case에 값이 아닌 표현식( 값으로 편가되는 코드 비교 = ) 가 사용가능
		String result;
		switch (x) {
		case 1: 
				result = "하나";
			break;
		case 2: 
			result = "둘";
			break;
		case 3: 
			result = "셋";
			break;
		default:
			result ="많이";
		}//3)
		
		//4) 화살표 레이블을 폴스로우를 허용하지 않으므로  break 키워드가 사용되지 않음
		String result2;
		switch(x) {
			case 1 -> result2 ="one";
			case 2 ->result2="two";
			case 3 ->result2="three";
			default ->result2="many";
		} 
		
		String result3 = switch(x) {
		case 1 ->"one";
		case 2 ->"two";
		case 3 ->"three";
		default ->"many";
	} ; // <----- ; 꼭 작성해 주세요
	 //4)
	
	//5) 하나 이상의 표현식이 필요한 경우 전체 코드블럭이 포함 될 수 있습니다
	//    이러한 블럭에서 yield 문은 switch   표현식이 평가할 값을 지정하는데 사용됩니다
	
	String result4 = switch(x) {
	case 1 -> "one";
	case 2, 3->"two or three";
	default -> {
		if(x >4) {
			yield "four";
		}else {
			yield "many";
		}
	}
	};
		
	}

}






