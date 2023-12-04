package day11.collection.list.vector;

import java.util.Iterator;
import java.util.Vector;

// List : 순서 o 중복 o
public class MainEntry {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		System.out.println("length / capacity");
		System.out.println( v.size() + "  /  " + v.capacity() ); // 0 , 10

		System.out.println(" ============================ ");
		Vector<Integer> v2 = new Vector<Integer>(3,4); // (초기용량, 증가용량);
		v2.add(20);
		v2.add(35);
		v2.add(12);
		v2.add(12);
		v2.add(80);
		System.out.println( v2.size() + "  /  " + v2.capacity() ); 

		System.out.println(" ============================ ");
		System.out.println(" ---- iterator() method---- ");
		Iterator it = v2.iterator(); //하나하나 꺼내
		while( it.hasNext() ) {
			System.out.print(it.next() + "\t");
		}
		
		System.out.println(" ---- get() method---- ");
		for( int i = 0; i < v2.size(); i ++ ) {
			System.out.print( v2.get(i) + "\t");
		}
		
		System.out.println(" ---- elementsAt() method---- ");
		for( int i = 0; i < v2.size(); i ++ ) { //Vector에 있는 모든 요소에 대해 반복
			Integer num = v2.elementAt(i);
			System.out.print( num + "\t"); // num.toString() .. toString()문자형태로 바꿔줌
		}
		
		System.out.println("\n\n" + v2.size() + "  /  " + v2.capacity()  );	
		v2.trimToSize(); // capacity 조정하기
		System.out.println("\n\n" + v2.size() + "  /  " + v2.capacity()  );	
		
		

	}
}
