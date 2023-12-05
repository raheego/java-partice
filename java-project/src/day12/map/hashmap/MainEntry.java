package day12.map.hashmap;

import java.util.HashMap;
import java.util.Scanner;

// key , value 한쌍으로
// (Set + list) 혼합형태
//Key는 중복을 허용하지 않으며, Value(값)는 중복을 허용
public class MainEntry {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		
		map.put("hello", "1234");
		map.put("judy", "1111");
//		map.put("judy", "1004");
		map.put("java", "3234");

		System.out.println(map);
		System.out.println("요소개수 : " + map.size() );
		
		Scanner sc = new Scanner(System.in);
	
		while(true) {
			System.out.println("id와 pwd를 입력해주세요");
			System.out.println("id : ");
			String id = sc.nextLine().trim();
			System.out.println("password : ");
			String password = sc.nextLine().trim();
			System.out.println();
			
			if( !map.containsKey(id) ) {
				System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요");
				continue;
			} else { 
				if ( !map.get(id).equals(password) ) {
					System.out.println("비밀번호가 틀렸습니다.");
				} else {
					//	System.out.println("비밀번호 일치");
					System.out.println(id + "님 반갑습니다.");
					break;
				}
			}
			
			
		} // while end
	}
}
