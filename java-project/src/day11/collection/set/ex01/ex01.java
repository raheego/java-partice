package day11.collection.set.ex01;

import java.util.HashSet;
import java.util.Iterator;

//set : 순서x, 중복허용x
public class ex01 {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>(); // new HashSet<>();
		hs.add("키보드");
		hs.add("컵");
		hs.add("마우스");
		hs.add("가습기");
		hs.add("키보드");
		
		System.out.println("요소 개수 : " + hs.size()); // 4개 중복허용 x

		Iterator it = hs.iterator(); // 데이터 꺼내오기
		
		while( it.hasNext() ) { // 다음 요소가 있다면
			System.out.println(it.next()); //컵 가습기 키보드 마우스 //키보드 하나 없음
		}
		
		
		HashSet<Integer> hs2 = new HashSet<>(); //프리미티브 타입?(원시데이터) 사용금지 int
		//<>안에는 래퍼(wrapper)클래스만 가능 (int의 래퍼클래스)
		
		
		hs2.add(200);
		hs2.add(3);
		hs2.add(436);
		hs2.add(14);
		
		System.out.println(" ============ ");
		for(Integer item : hs2 ) {
			System.out.println(item); // 순서없고 중복허용하지 않는 상태로 나옴
		}
		
		System.out.println(" ============ ");
		for(String item : hs ) {
			System.out.println(item); // 순서없고 중복허용하지 않는 상태로 나옴
		}
		
		System.out.println(" ============ ");
		for(Object item : hs ) { // object 모든 타입 꺼내기 
			System.out.println(item); 
		}
		
		System.out.println(" ============ ");
		it = hs2.iterator();
		while( it.hasNext() ) { // 다음요소가 있다면 true, 없다면 false
			System.out.println( it.next() ); //it.next()꺼내달라는 것, print 출력하기
 		}
		
 	}
}
