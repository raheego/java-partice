package day12.map.TreeMap;

import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

public class MainEntry {
	public static void main(String[] args) {
		TreeMap<String, Integer> tm = new TreeMap<String, Integer>();
		
		tm.put("zz", 1000);
		tm.put("bb", 1000);
		tm.put("aa", 1000);
		tm.put("cc", 1000);
	
		System.out.println( "value : " + tm.get("aa") );
		System.out.println(tm); // key값이 자동정렬된다.
		
		// treeset 생성
		TreeSet set = new TreeSet();
		
		// set type data 넣기
		for(int i = 0; i < 6; i ++ ) { // set.size() : 0
			set.add((int)(Math.random()* 50) + 1); 
		}
		
		//LinkedList
		List list = new LinkedList(set);
		
		System.out.println(set);
	}
}
