package back;

//import java.io.FileInputStream;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
//		System.setIn(new FileInputStream("C:\\Users\\Playdata\\Desktop\\@java\\input/input.txt"));
		Scanner sc = new Scanner(System.in);
			int x = sc.nextInt();
			int y = sc.nextInt();
			int w = sc.nextInt();
			int h = sc.nextInt();
			
			int minX = Math.min(x, w-x);
			int minY = Math.min(y, h-y);
			System.out.println(Math.min(minX, minY));
					
	}
}w