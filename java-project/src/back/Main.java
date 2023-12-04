package back;

//import java.io.FileInputStream;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
//		System.setIn(new FileInputStream("C:\\Users\\Playdata\\Desktop\\@java\\input/input.txt"));
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자입력");
		
		while(true){
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			
			if ( num1 > num2 ) {
				if( num1 % num2 == 0 ) System.out.println("multiple"); //배수
				 else System.out.println("neither");
			} else if ( num1 < num2 ) {
				if( num2 % num1 == 0 ) System.out.println("factor"); //약수
				 else System.out.println("neither");
			} else if ( num1 == 0 && num2 == 0 ){
				break;
			}
		}
	}
}