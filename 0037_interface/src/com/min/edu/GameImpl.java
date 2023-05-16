package com.min.edu;

public class GameImpl implements IGame {

	@Override
	public void print_Conf() { // IGame_Conf
		System.out.println("일반 클래스가 구현했다 print_Conf");
	}

	@Override
	public String makeA() { // IGame
		System.out.println("일반 클래스가 구현했다 makeA");
		return null;
	}

	@Override
	public String makeB() {// IGame
		System.out.println("일반 클래스가 구현했다 makeB");
		return null;
	}

}
