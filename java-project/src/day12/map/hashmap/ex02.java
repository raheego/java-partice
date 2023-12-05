package day12.map.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// key , value 한쌍으로
// (Set + list) 혼합형태
// key 순서없고 중복 없다. 
public class ex02 {
	static HashMap phoneBook = new HashMap();

	public static void main(String[] args) {
		addPhoneNo("친구", "이지은", "010-1004-1111");
		addPhoneNo("동료", "박과장", "010-2223-1452");
		addPhoneNo("친구", "아이유", "010-3234-7777");
		addPhoneNo("회사", "이대리", "010-3354-1169");
		addPhoneNo("회사", "박대리", "010-3476-5675");
		addPhoneNo("치킨", "010-8888-8888");
		printAll();
	}

	// 그룹을 추가하는 메소드
	//phonebook에 groupname 이 없으면 신규추가
	static void addGroup(String groupName) {
		if ( !phoneBook.containsKey(groupName) ) {
			phoneBook.put( groupName, new HashMap() ); // map in map
		}
	}

	// 그룹에 전화번호를 추가하는 메소드
	// 큰 카테고리를 나누는 것 
	public static void addPhoneNo(String groupName, String name, String tel) {
		addGroup(groupName);
		HashMap group = (HashMap) phoneBook.get(groupName); // 형변환 // 큰카테고리로 나눔 
		group.put(tel, name); // 이름은 중복되니깐 전화번호로 사용key값
	}

	//매개변수가 2개짜리
	public static void addPhoneNo(String name, String tel) {
		addPhoneNo("기타", name, tel);
	}

	// 전화번호 전체 출력 method
	static void printAll() {
		Set set = phoneBook.entrySet();  //System.out.println("set" + set); 동료={010-2223-1452=박과장} key value
		Iterator it = set.iterator();

		//map in map = outermap
		while (it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			
			//  010-2223-1452 박과장 key value
			// .getValue() 는 object 타입이기에 HashMap으로 형변환, addPhoneNo() 형변환과 유사
			Set subSet = ((HashMap)e.getValue()).entrySet(); 
						
			Iterator subIt = subSet.iterator();
			System.out.println(" * " + e.getKey() + "[" + subSet.size() + "]");
			
			//inner map
			while( subIt.hasNext() ) {
				Map.Entry subE = (Map.Entry)subIt.next();
				String telNo = (String)subE.getKey();
				String name = (String)subE.getValue();
				System.out.println(name + " , " + telNo);
			}// inner while end 
			
		} // while end
	}
}
