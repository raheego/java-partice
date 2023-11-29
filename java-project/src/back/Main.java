package back;

//import java.io.FileInputStream;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		//System.setIn(new FileInputStream("C:\\Users\\Playdata\\Desktop\\input/input.txt"));
		Scanner sc = new Scanner(System.in);
		
		System.out.println("배열의 크기를 입력해세요");
		int n = sc.nextInt();
		int[] arr = new int[n];
	
		System.out.println("배열 안 숫자를 넣으세요");
		for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
		sc.close();
	    
		System.out.println("입력수보다 작은 수를 출력하겠습니다.");
	    int x = sc.nextInt();
	    for(int i = 0; i < arr.length; i++) { 
	    	if ( arr[i] < x ) { 
	    		  System.out.print(arr[i] + " ");
	    	}
	    }
	}
}
