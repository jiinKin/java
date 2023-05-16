package com.min.edu;

import java.util.Arrays;
import java.util.StringTokenizer;

//TODO 001 문자열 자르기
public class String_Cut {

	// substring(index n) : n 부터 끝까지를 잘라냄
	// substring(index n, index m) : n 부터  m-1까지 잘라님 
	public void fn_substr() {
		String str ="Happy New Year";
		int idx = str.indexOf("New");
		String newYear = str.substring(idx);
		System.out.println(newYear);
		int idxY = str.indexOf("Y");
		System.out.println(idxY);
		String ne = str.substring(idx, idxY-1);
		System.out.println(ne);

		String chk1 = "";
		String chk2 = null;
		//chk1이 값인가요? 네 맞습니다 하지만 String에서만 허용되는 객체. concatenation에 사용하는 초기값
		//                         아니요 왜냐면 문자열은 문자형이 조합되어 있어야함, 문자열 자르면 한개의 Unicode 값이어야 한다 
		//                                   chk1.chatAt(0); 자르면 예외가발생 ArrayIndexBounsException => index가 없다
		System.out.println(chk1.hashCode());
		System.out.println(System.identityHashCode(chk1));

		// null이란? stack에 변수는 존재하지만 heap영역에 객체가 없는 상태
		//              NullPointException

		//		String test = chk2.intern();
		//		System.out.println(chk2.hashCode());
		System.out.println(System.identityHashCode(chk2));
	}


	public void fn_split() {
		String str = "oop:and:foo";
		String txt = "oop.and.foo";
		String[] strArr = str.split(""); // 정규표현식에서 ""는 하나의 요소(Unicode)
		String[] txtArr = txt.split("[.]"); // .단어라고 하는 정규식 문법이기때문에 특수문자로 인식  escape문자하거나 정규식 범위[]의 값으로 사용하면 됩니다
		System.out.println(Arrays.toString(strArr));
		System.out.println(Arrays.toString(txtArr));

		// split는 정규식을 기반으로 기준
		// 기준이되는 값은 사라지고
		// 만약 잘라진 Array의 끝값이 ""라면 그 해당 배열은 값으로 존재하지 않는다
		String[] strArrO = str.split("o"); // [] [] [p:and:f] [] [] 
		System.out.println(strArrO.length);
		for (String s : strArrO) { // [] [] [p:and:foo]
			System.out.println(s);
		}
	}

	// java.util.StringTokenizer -> Enumeration
	// Iterator Design pattern : 가지고 있는 객체를 모두 확인 후 출력 하는 pattern
	// split 과의 차이점음 :  갯수를 예측 반환타입  String[]
	// 값을 예측하기 못함 -> Iterator  pattern을 통해서 출력

	public void fn_StringTokenizer() {
		//		String str = "abc/tdgf/hght";
		//		// token의 값이 없을 경우  \t\n\r\f 의 값을 기준으로 자름 
		//		StringTokenizer st = new StringTokenizer(str);
		//		
		//		while (st.hasMoreElements()) { // StringTokenizer  객체에 객체가 있는지 확인
		//			String n =  (String)st.nextElement();
		//			System.out.println(n);
		//		}
		//		
		//		while (st.hasMoreTokens()) { // StringTokenizer  객체에 객체가 있는지 확인
		//			String n =  st.nextToken();
		//			System.out.println(n);
		//		}
		//		
		//		// split과 다르게 값이 아닌 것은 객체로 만들지 않는다
		//	 String str1 = "oop:and:foo";
		//	 StringTokenizer st1 = new StringTokenizer(str1, "o");
		//	 while (st1.hasMoreTokens()) {
		//		System.out.println(st1.nextToken());
		//	}
		//	 
		//	 System.out.println("---------------------------");
		//	 
		String str2 = "\u3000 \u3000.and.f";
		//	 String ss = "\u3000";
		//	 System.out.println(ss);

		StringTokenizer st2 = new StringTokenizer(str2,"\u3000");
		while (st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		}

	}



}





