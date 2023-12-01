package back;

import java.util.Scanner;
import java.io.FileInputStream;

public class Main {
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("C:\\Users\\Playdata\\Desktop\\@java\\input/input.txt"));
		Scanner sc = new Scanner(System.in);
	
		int[] arr = new int[31];
		
		for(int i = 1; i < 29; i ++ ) {
			int n = sc.nextInt();
			arr[n] = 1;
		}
		
		for(int i = 1; i < arr.length; i ++ ) {
			if ( arr[i] != 1 ) System.out.print(i);
		}
	}
}