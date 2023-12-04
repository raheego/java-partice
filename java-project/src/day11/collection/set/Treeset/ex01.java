package day11.collection.set.Treeset;

import java.util.Set;
import java.util.TreeSet;

//TreeSet : 자동정렬

public class ex01 {
	public static void main(String[] args) {
		
		Set set = new TreeSet(); // TreeSet<Type> 비어있는 그릇을 만들고 for문으로 담았다.
		
		for (int i = 0; set.size() < 6; i++) {
			int num = (int)(Math.random()*45) + 1; // 0 ~ n-1까지니 +1
			
			set.add(num);
		}
		
		System.out.println(set);
	}
}
