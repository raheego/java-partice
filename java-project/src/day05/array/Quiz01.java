package day05.array;

public class Quiz01 {
	public static void main(String[] args) {
		// '7'의 갯수
		int[] su = {1,7,4,7,55,90,100,7,2,7,23};
		int count = 0;
		int findNum = 7;
		
		for(int i = 0; i < su.length; i++) {
			if( su[i] == findNum ) {
				 count++;
			}
		}
		System.out.println("count : " + count);
	}
}
