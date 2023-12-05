package day12.util.list;

import java.util.*;

public class ArrayListLinkedListTest {
	public static void main(String args[]) {
		
		ArrayList al = new ArrayList(1000000);
		LinkedList ll = new LinkedList();
		
		System.out.println("= 순차적으로 추가하기 =");
		System.out.println("ArrayList :" + add1(al));
		System.out.println("LinkedList :" + add1(ll)); // 빠름

		System.out.println();
		System.out.println("= 중간에 추가하기 =");
		System.out.println("ArrayList :" + add2(al));
		System.out.println("LinkedList :" + add2(ll));

		System.out.println();
		System.out.println("=중간에서 삭제하기=");
		System.out.println("ArrayList :" + remove2(al));
		System.out.println("LinkedList :" + remove2(ll));

		System.out.println();
		System.out.println("= 순차적으로 삭제하기 =");
		System.out.println("ArrayList :" + remove1(al));
		System.out.println("LinkedList :" + remove1(ll));
	}

	public static long add1(List list) {
		 //currentTimeMillis 현재 시간을 가져오는데 초기화 
		long start = System.currentTimeMillis();

		for (int i = 0; i < 100000; i++)
			list.add(i + ""); // 작업시간

		long end = System.currentTimeMillis();
		return end - start; // 작업에 걸린 시간
	}

	public static long add2(List list) {
		long start = System.currentTimeMillis();
		
		for (int i = 0; i < 1000; i++)
			list.add(500, "X"); // 500번 위치에 데이터 넣기 
		
		long end = System.currentTimeMillis();
		return end - start;
	}

	public static long remove1(List list) {
		long start = System.currentTimeMillis();
		
		//앞에서 삭제하면 앞쪽으로 밀려서 땡겨지니깐 
		// 뒤에서부터 지워감. 오히려 이 방법이 빠를수도 
		for (int i = list.size() - 1; i > 0; i--) 
			list.remove(i);
		
		long end = System.currentTimeMillis();
		return end - start;
	}

	public static long remove2(List list) {
		long start = System.currentTimeMillis();
		
		for (int i = 0; i < 1000; i++)
			list.remove(i);
		
		long end = System.currentTimeMillis();
		return end - start;
	}
}