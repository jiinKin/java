package com.min.edu;

import java.util.Calendar;

public class Calendar_API {

	public void print_Calendar(int year, int month) {
		System.out.printf("\t\t%d년도\t%d월\n",year,month);
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		Calendar cal = Calendar.getInstance();
		cal.set(year, month-1, 1);
		
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK)-1; // 1년 1월 1일이 원요일인걸  포함
		int dayOfMonth= cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		
		cal.set(year, month-1-1, 1); // 4월 -> [3] -> [3-1] // 4-2 ->[2]
		int beforeDayOfMonth = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		for (int i = beforeDayOfMonth - dayOfWeek +1; i <= beforeDayOfMonth; i++) {
			System.out.printf("% d\t",i);
		}
		
		for (int i = 1; i <= dayOfMonth; i++) {
			System.out.printf("%d\t",i);
			if((dayOfWeek+i)%7==0) {
				System.out.println();
			}
		}
		
		int afterDays = (7-(dayOfWeek+dayOfMonth)%7)%7;
		for (int i = 1; i <= afterDays; i++) {
			System.out.printf("%d\t",i);
		}
		
	} //print
}
