package day06.array03;

public class Quiz {
	public static void main(String[] args) {
		// 3차원 형태
		// 임의적인 데이터 입력 받아서 출력하기
		
//		Random rand = new Random();
		int[][][] a = new int[2][2][3]; // [면][행][열] 크기
		int x = 1;
		
		for( int i =0; i< a.length; i ++ ) { //면
			for (int j = 0; j < a[i].length; j++) { //행
				for (int k = 0; k < a[i][j].length; k++) { //열
						//a[i][j][k] = (int)(Math.random()*100);
						a[i][j][k] = x++ *2;
				} // k end
				System.out.println();
			} // j end
			System.out.println();
		} // i end
	}
}
