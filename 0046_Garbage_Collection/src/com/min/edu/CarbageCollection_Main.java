package com.min.edu;

public class CarbageCollection_Main {

	public static void main(String[] args) throws InterruptedException {
		System.out.println( new ObjectVO().hashCode());
		System.out.println( new ObjectVO().hashCode());
		ObjectVO vo = new ObjectVO();
		System.out.println(vo.hashCode());
//		vo = null;
		new String("가");
		
		System.out.println("objectVo의 갯수1 :" +ObjectVO.newObjectCont);
		System.gc();
		Thread.sleep(3000);
		System.out.println("objectVo의 갯수2 :" +ObjectVO.newObjectCont);
		System.gc();
		System.out.println("메인실행완료" + vo.hashCode());
	}

}
