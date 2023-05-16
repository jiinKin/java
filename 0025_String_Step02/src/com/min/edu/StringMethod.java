package com.min.edu;

import java.util.Arrays;

public class StringMethod {
	//	public char charAt(int index)
	// 문자열은 문자형이 조합되어 있는 형태 이기 때문에 
	// index번호로 해당 문자열의 문자형값을 가져올 수 있다
	// index번호는 0부터 시작 
	// 이슈사항 : 만약 index의 길이보다 크게 입력한다면???
	public void fn_charAt() {
		String str = "Dream's come true";
		for (int i = 0; i < str.length(); i++) { 
			System.out.println(str.charAt(i) + ":" + i +"/" + (int)str.charAt(i));
			}
	}// fn_charAt
	
	public void exam_charAt() {
		// 아래와 같이 선언한 이유???
		//  ☞ concatenation을 발생시키기 위해서 사용
		// ""가 값일까요? 아닐까요??
		//  ☞  
		String str ="";
		String n = null;
		System.out.println(str + "d");
		char c = str.charAt(0);
	} // exam_charAt
	
//	public int compareTo(String anotherString)
//	public int compareToIgnoreCaseo(String anotherString)
	public void fn_compareToXXXXX() {
		String name1 = "sns";
		String name2 = "sNs";
		int  코드포인트의차이n과m = name1.compareTo(name2);
		System.out.println(코드포인트의차이n과m);
		int c = name1.compareToIgnoreCase(name2);
		System.out.println(c);
	}
	
	public void compareTo_User_Defined() {
		String name1 = "2j2";
		String name2 ="2J2";
		
		System.out.println((int)'2' +":2");
		System.out.println((int)'j' +":j");
		System.out.println((int)'J' +":J");
		
		int result = 0;
		for (int i = 0; i < name1.length(); i++) {
			if(name1.charAt(i) != name2.charAt(i)) {
				result = name1.charAt(i) - name2.charAt(i);
				break;
			}
		} //for
		System.out.println("결과 :" + result);
	}
	
	//public String concat(String str)
	//문자열을 조합해주는 메소드
	public void fn_concat() {
		String s = "★";
		String result = s.concat("Dream").concat("come").concat("true");
		System.out.println(result);
	}
	
	public void arrays_toString_User_Defined() {
		String[] strs = {"사과","바나나","토마토"};
		System.out.println(Arrays.toString(strs));
		
		String result =   String.format("%s,", "바나나");
		System.out.println(result);
		
		String result1 ="[";
		for (int i = 0; i < strs.length-1; i++) {
			result1 += String.format("%s, ", strs[i]);
		}
		result1 += strs[strs.length-1]+"]";
		
		System.out.println(result1);
	}
	
	//public boolean contains(CharSequence s)
	 public void fn_contains() {
		 String fruit = "청사과, 바나나, 오렌지";
		 boolean isc1 =fruit.contains("사과");
		 boolean isc2 = fruit.contains("청사과");
		 
		 System.out.println("사과 검색 : " +  isc1);
		 System.out.println("청사과 검색 : " +  isc2);
	 }
	 
	 //public boolean equals(Object anObject)
	 //public boolean equalsIgnoreCase(String anotherString)
	 //**String과 같이 hashcode가 객체 값으로 override되어 있는 객체만 사용이 가능
	 public void fn_equalsXXXX() {
		 String str1 = "jjj";
		 String str2 = "JJJ";
		 
		 boolean isc1 = str1.equals(str2); // 그냥
		 boolean isc2 = str1.equalsIgnoreCase(str2); // 대소문자 hashcode  오버라이드 비교
		 
		 System.out.println("equals : " + isc1);
		 System.out.println("equalsIgnoreCase : " + isc2);
		 
		 String txt = "가";
		 byte[] txtByte =   txt.getBytes();
		 System.out.println(Arrays.toString(txtByte));
	 }
	 
	 //public int hashCode()
	 // hashcode는  부모( Object) 가 생성해주는 고유 값이다
	 // 하지만 String 가지고있는 값에의해서(Unicode)에 의해서 새로운 hashcode 만든다
	 public void fn_hashCode() {
		 String str = "가";
		 String strNew = new String("가");
		 System.out.println(str.hashCode());		//자식이 오버라이드한 hashcode
		 System.out.println(strNew.hashCode()); //자식이 오버라이드한 hashcode
		 
		 System.out.println(str.intern().hashCode());  // 사용되는 문자열의 SP영역의 값 hashcode
		 System.out.println(strNew.intern().hashCode()); // 사용되는 문자열의 SP영역의 값 hashcode
		 
		 System.out.println(System.identityHashCode(str)); // SP에 생성되어 질때 오버라이드 전의 hashcode
		 System.out.println(System.identityHashCode(strNew)); // Heap생성되어 SP의 값을 연결하기 전의 hashcode
		 
	 } // hashcode

