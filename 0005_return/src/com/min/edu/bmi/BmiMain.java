package com.min.edu.bmi;

public class BmiMain {

	public static void main(String[] args) {
		BmiClass bmi = new BmiClass();
		int w = 70;
		double h = 1.7;
		double result =bmi.bmi_caculation(w, h);
		System.out.println(result);
	}

}
