package day11.collection.set.Treeset;

import java.util.TreeSet;

//TreeSet : 자동정렬

public class ex02 {
	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		String from = "a";
		String to = "d";
		
		
		set.add("abc");
		set.add("alien");
		set.add("boat");
		set.add("car");
		set.add("Car");
		set.add("dizzz");
		set.add("diZZZZ");
		set.add("elephoant");
		set.add("elevator");
		set.add("fan");
		set.add("flower");
		
		System.out.println(set);
		System.out.println("range search : from" + from + "to" + to);
		System.out.println("result : " + set.subSet(from, to)); // a, d subSet 앞에꺼 포함 뒤 불포함  a만 출력
		System.out.println("result : " + set.subSet(from, to  + "zz")); //글자가 같지만 대소문자 차이 경우 우선순위 높은 것이 먼저 출력됨 ex)대문자
	}
}