	 //public int indexOf(String str)
	 //public int lastIndexOf(String str)
	 public void fn_XXXXXindexOf(){
		String str = "ko coco ko" ;
		System.out.println(str.length()); // index 9 , length 10
		// ko의 위치
		int startSearch = str.indexOf("ko"); //ko
		int startSearchFrom = str.indexOf("ko", 3); // oco ko
		int endSearch = str.lastIndexOf("ko"); //          ko
		int endSearchFrom = str.lastIndexOf("ko", 3);// ko coc
		System.out.println(startSearch);
		System.out.println(startSearchFrom);
		System.out.println(endSearch);
		System.out.println(endSearchFrom);
		
	 } //fn_XXXXXindexOf
	 
	 //matches(String regex)
	 public void fn_mathches() {
		 String msg = "사과 청사과 오렌지";
		 boolean isc =  msg.contains("사과");
		 System.out.println(isc);
		 boolean isc2 =msg.matches("(.*)사과(.*)");
		 System.out.println(isc2);
		 
		 String input = "사과 청사과 오렌지";
		 String regex = "\\b사과\\b";

		 if (input.matches(".*" +"\\b사과\\b" + ".*")) {
		     System.out.println("사과가 포함되어 있습니다.");
		 } else {
		     System.out.println("사과가 포함되어 있지 않습니다.");
		 }
		 
		 String str = "Yes";
		 System.out.println(str.matches("[Yy]es"));
		 
		 String strNum = "aaa134";
		 System.out.println(strNum.matches("a*[0-3]*"));
	 }
	 

	 //replace(char oldChar, char newChar)
	 // replaceAll(String regex, String replacement)
	 public void fn_replace() {
		 String str = "pulsel"; //맥박
		 String strChange = "purse"; // 지갑
		 String change = str.replace("l", "r");
		 System.out.println(change);
	 }
	 
	 public void fn_replaceAll() {
		 String str = "!T%56&b";
		 String regex = "[^0-9a-zA-Z]";
		 String regex2 = "[^0-9]"; //숫자만 빼고
		 String result = str.replaceAll(regex2, "");
		 System.out.println(result);
	 }
	 //trim(); 앞뒤의 공백 white space Unicode 32
	 public void fn_trim() {
		 String str = "             ho  ho　　　　　　";
		 System.out.println(str.length());
		 String strTrim = str.trim();
		 System.out.println(strTrim.length());
		 System.out.println(strTrim);
	 }

	 // strip()
	 public void fn_strip() {
		 String str = "             ho  ho　　　　　　";
		 String strStrip = str.strip();
		 System.out.println(strStrip);
		 System.out.println(strStrip.length());
		 
		 for (int i = 0; i < 101; i++) {
			System.out.println((char)i +" : " + i);
		}
	 }
	 //toCharArray()
	public void fn_toCharArray() {
		char[] strChar = {'T','O','M','A','T','O'};
		String str = new String(strChar);
		System.out.println(str);
	 	char[] strConvert =  str.toCharArray();
	 	System.out.println(strConvert.length);
	 	System.out.println(Arrays.toString(strConvert));
	}
	 
	 // valueOf()
	public void fn_valueOf() {
		// 모든 타입(기본, 참조)을 보이는 그대로 문자열 변경
		// print(), toString()
		TextClass t = new TextClass();
		String info = t.toString();
		System.out.println("infor  출력"+info);
		System.out.println("t출력" + t);
		
		int i = 100;
		char a = 'a';
		String result1 = "" + i+ a;
		String result2 = String.valueOf(i)+a;
		
		String iStr = String.valueOf(i);
		String h = "100";
		System.out.println(iStr.hashCode());
		System.out.println(h.hashCode());
		System.out.println(System.identityHashCode(iStr));
		System.out.println(System.identityHashCode(h));
		System.out.println(iStr == h);
		System.out.println(iStr.equals(h));
	}
	
	 //endsWith()
	public void fn_endsWith() {
		String str = "exam@naver.com";
		System.out.println(str.endsWith("naver.com"));
		System.out.println(str.endsWith("google.com"));
	}
	
}





