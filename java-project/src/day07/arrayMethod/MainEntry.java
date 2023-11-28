package day07.arrayMethod;

public class MainEntry {
	public static void main(String[] args) {
		int x = 3, y = 5; 
		
		int result = methodEx(x,y);
		System.out.println(result);
		
		int[] arrResult = methodEx2();
		
//		for (int i = 0; i < arrResult.length; i++) {
//			System.out.print(arrResult[i] + "\t");
//		}
		for (int item : arrResult) {
			System.out.print(item + " ");
		}
		
		
		// --- 2 차원 배열 ----
		System.out.println();
		System.out.println();
		
		int sum = 0;
		int[][] resultArr = meethodEx3();
		for(int i = 0; i < resultArr.length; i ++ ) {
			for (int j = 0; j < resultArr[i].length; j++) {
				System.out.println("result i j "+ resultArr[i][j] + "\t");
				sum += resultArr[i][j];
			}
			System.out.println();
		}
		System.out.println("result i a => sum : " + sum);
		
		
		
		// --- foreach ----
		System.out.println();
		System.out.println("----- foreach ---");
		
		for(int[] item : resultArr) {
			for(int arrItem : item ) {
				System.out.print(arrItem + "\t");
			}
			System.out.println();
		} // item end
		
		
		
		// --- foreach2 ----
		System.out.println();
		System.out.println("----- foreach + index ---");
		
		int index = 0; 
		for(int[] item : resultArr) {
			System.out.println("index : " + index++ ); //후위연산자
			System.out.println(item); // 데이터 들어 있는 주소 출력됨
			System.out.println(item.hashCode()); //메모리상의 주소(16진수형태)를 10진수 형태로 
		} // for item end 
		
	}
	
	private static int[][] meethodEx3() {
		int[][] arr = { {1,2,3,4} , {5,6,7,8} };
		return arr;
	}

	public static int[] methodEx2() {
		int[] arr = {1,2,3,4,5};
		return arr; // 힙 영역에 있는 위치값 주소ex 700 을  methodEx2(); 여기로 가져간다.
	}

	public static int methodEx(int x, int y) {
		return x+y;
	}
}
