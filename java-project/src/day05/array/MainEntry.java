package day05.array;

public class MainEntry {
	public static void main(String[] args) {
		char[] ch; // 배열선언
		ch = new char[4]; // 배열생성, 메모릴에 할당
		
		char[] ch2 = new char[4]; // 선언 및 생성
		
		//배열 초기화
		ch[0] = 'J'; //char type 이니까 단일 '' 문자 
		ch[1] = 'A';
		ch[2] = 'V';
		ch[3] = 'A';
		
		System.out.println(ch[0]); //J
		System.out.println(ch[3]); //A
		
		for(int i=0; i<4; i++ ) {
			System.out.println("char["+i+"] ="+ch[i]);
		}
		System.out.println();
		System.out.println();
		
		
		// 초기화가 된 상태에서 초기값 지정
		char[] ch3 = { 'J','J','J','J','J'}; // char[] ch3 = new char[6]
		
		// 배열의 길이 length 이지만 '필드'
		System.out.println("배열의 길이 : " + ch3.length);
		for (int i=0; i< ch3.length; i++ ) {
			System.out.println("char3["+i+"] ="+ch3[i]);
		}
		
		
		String[] str = {"a","bgs","kbs","R"};
		for (int i=0; i< str.length; i++ ) {
			System.out.println("str["+i+"] ="+str[i]);
		}
		
		
		char[] ch4 = {};
		char[] ch5 = new char[]{};
		
	}
}
