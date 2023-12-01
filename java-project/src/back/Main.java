package back;

import java.util.Scanner;
import java.io.FileInputStream;

public class Main {
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("C:\\Users\\Playdata\\Desktop\\@java\\input/input.txt"));
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[31];
		
		for( int i = 0; i < 29; i ++ ) {
			int num = sc.nextInt();
			System.out.println(arr[num]);
		}
	}
}