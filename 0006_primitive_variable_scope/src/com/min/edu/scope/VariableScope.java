package com.min.edu.scope;

//TODO 008 변수의 사용 범위
public class VariableScope {

	//---------멤버필드영역つ ◕_◕ ༽つ
	int age;
	public boolean isc;
	public String name;
	private int cnt=9;
	public static int num;
	//-------つ ◕_◕ ༽つ
	
	//---------멤버메소드영역-----------------------
	public void cal() {
		int a;
		int cnt = 10;
//		int cnt = 99;
		System.out.println(cnt);
		System.out.println(this.cnt);
	}
	public int getCnt() {
		return cnt;
	}
	
	//-------------------------------
}






