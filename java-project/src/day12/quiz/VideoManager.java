package day12.quiz;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


public class VideoManager extends Video {
	static HashMap<Integer, Video> map = new HashMap(); //비디오 객체
	
   private int num = 0;
	  
	//생성자 디폴트 함수 1번만 호출
	public VideoManager() {
		
	}
	
	
	// 비디오 대여정보 입력하기
	public void VideoAdd() { 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("비디오제목 >> ");
		title = sc.next();
		System.out.print("장르 >> ");
		category = sc.next();
		System.out.print("대여여부 >> ");
		lend = sc.next();
		System.out.print("대여자 >> ");
		lendName = sc.next();
		System.out.print("대여날짜 >> ");
		lendDate = sc.next();
		
		Video v = new Video(title, category, lend, lendName, lendDate);
		map.put(num++,v);
		System.out.println(num);
	}
	

	//출력
	 public void print() {
		Set set = map.entrySet();
        Iterator it = map.entrySet().iterator(); //Iterator를 사용하여 set의 엔트리를 순회할 준비

        while ( it.hasNext() ) {
			Map.Entry entry = (Map.Entry) it.next();
			
			int key = (int) entry.getKey();
			Video value = (Video) entry.getValue();
			
			System.out.println("Key: " + (key+1));
    		value.display(); 
    		
    		System.out.println();
        }
    }
}
