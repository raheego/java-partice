package day03;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		System.out.println("year = ");
		int year = new Scanner(System.in).nextInt();
		String result = null;
		boolean flag = false;
		
		if (( year % 4 == 0) && ( year % 100 == 0 || year % 400 == 0 ) ) {
			flag = true;
		}
		
		
		if (year % 4 == 0 ) {
			if ( year % 100 == 0 || year % 400 == 0 ) {
				flag = true; 
			}// if end 
		} // if end
		
		result = (flag == true) ? "윤년" : "평년";
		System.out.println(year + "연도" + result);
 	}
}

