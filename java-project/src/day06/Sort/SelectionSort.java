package day06.Sort;

public class SelectionSort {
	public static void main(String[] args) {
		int[] a = { 7,3,2,5,8 };
		int tmp; 
		
		System.out.println("****** sort 전 출력 ******");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
		
		
		for (int i = 0; i < a.length -1; i++) {
			// 탐색을 진행하며, 가장 작은 값을 찾는다.
			for (int j = i+1; j < a.length; j++) {
				//탐색이 완료되면 가장 작은 값을 가장 앞의 원소와 가장 작은 원소의 위치를 바꾸어준
				if ( a[i] > a[j] ) { //교환
					tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;
				} 
				
			} // j end
		} // i end 
		
		
		//정렬 후 결과 출력
		System.out.println("\n****** sort 후 출력 ******");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
	}
}


