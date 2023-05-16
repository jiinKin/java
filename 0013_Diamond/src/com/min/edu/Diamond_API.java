package com.min.edu;

public class Diamond_API {

	public void dia_math_api(int stage) {
		for (int i = 0; i < stage; i++) {
			System.out.print(Math.abs(i-stage/2));
			for (int j = 0; j < Math.abs(i-stage/2); j++) {
				System.out.print("○");
			}// 공백
			for (int j = 0; j < stage-2*Math.abs(i-stage/2); j++) {
				System.out.print("●");
			} // 그림
			System.out.println();
		}//층수
	}
}
