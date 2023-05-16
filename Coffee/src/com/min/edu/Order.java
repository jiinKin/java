package com.min.edu;

import java.util.Scanner;

//주문을 받는 클래스
public class Order {

	public static String co[]= {"","","","","","",""};
	public static String cc[]= {"","","","","","",""};


	public int od() {
		int total=0;
		int i =0;
		while(true) {
			Menu order = new Menu();
			order.menu();
			Select a = new Select();
			Scanner scan = new Scanner(System.in);

			int x = scan.nextInt();
			int y = scan.nextInt();
			int z = a.select(x,y);
			if (x==1) {
				co[i]="아이스 아메리카노";
			}
			else if(x==2) {
				co[i]="초코 라떼";   
			}
			else if(x==3) {
				co[i]="레몬에이드";   

			}
			else if(x==4) {
				co[i]="아이스티";   

			}
			String str = String.valueOf(y);  
			cc[i]=str;


			System.out.println("가격: "+z+"원");
			total+=z;
			System.out.println("추가로 주문하시겠습니까?");
			System.out.println("[1]예   [2]아니요");
			int eo = scan.nextInt();

			i++;
			if(eo==1) {
				continue;

			}
			else {
				break;
			}
		}
		System.out.println("주문내역:");
		for (int j = 0; j < cc.length; j++) {
			System.out.print(co[j]+""+cc[j]);

		}
		System.out.println("\n총 금액: "+total+"원");
		return total;
	}


}