package com.min.lotto;

public class LottoTest_Main {

	public static void main(String[] args) {
		LottoOne one1 = new LottoOne();
		LottoOne one2 = new LottoOne();
		System.out.println(one1 +"/" + one1.hashCode());
		System.out.println(one2 +"/" + one2.hashCode());
		
		System.out.println("01".hashCode());
		System.out.println("02".hashCode());
		System.out.println("03".hashCode());
		
		LottoRow lotto = new LottoRow();
		lotto.lotto();
		LottoOne[] lists = lotto.getObj();
		for (LottoOne o : lists) {
			System.out.print(o+"\t");
		}
		
		System.out.println();
		
		
	}

}






