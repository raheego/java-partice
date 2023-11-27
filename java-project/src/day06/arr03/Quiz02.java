package day06.arr03;

public class Quiz02 {
	public static void main(String[] args) {
		// 주어진 2차원 배열 점수의 총점/평균 구하시오
		int  [][] score = { 
							{ 98, 98, 90, 92, 99 },
							{ 81, 82, 83, 84, 85 },
							{ 71, 73, 75, 77, 79 },
							{ 60, 65, 60, 65, 69 },
							{ 77, 74, 79, 78, 72 } 
						  };
	
		int total = 0;
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				total += score[i][j];
			}
			System.out.println();
		}
		double avg = (double)total/ (score.length * score[0].length);
		
		System.out.println("총점 : " + total); //총점 : 1966
		System.out.print("평균 : " + avg); //평균 : 78.64
	}
}