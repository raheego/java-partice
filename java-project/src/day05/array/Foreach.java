package day05.array;

import java.util.Iterator;

public class Foreach {
	/* 
	 	for(자료형 변수명 : 컬렉션명 or 배열명 ) {
	 		반복구문
	 	}
	 */
	public static void main(String[] args) {
		int[] arr = { 1,2,3,4,5};
		
//		for (int i=0; i< arr.length; i++ ) {
//			System.out.println(arr[i]);
//		}
		
		//foreach
		for (int item : arr ) {
			System.out.println(item);
		}
		
		//foreach 를 이용하여 합 구하기
		int[] score = {67,25,98,58,95};
		int sum = 0;
		for ( int item : score ) {
			sum += item;
		}
		System.out.println(sum);
	}
}
