package day11.collection.set.ex01;

import java.util.HashSet;
import java.util.Set;

//set : 순서x, 중복허용x
public class MainEntry { 
	public static void main(String[] args) {
	
	
		Object[] objArr = { "1", new Integer(1), "2","3","4","4","4" };
							//자료형이 틀리면 다른 데이터로 인식함
	
		Set set = new HashSet();
		for (int i = 0; i < objArr.length; i++) {
			set.add(objArr[i]);
		}
		
		System.out.println(set);
		
 	}
}
