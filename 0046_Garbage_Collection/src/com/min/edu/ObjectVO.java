package com.min.edu;

public class ObjectVO {

	public static int newObjectCont =0;
	
	public ObjectVO() {
		newObjectCont++;
	}
	
	/*
	 * 객체가 heap에서 삭제가 될 때 한번 호출되는 메소드 
	 */
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("안녕히가세요~~!!"+this.hashCode());
		super.finalize();
	}
}
