package com.lotto.game;

import java.util.Arrays;

public class LottoPrint {

	public static void main(String[] args) {
		System.out.println("한국로또 default로 호출");
		LottoBox lottoKorea = new LottoBox();
		System.out.println(Arrays.toString(lottoKorea.getLottoRow()));
		
		
		System.out.println("미국로또 arguements를 입력하는 생성자로 호출");
		LottoBox lottoUSA =  new LottoBox(12);
		System.out.println(Arrays.toString(lottoUSA.getLottoRow()));
	}

}
