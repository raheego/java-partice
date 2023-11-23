package day04.BreakContinue;

public class Continue_Basic {
	public static void main(String[] args) {
		
		for( int i=1; i<11; i++ ) {
			if ( i == 7 ) break; // for 문은 조건을 만나면 증감처리되지만
			System.out.println(i);
		}
		
		System.out.println();
		for( int i=1; i<11; i++ ) {
			if ( i == 7 ) continue; // 조건을 만나면 튕겨나감(시작점으로 돌아감)
			System.out.println(i);
		}
		
		
		System.out.println();
		for( int i=1; i<11; i++ ) {
			if ( i % 2 != 0) continue; // 홀수를 구하려고 하는데 continue로 홀수를 제끼라는 뜻 => 그렇기에 짝수만 나옴 
			System.out.println(i);
		}
		
	}
}
