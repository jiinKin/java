package com.min.edu.set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class List_Feature {

	public void list_Check() {
		List<Integer> lists = new ArrayList<Integer>();
		int n1=20, n2=30, n3=40; // 기본타입 ** Wrapper Class : 해당기본타입과 쌍으로되어 있는 참조타입
		
//		Integer i = new Integer(10);  //1.8에서는 Warapper, 1.9 부터는 자동을 변환 => Auto-Boxing, Auto-inBoxing
//		int n = i.intValue();
		
		lists.add(n1); //0
		lists.add(n2); //1
		lists.add(n3); //2
		lists.add(n3); //3
		
		System.out.println(lists.get(0)); // index로만 출력가능하다
		System.out.println(lists);
		
		n3 =100;
		System.out.println(lists);
		
		int n4 = 30; //  기본타입
		Integer n5 = n4; // 참조타입
		
		//remove
//		System.out.println(lists.remove(n4));
		System.out.println(lists.remove(n5));
		System.out.println(lists);
		
	} // Check
	
	public void list_iterator() {
		List<String> lists = new ArrayList<String>();
		lists.add("A");
		lists.add("B");
		lists.add("C");
		lists.add("G");
		
		for (int i = 0; i < lists.size(); i++) {
			System.out.println(lists.get(i)); // remove 및 get index
		}
		
		for (String s : lists) { // 제네릭:  Object 
			System.out.println(s); // 출력
		}
		for (Object s : lists) {  
			System.out.println(s); // s -> Object toString()을 하면 자동출력
			String ss= (String)s; // Obect는 down-casting을 잘 하자
		}
		Iterator<String> iter = lists.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	} // iterator
	
	public void list_contain() {
		List<Integer> lists = new ArrayList<Integer>();
		lists.add(10);
		lists.add(100);
		lists.add(1000);
		
		boolean isc = lists.contains(100);
		System.out.println(isc);
		
		Integer find = 1000;
		boolean iscF = lists.contains(find);
		System.out.println(iscF);
		
		lists.clear();
		System.out.println(lists.size());
		
		List<String> listsString = new ArrayList<String>();
		listsString.add("A");
		listsString.add("B");
		listsString.add("C");
		listsString.add("G");
		
		System.out.println(listsString.indexOf("B"));
		
		
		//Array로 변경
		String[] strs = {"JAVA","HTML","Databae"};
		List<String> strsList = Arrays.asList(strs);
		ArrayList<String> strArrayList = new ArrayList<String>(Arrays.asList(strs));
		System.out.println(strsList);
		System.out.println(strsList.getClass());
		System.out.println(strArrayList.getClass());
		
		
	}
	
	
	
	
	
}
