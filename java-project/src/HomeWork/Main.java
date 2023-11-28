package HomeWork;

import java.util.Scanner;
import java.io.FileInputStream;

public class Main {
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("C:\\Users\\Playdata\\Desktop/input.txt"));
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[5][7];
		
		// 배열 입력받기
		for(int i = 0; i < arr.length; i ++ ) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}	
			System.out.println();
		}

		// 입력받은 배열 출력
		System.out.println("입력된 배열의 값:");
		int max = arr[0][0];
		int idx1 = 0;
		int idx2 = 0;
		for (int i = 0; i < arr.length; i++) {
		    for (int j = 0; j < arr[i].length; j++) {
		        System.out.print(arr[i][j] + "\t");
		        
		        //최대값
		        if( arr[0][j] > max ) {
		        	max = arr[0][j];
		        	idx1 = i + 1;
		        	idx2 = j;
		        }
		        
		        
		       
		    }
		    System.out.println();
		}
		System.out.println();
		System.out.println("최대값 : "  + max);
		System.out.println("idx : "  + idx1);
		System.out.println("idx : "  + idx2);
		
		
		
        
        
	}
}
