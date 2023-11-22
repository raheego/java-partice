package ex02.dataType;

public class MainEntry {
	public static void main(String[] args) {
		int su = 9; 
		char ch = 'A';
		String str = "korea";
		double pie = 3.14;
		float f = 12.45f; // float 구분하기 위해서 f
		long num = 9; 
		
		System.out.println(su+","+ch+","+str);
				
		System.out.println(su); // int 0 - 4byte
		System.out.println(ch); // 2bytpe
		System.out.println(str);
		System.out.println(pie);
		
		System.out.println("*");
		System.out.println("**");
		System.out.println("***");
		System.out.println("****");
		System.out.println("***");
		System.out.println("**");
		System.out.println("*");	
		
		int x = 2; // 기본 자료형
		Integer y = 2; //참조형
		x = y; //자동 형 변환
		
	}
}
