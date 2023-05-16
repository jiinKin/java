package com.min.edu;

public class Calendar_Main {

	public static void main(String[] args) {
		Calendar_Method calM = new Calendar_Method();
//		int yearSum = 0;
//		for (int i = 1; i <= 2024; i++) {
//			if(calM.isCheckYear(i)) {
//				yearSum++;
//			}
//		}
//		System.out.println(yearSum);
		
		
//		int maxDays = 0;
//		int year = 2024;
//		for (int i = 1; i <= 12; i++) {
//			maxDays += calM.getDayOfMonth(year, i);
//		}
//		System.out.println(maxDays);
		
		//TODO 문제1)2024 년 3월 1일 요일구하기
//		System.out.println(calM.isCheckYear(2024)); // 윤년
//		int a1 = 0;
//		int a2 = 0;
//		for (int i = 1; i < 2024; i++) {
//			if(calM.isCheckYear(i)) {
//				a1++;
//			}else {
//				a2++;
//			}
//		} // for
//		int sumYear = (a1*366 + a2*365);
//		System.out.println("2023까지 총 일수 : " + sumYear);
//		
//		int totalDate = sumYear +(31+29)+1;
//		System.out.println("2024년 3월 1일 까지 총 일수 : "+ totalDate);
//		System.out.println("2024년 3월 1일 요일 :" + (totalDate%7));
		
//		int totalDays =  calM.calDays(2024, 3, 1);
//		switch (totalDays%7) {
//			case 0: System.out.println("일") ;break;
//			case 1: System.out.println("월") ;break;
//			case 2: System.out.println("화") ;break;
//			case 3: System.out.println("수") ;break;
//			case 4: System.out.println("목") ;break;
//			case 5: System.out.println("금") ;break;
//			case 6: System.out.println("토") ;break;
//		}
//		System.out.println("해당 년도의 요일 "+(totalDays%7));
		
		Calendar_API api = new Calendar_API();
		for (int i = 1; i <=12 ; i++) {
//			calM.print_Calendar(2023, i);
			api.print_Calendar(2023, i);
			System.out.println("\n\n");
		}
		
		
		
		
		
	}

}






