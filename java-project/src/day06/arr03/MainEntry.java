package day06.arr03;

public class MainEntry {
	public static void main(String[] args) {
		//1. 
		int[][][] a = new int[2][2][3]; // [면][행][열] 크기
		
		//2. 초기화 
		int[][][] a2 = new int[][][] { { {1,2,3},{4,5,6} }, { {1,2,3},{4,5,6} } , { {1,2,3},{4,5,6} } };
		
		//3. 생성및초기화
		int[][][] a3 = { { {1,2,3},{4,5,6} }, { {1,2,3},{4,5,6} } , { {1,2,3},{4,5,6} } };
		
		System.out.println("면의 길이 : " + a3.length); // 3
		System.out.println("행의 길이 : " + a3[0].length); //2
		System.out.println("열의 길이 : " + a3[0][0].length); //3
		System.out.println("열의 길이 : " + a3[1][0].length); //3
		
		
		//for문으로 보기
		for( int i =0; i < a3.length; i ++ ) { //면
			
			for (int j = 0; j < a3[i].length; j++) { //행
				
				for (int k = 0; k < a3[i][j].length; k++) {
					
					System.out.print(a3[i][j][k]+ "\t");
					
				} // k end
				System.out.println();
			} // j end
			System.out.println();
		} // i end
	}
}
