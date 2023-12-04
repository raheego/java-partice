package day11.collection.set.Treeset;

import java.util.TreeSet;

//TreeSet : 자동정렬

public class MainEntry {
	public static void main(String[] args) {
		
		TreeSet set = new TreeSet(); // TreeSet<Type> 비어있는 그릇을 만들고 for문으로 담았다.
		int[] score = { 84,39,10,100,96,67};
		
		for (int i = 0; i < score.length; i++) {
			set.add(new Integer(score[i])); // set.add(score[i]);
		}
		System.out.println(set); //[10, 39, 67, 84, 96, 100]
		//자동정렬
		
		System.out.println("50미만 작은 값 : " + set.headSet(new Integer(50)));
		System.out.println("50이상 큰 값 : " + set.tailSet(new Integer(50)));
		System.out.println("최소값 : " + set.first());
		System.out.println("최댓값 : " + set.last());
	}
}
