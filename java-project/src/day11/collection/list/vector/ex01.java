package day11.collection.list.vector;

import java.util.Date;
import java.util.Enumeration;
import java.util.Vector;

// List : 순서 o 중복 o
public class ex01 {
	public static void main(String[] args) {
		int i;
		Date date = new Date();
		Vector v = new Vector(3,5); // 3크기 다 쓰면 5씩 증가해라
		
		v.addElement("자바");
		v.addElement(new Double(12.34));
		v.addElement(date);
		
		System.out.println("--- 3개 객체 추가 ----");
		System.out.println("size : " + v.size() + "capacity : "  + v.capacity() ); 
		
		for(i = 0; i < 10; i++) {
			v.addElement(new Integer(i)); // new Integer[0] 번일 때 주소값
		}
		
		System.out.println("\n\n--- 10개 객체 추가 ----");
		System.out.println("size : " + v.size() + " capacity : "  + v.capacity() ); 
	
		
		System.out.println("\n\n--- vector 내용 출력 ----");
		Enumeration enu = v.elements();
		
		while( enu.hasMoreElements() ) {
			System.out.print(enu.nextElement() + "\t");
		}
		
		System.out.println("\n\n--- 객체 내용 포함 확인 ----");
		if ( v.contains("자바") ) System.out.println("문자 있음");
		else  System.out.println("없음");
		System.out.println("12.34 객체 위치는? " + v.indexOf(new Double(12.34)));
		System.out.println("입력시간은 ? " + date );
		
		System.out.println( v.get(v.indexOf(date)) ); // 인덱스 번호 알아온 거에 대한 값 꺼내기
		
		
		System.out.println("\n\n--- date 객체 삭제 ----");
		v.removeElementAt(v.lastIndexOf(date)); // 날짜 삭제 
		System.out.println("size : " + v.size() + " capacity : "  + v.capacity() ); 
		
		
		
		System.out.println("\n\n--------------------");
		enu = v.elements();
		while ( enu.hasMoreElements() ) {
			System.out.print(enu.nextElement() + "\t");
		}
		
		System.out.println("\n\n-------removeElementAt-------------");
		for(i = 0; i < v.size(); i ++ ) {
			 v.removeElementAt(i);
		}
		System.out.println("size : " + v.size() + " capacity : "  + v.capacity() ); 
		
		System.out.println("\n\n-------남은 데이터 -----------");
		for(i = 0; i < v.size(); i ++ ) {
			System.out.print(v.get(i) + ", ");
		}
		
		System.out.println("\n\n---------해당 index 위치에 교체하기 ---------");
		v.setElementAt("java", 2); // index 0 부터니깐 3번째임
		enu = v.elements();
		while ( enu.hasMoreElements() ) {
			System.out.print(enu.nextElement() + "\t");
		}
 		
		System.out.println("\n\n---------모든 요소 지우기 ---------");
		v.removeAllElements();
		v.trimToSize();
		System.out.println("size : " + v.size() + " capacity : "  + v.capacity() ); 
		
	}
}
