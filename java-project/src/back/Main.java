package back;

//import java.io.FileInputStream;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		//System.setIn(new FileInputStream("C:\\Users\\Playdata\\Desktop\\input/input.txt"));
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int x = sc.nextInt();
		int[] arr = new int[n];
	
		for( int i = 0; i < n; i++ ) {
            arr[i] = sc.nextInt();
        }
	    
		for( int i = 0; i < arr.length; i++ ) { 
	    	if( arr[i] < x ) { 
	    		  System.out.print(arr[i] + " ");
	    	}
	    }
	    
	    sc.close();
	}
}
