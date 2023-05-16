package com.min.edu;

public class Bitwise_Operation {

	public void bitwise() {
		byte b = 5 & 4; // 101 & 100 // (4 and 
		b= 5 | 4; // 101 | 100 // (5 or
		b = 5 ^ 4; // 101 ^ 100 (1  xor
		b = 4<<1; //100 << 1 = 1000 (8
		b = 4>>1; //100 >> 1 = 10 (2
		b = 4 >>>1; // 100 >>>1 = 10 (2 zero-fill shift , 부호비트를 포함하여 이동
		b = ~4; // invert 00000100 11111011-5
	}
	
}
