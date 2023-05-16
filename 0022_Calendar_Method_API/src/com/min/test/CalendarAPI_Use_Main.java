package com.min.test;

import java.util.Calendar;
import java.util.GregorianCalendar;

//TODO 001 java.util.Calendar의 API 사용방법
public class CalendarAPI_Use_Main {

	public static void main(String[] args) {
		// Calendar_API.java의 
		//           dayOfWeek : 입력 년월일의 요일 
		//			 ☞ (년누적 + 월누적 + 일누적 + 1년1월1일요일 -	전달의 마지막요일 -1) %7		         
		//          dayOfMonth : 입력 년월의 최대일 수
		//			 ☞ 입력 년월의 최대일수(array로 값이 고정되어 있다), 윤년-> LEAP / 평년->PLAIN
		
		// java의 달력관련 클래스를 제공해 준다
		// java.util.Calendar 
		// 날짜 관련 클래스 : java.util.Date, java.sql.Date, java.util.Calendar
		// java.util.Date d = new Date(2024, 3, 3) // Deprecate 된 메소드이기 때문에 사용을 지양하세요
		
		Calendar cal = Calendar.getInstance();
		Calendar gCal = new GregorianCalendar();
		
		System.out.println("현재 년도 : "+ cal.get(Calendar.YEAR));
		System.out.println("현재 요일 :" + cal.get(Calendar.DAY_OF_WEEK)); // 일요일은 1로 시작
		
		gCal.set(2023, 4-1, 1); // 입력값 세팅, month는 Array로 되어 있기 때문에 입력시 -1을 해준 값을 입력해줘야 합니다 
		System.out.println("현재 년도 : "+ gCal.get(Calendar.YEAR));
		System.out.println("현재 요일 :" + gCal.get(Calendar.DAY_OF_WEEK)); // 일요일은 1로 시작
		System.out.println(gCal.toString());
		
		System.out.println("현재 월의 최대일 수 : "+ gCal.getActualMaximum(Calendar.DAY_OF_MONTH));
		
		
		
	}

}








