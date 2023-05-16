package com.min.edu;

public class RetuenMain {

	public static void main(String[] args) {
		int re =ReturnMethodClass.cal(5, 2);
		System.out.println(re);
		
		ReturnMethodClass mc = new ReturnMethodClass();
		mc.add(2, 5);
	}

}
