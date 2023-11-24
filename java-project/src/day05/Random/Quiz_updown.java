package day05.Random;

import java.util.Scanner;

public class Quiz_updown {
	public static void main(String[] args) {
		//문제1] 업/다운 게임 프로그램 작성 (난수 이용)
		//1~100 숫자 중에서 임의의 난수 추출해 놓고, 사용자는 5번의 기회를줘서 입력 받는다.
		//그 입력 받은 숫자와 추출한 난수가 같은지를 판정하는 프로그램 작성
		
		Scanner sc = new Scanner(System.in);
		int randomNum = (int)(Math.random() * 100) + 1;

		System.out.println("1~100까지 숫자 중 하나를 입력하세요");

		for( int i=1; i <= 5; i ++ ) {
			int ans = sc.nextInt();

			if ( ans > randomNum ) {
				System.out.println("down");
			} else if ( ans < randomNum ) {
				System.out.println("up");
			} else if( ans == randomNum ) {
				System.out.println("정답");
			} 
			
			// 제한
			if ( i == 5 ) {
				System.out.printf("모든 기회를 소진했습니다. 정답은 %d",randomNum );
			}
		}
		
		/*
		 	int cnt = 5;
	        while(cnt > 0){
	            System.out.print("정답을 입력하세요.(1~100) (남은 횟수: " + cnt + ") : ");
	            input = sc.nextInt();
	
	            if(input < ans){
	                System.out.println("UP");
	            }
	            else if(input > ans){
	                System.out.println("DOWN");
	            }
	            else{
	                System.out.println("정답");
	                exit(0);
	            }
	
	            cnt--;
	        }
          	System.out.println("틀렸습니다.");
        	System.out.println("정답 : " + ans);
		*/
	}
}
