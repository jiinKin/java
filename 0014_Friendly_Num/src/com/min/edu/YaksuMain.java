package com.min.edu;

public class YaksuMain {

	public static void main(String[] args) {
		Yaksu y = new Yaksu();
//		boolean isc= 	y.siCheck(10, 3);
//		System.out.println(isc?"약수":"약수아님");
//		y.yaksu_Sum(122);
		
//		PerfectNum p = new PerfectNum();
//		p.perfectNum(2000);
//		boolean isc = p.isCheck(10,3);
//		System.out.println(isc);
//		int sum = p.yaksuSum(6);
//		System.out.println(sum);
		
		FriendlyNum friend = new FriendlyNum();
		long start = System.currentTimeMillis();
		friend.firentdlyProcess(5000);
		long end = System.currentTimeMillis();
		System.out.println("최종적으로 걸린시간 :" +(end-start));
	}

}












