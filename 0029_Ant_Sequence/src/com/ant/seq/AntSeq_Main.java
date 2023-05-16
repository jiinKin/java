package com.ant.seq;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

import com.min.util.InputUtil;

public class AntSeq_Main {

	public static void main(String[] args) {
//		int stage = InputUtil.inputNum();
//		System.out.println("입력받은 값:"+stage);
		AntSeq_Process ant = new AntSeq_Process();
//		ant.process("1121");
		System.out.println("층수를 입력해주세요");
		int stage = InputUtil.inputNum();
		ant.ant_Iterator(stage);
		
		
	}
	
}




