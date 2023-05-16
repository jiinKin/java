package com.min.edu.ver2;

public class GoodeeCoffee {

	private static int GcCount=10;
	
	public static void setGC(int Count) {
		GcCount -= Count;
	}
	public static int getGC() {
		return GcCount;
	}
}
