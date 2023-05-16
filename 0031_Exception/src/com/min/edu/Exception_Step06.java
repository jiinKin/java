package com.min.edu;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

// java7 이후에 tty with resource 문법이 추가 됨
// try() 리소스를 정의 하여 사용할 수 있다
// try()에 사용되는 리소스를 자동으로 닫아 준다

// 기존방식
// 1) try 처리될 연산 작성(리소스:열고닫음이 있는 객체) 
// 2) 연산에 문제가 발생되면 catch 로 처리 함
// 3) 리소스를 환원(close)를 해야 한다면 사용되는 block의 영역에 밖에 선언을 하여 
//     finally block을 통해서 닫아줘야함
public class Exception_Step06 {

	public int calculation()  { // throws 나를 사용하는 곳에서 예외처리를 위임 하겠다
		int n = 0;
		try(Scanner scan = new Scanner(System.in)){
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//Checked Exception
		// 클래스를 사용할때 반드시 예외처리를 통해서 코드를 작성해야 한다
		try (FileReader file1 = new FileReader("missing.txt")){
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		FileReader file2 = new FileReader("missing.txt");
//		FileReader file3 = new FileReader("missing.txt");
		
		try(FileReader file2 = new FileReader("missing.txt");
			FileReader file3 = new FileReader("missing.txt");) {
			
		} catch (Exception e) {
		}
		
		return n;
	}
	
}









