package com.min.edu;

// grave  표현식과 유사

/* 텍스트 블록 java 13에서 미리보기 기능을 도움 15부터는 표준
 * 
 * 텍스트 블록은 세개의 따음표를 사용한다 """
 * 여러줄은 구분하여 출력하거나 문자열로 만들기는 어려움
 * 따라서 텍스트 블록을 통해서 문자열 간소화된 방식으로 줄바꿈 표기를 만들 수 있다 
 * 
 * javascript를 통해서 HTML 구성하는 REST 화면을 만들때 사용 => SPA 
 */
public class TextBlock {
  
		public static void main(String[] args) {
			// 기존의 줄바꿈 방식은 반드시 Escape 문자를 사용해야 한다
			String str1 = "안녕하세요 \n"
					+ "반갑습니다 \n"
					+ "수요일 입니다 \n\r";
			System.out.println(str1);
			
			String str2 = """
					안녕하세요
					여러분
					흑기사 위성입니다
					""";
			 System.out.println(str2);
		}
}





