package day04.BreakContinue;

public class Break_Basic {
	public static void main(String[] args) {
		
		/*
		label : 	// 식별자 :
		for( int i = 1; i < 6; i ++ ) {
			for( int j = 1; j < 6; j ++ ) {
				
				if( j == 3 ) break label;	
				//if( j == 3 ) continue label;	//3빠져, 
				
				//저 멀리 있는 것도 빠지게 하고 싶다면 이 조건을 만나면 같은 텍스트가 있는 위쪽 label 로 올라가 
				System.out.println("i :"+ i + ", j :" + j);
				
				
			 	//그냥 break 는 그 자체 멈춰버림 가장 가까이 있는 label에 가서 멈춰버림 
				
				
			} // inner
		} // outer
		*/
		
		// 1~ 100까지 중에서 짝수의 갯수 구하고 한화면에 10개 
		for(int i=1; i<=100; i++ ) {
			if ( i % 2 != 0 ) continue; //짝수가 아닌 수를 뽑으니 홀수지만 continue를 만나 짝수가 됨
			System.out.print(i+"\t");
			
			if ( i % 20 == 0 ) System.out.println(); // 2,4,6,8,10..20 해서 10개지만 1부터 20까지 20
		}
		
		
		
	}
}
