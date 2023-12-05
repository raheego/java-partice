package day12.map.hashmap;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// key , value 한쌍으로
// (Set + list) 혼합형태
//Key는 중복을 허용하지 않으며, Value(값)는 중복을 허용
public class ex01 {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("연아", new Integer(90));
		map.put("judy", 100);
		map.put("daiv", 80);
		map.put("lily", 20);
		// System.out.println(map);
		Set set = map.entrySet(); // System.out.println(set); // 배열로 꺼내짐
		Iterator it = set.iterator(); // System.out.println(it.next()); 반복문을 사용한게 아니라 1개만 꺼내짐
		// Set set = (Set)map.entrySet().iterator();

		while (it.hasNext()) {
			Map.Entry e = (Map.Entry) it.next(); // 형변환
			System.out.println("Name : " + e.getKey() + " , Score : " + e.getValue());
		}

		set = map.keySet();
		System.out.println("응시자 명단 : " + set);

		Collection values = map.values();
		it = values.iterator();

		int total = 0;
		while (it.hasNext()) {
			Integer i = (Integer) it.next();
			total += i.intValue();
		}

		System.out.println("총점 : " + total);
		System.out.println("평균 : " + (double) total / set.size());
		System.out.println("최고점수 : " + Collections.max(values));
		System.out.println("최하점수 : " + Collections.min(values));

	}
}
