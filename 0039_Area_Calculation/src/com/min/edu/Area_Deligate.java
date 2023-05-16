package com.min.edu;

public class Area_Deligate {

	public  void deligate(AreaImpl shape) {
		if(shape == null) {
			System.out.println("개발중....");
		}else {
			String className =shape.getClass().getName();
			System.out.println(className.substring(className.lastIndexOf(".")+1));
			shape.cal();
			shape.print();
		}
	}
}
