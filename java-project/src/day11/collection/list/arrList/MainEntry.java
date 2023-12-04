package day11.collection.list.arrList;

import java.util.ArrayList;
import java.util.Collections;

public class MainEntry {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(5);
		list.add(4);
		list.add(0);
		list.add(2);
		list.add(1);
		list.add(3);
		
		ArrayList list2 = new ArrayList(list.subList(1, 4)); //sublist 앞 포함 뒤 미포함 1번부터 3번까지 (0부터시작)
//		list.add(200);
		print(list, list2);
		
		
		// sort 정렬 오름차순 기본
		list.sort(null);
		Collections.sort(list2);
		print(list,list2);
		
		
		System.out.println( list.containsAll(list2) ); // true - list에 list2에 해당하는 데이터가 있니? 포함되는지를 보는것
		System.out.println( list.contains(list2) ); // false  아예 모든 수가 일치하는지를 확인함
		
		// add는 뒤에서부터 추가해진다.
		list.add("8");
		list2.add("c");
		print(list,list2);
		
		
		// set 교체
		list.set(3, "김연아");
		print(list,list2);
		
	}

	private static void print(ArrayList list, ArrayList list2) {
		System.out.println("list : " + list);
		System.out.println("list : " + list2);
		System.out.println();
	}
	
}
