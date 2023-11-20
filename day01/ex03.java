public class EX03 {
	public static void main(String[] args) {
		// 1. 다음과 같이 정사각형을 출력하는 코드 작성
		/*
		----------
		 *****
		 *****
		 *****
		 *****
		 *****
		----------
		 */
		for (Integer i = 0; i < 5; i++) {
			System.out.println("*****");
		}
		System.out.println("------------");
		// 2. 다음과 같이 삼각형을 출력하는 코드 작성
		/*
		----------
		 *
		 **
		 ***
		 ****
		 *****
		----------
		 */
		for (Integer i = 1; i < 6; i++) {
			for (Integer j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("------------");

		// 3. 다음과 같이 삼각형을 출력하는 코드 작성
		/* 첫번째 반복문에서는 공백을 점점 줄어들게(4, 3, 2, 1, 0) 출력 / *을 2씩 커지면서 반복횟수만큼 반복해서 출력
		----------
			 *
			***
		   *****
		  ********
		 **********
		 ----------
		 */
		for(Integer i=1; i<6; i++) {
			for (Integer j=6; j > i+1; j--) {
				System.out.print(" ");
			}
			for (Integer k=0; k < (2 * i) - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("------------------------");
	}
}